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

import soket.Soket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UI_ChatClient extends JFrame implements ActionListener {
	private DataInputStream in;
	private DataOutputStream out;
	JButton btnSend1, btnSend;
	JTextField mess, mess1, mess2;
	Soket mSocket;
	JTextPane text;
	public UI_ChatClient() {

		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Chat Client");
		setResizable(false);
		setVisible(true);
		
		JPanel pnlNorth;
		add(pnlNorth = new JPanel(), BorderLayout.NORTH);
		pnlNorth.setPreferredSize(new Dimension(0, 500));
		pnlNorth.setBorder(BorderFactory.createTitledBorder("Chat"));
		pnlNorth.setLayout(null); //Absolute layout
		 text= new JTextPane();
		pnlNorth.add(text);
		int w1 = 100, w2 = 760, h = 450;
		text.setBounds(10, 20, w2, h); 
		
		JPanel pnlSouth;
		//
		add(pnlSouth = new JPanel(), BorderLayout.SOUTH);
		pnlSouth.setPreferredSize(new Dimension(0, 500));
		pnlSouth.setBorder(BorderFactory.createTitledBorder("Enter Messenge"));
		pnlSouth.setLayout(null); //Absolute layout
		 mess= new JTextField("192.168.56.1");
		pnlSouth.add(mess);
		mess2= new JTextField("9090");
		pnlSouth.add(mess2);
		 btnSend= new JButton("Connect");
		pnlSouth.add(btnSend);
		int w11 = 100, w22 = 760, hh = 450;
		mess.setBounds(10, 350, 300, 50); 
		mess2.setBounds(320, 350, 300, 50); 
		btnSend.setBounds(620, 350, 150, 50); 
		
		
		 mess1= new JTextField();
		pnlSouth.add(mess1);
		
		 btnSend1= new JButton("Send");
		pnlSouth.add(btnSend1);
		int w111 = 100, w221 = 760, hh1 = 450;
		mess1.setBounds(10, 430, 600, 50); 
		btnSend1.setBounds(620, 430, 150, 50); 
		
		btnSend1.addActionListener(this);
		btnSend.addActionListener(this);
		
//				
			}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			UI_ChatClient mygui = new UI_ChatClient();
			mygui.setVisible(true);
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object sou= e.getSource();
		if (sou.equals(btnSend)) {
			
			try {
				int port= Integer.parseInt(mess2.getText());
				Socket socket= new Socket(mess.getText(), port);
				
				mSocket= new Soket(socket, text);
				text.setText(text.getText()+ "\nConnect...");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (sou.equals(btnSend1)) {
			if (mess1.getText().equals("")) {
				return;
			}
			mSocket.send(mess1.getText());
		}

}}
