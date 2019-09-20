package chapter18.ServerClient;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientTest extends JFrame implements ActionListener {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private JTextField field;
	private JTextArea area;

	public ClientTest() throws HeadlessException {
//		=======================
		setTitle("全辨悼");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		field = new JTextField(50);
		field.addActionListener(this);
		area = new JTextArea(10, 50);
		area.setAutoscrolls(false);
		
		area.setEditable(false);
		add(field, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
//		===============================
		try {
			socket = new Socket("192.168.0.228", 2200);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);
			area.append(br.readLine() + "\n");
			area.append(br.readLine() + "\n");

		} catch (IOException e) {
			System.out.println("家南立加 坷幅");
		}

	}// 积己磊

	@Override
	public void actionPerformed(ActionEvent e) {
		pw.println(field.getText());
		String data=null;
		try {
			data=br.readLine();
			area.append(data+"\n");
			data=br.readLine();
			area.append(data+"\n");
			field.setText("");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ClientTest ct=new ClientTest();
	}
}
