package chapterUDP_chatting;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessageAtest {
   private JTextField textField;
   private JTextArea textArea;
   DatagramSocket socket;
   DatagramPacket packet;
   InetAddress address = null;
   final int myport = 5000;
   final int otherPort = 6000;

   public MessageAtest() throws UnknownHostException, SocketException {
      MyFrame f = new MyFrame();
      address = InetAddress.getByName("192.168.0.224");
      socket = new DatagramSocket(myport);
   }

   public void process() {
      try {
         while (true) {
            byte[] buf = new byte[256];
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            textArea.append("RECEIVE "+ new String(buf) +"\n");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   class MyFrame extends JFrame implements ActionListener {

      public MyFrame() throws HeadlessException {
         super("MessageA");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         textField = new JTextField(30);
         textField.addActionListener(this);
         textArea = new JTextArea(10, 30);
         textArea.setEditable(false);
         add(textField, BorderLayout.PAGE_END);
         add(textArea, BorderLayout.CENTER);
         pack();
         setVisible(true);

      }

      @Override
      public void actionPerformed(ActionEvent e) {
         String s = textField.getText();
         byte[] buffer = s.getBytes();
         DatagramPacket packet = null;
         packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
         try {
            socket.send(packet);
         } catch (IOException e1) {
            e1.printStackTrace();
         }
         textArea.append("SEND" + s + "\n");
         textField.selectAll();
         textArea.setCaretPosition(textArea.getDocument().getLength());

      }// end of actinoPerformed

   }
   public static void main(String[] args) {
      try {
         MessageAtest mt =new MessageAtest();
         mt.process();
      } catch (UnknownHostException | SocketException e) {
         e.printStackTrace();
      } 
   }
}
