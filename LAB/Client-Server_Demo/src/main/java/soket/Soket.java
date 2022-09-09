package soket;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JTextPane;

public class Soket {

	private Socket socket;
	private JTextPane txtMessPane;
	private PrintWriter out;
	private BufferedReader reader;

	public Soket(Socket socket, JTextPane txtMessPane) throws IOException {
		this.socket = socket;
		this.txtMessPane = txtMessPane;

		out = new PrintWriter(socket.getOutputStream());
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		recive();
	}

	private void recive() {
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					try {
						String line = reader.readLine();
						if (line != null) {
							txtMessPane.setText(txtMessPane.getText() + "\n" + line);
						}
					} catch (Exception e) {

					}
				}
			}
		};
		thread.start();
	}

	public void send(String msg) {
		String st = txtMessPane.getText();
		txtMessPane.setText(st + "\nSent: " + msg);
		out.println(msg);
		out.flush();
	}

	private void close() {
		try {
			out.close();
			reader.close();
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
