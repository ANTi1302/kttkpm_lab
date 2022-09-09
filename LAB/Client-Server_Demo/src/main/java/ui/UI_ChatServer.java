package ui;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.BasicConfigurator;

import soket.Soket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UI_ChatServer extends JFrame implements ActionListener {
	private DataInputStream in;
	private DataOutputStream out;
	JButton btnSend1, btnSend;
	JTextPane text;
	JTextField mess1, mess;
	private Soket mSocket;

	public UI_ChatServer() throws NamingException, JMSException {
		// thiết lập môi trường cho JMS
		BasicConfigurator.configure();
		// thiết lập môi trường cho JJNDI
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		// tạo context
		Context ctx = new InitialContext(settings);
		// lookup JMS connection factory
		Object obj = ctx.lookup("TopicConnectionFactory");
		ConnectionFactory factory = (ConnectionFactory) obj;
		// tạo connection
		Connection con = factory.createConnection("admin", "admin");
		// nối đến MOM
		con.start();
		// tạo session
		Session session = con.createSession(/* transaction */false, /* ACK */Session.CLIENT_ACKNOWLEDGE);
		// tạo consumer
		Destination destination = (Destination) ctx.lookup("dynamicTopics/thanthidet");
		MessageConsumer receiver = session.createConsumer(destination);
		// receiver.receive();//blocked method
		// Cho receiver lắng nghe trên queue, chừng có message thì notify
		receiver.setMessageListener(new MessageListener() {

			// có message đến queue, phương thức này được thực thi
			public void onMessage(Message msg) {// msg là message nhận được
				try {
					if (msg instanceof TextMessage) {
						TextMessage tm = (TextMessage) msg;
						String txt = tm.getText();
						System.out.println("XML= " + txt);
						text.setText(txt);
						msg.acknowledge();// gửi tín hiệu ack
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Chat Server");
		setResizable(false);
		setVisible(true);

		JPanel pnlNorth;
		add(pnlNorth = new JPanel(), BorderLayout.NORTH);
		pnlNorth.setPreferredSize(new Dimension(0, 500));
		pnlNorth.setBorder(BorderFactory.createTitledBorder("Chat"));
		pnlNorth.setLayout(null); // Absolute layout
		text = new JTextPane();
		pnlNorth.add(text);
		int w1 = 100, w2 = 760, h = 450;
		text.setBounds(10, 20, w2, h);

		JPanel pnlSouth;
		//
		add(pnlSouth = new JPanel(), BorderLayout.SOUTH);
		pnlSouth.setPreferredSize(new Dimension(0, 500));
		pnlSouth.setBorder(BorderFactory.createTitledBorder("Enter Messenge"));
		pnlSouth.setLayout(null); // Absolute layout
//		mess = new JTextField("9090");
//		pnlSouth.add(mess);

//		btnSend = new JButton("Listen");
//		pnlSouth.add(btnSend);
		int w11 = 100, w22 = 760, hh = 450;
//		mess.setBounds(10, 350, 600, 50);
//		btnSend.setBounds(620, 350, 150, 50);

		mess1 = new JTextField();
		pnlSouth.add(mess1);

		btnSend1 = new JButton("Send");
		pnlSouth.add(btnSend1);
		int w111 = 100, w221 = 760, hh1 = 450;
		mess1.setBounds(10, 430, 600, 50);
		btnSend1.setBounds(620, 430, 150, 50);

		btnSend1.addActionListener(this);
//		btnSend.addActionListener(this);

//	
//				
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			UI_ChatServer mygui;
			try {
				mygui = new UI_ChatServer();
				mygui.setVisible(true);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object sou = e.getSource();
		if (sou.equals(btnSend)) {
//			
//			try {
//				int port= Integer.parseInt(mess.getText());
//				ServerSocket serverSocket= new ServerSocket(port);
//				
//				Thread th= new Thread() {
//					public void run() {
//						 try {
//							 text.setText(text.getText()+ "\nListening...");
//							 Socket soket= serverSocket.accept();
//							mSocket= new Soket(soket, text);
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					
//
//					}
//				};
//				th.start();
//				
//				
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

		} else if (sou.equals(btnSend1)) {
//			if (mess1.getText().equals("")) {
//				return;
//			}
//			mSocket.send(mess1.getText());

//			if (mess1.getText().equals("")) {
//				return;
//			}
//			mSocket.send(mess1.getText());
			// thiết lập môi trường cho JMS logging
			// tạo connection

			BasicConfigurator.configure();
			// thiết lập môi trường cho JJNDI
			Properties settings = new Properties();
			settings.setProperty(Context.INITIAL_CONTEXT_FACTORY,
					"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
			settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
			// tạo context
			Context ctx;
			try {
				ctx = new InitialContext(settings);

				// lookup JMS connection factory
				Object obj = ctx.lookup("TopicConnectionFactory");
				ConnectionFactory factory = (ConnectionFactory) obj;
				Connection con = factory.createConnection("admin", "admin");
				// nối đến MOM
				con.start();

				// tạo session
				Session session = con.createSession(/* transaction */false, /* ACK */Session.AUTO_ACKNOWLEDGE);
				Destination destination = (Destination) ctx.lookup("dynamicTopics/anhthune");
				// tạo producer
				MessageProducer producer = session.createProducer(destination);
				// Tạo 1 message

				Message msg = session.createTextMessage(mess1.getText());
				// gửi
				producer.send(msg);
				// shutdown connection
//				session.close();
//				con.close();
				text.setText("\nSent: " + msg.getJMSDestination().toString()+" "+ mess1.getText());
//				text.setText(mess1.getText());
//						mSocket.send(mess1.getText());
				System.out.println("Finished...");
			} catch (NamingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JMSException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
