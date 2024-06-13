package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
	
	About() {
		setBounds(400,100,600,500);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
		Image i2 = i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel headerIcon = new JLabel(i3);
		headerIcon.setBounds(70,40,400,80);
		add(headerIcon);
		
		
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
		Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel Icon = new JLabel(i6);
		Icon.setBounds(50,120,70,70);
		add(Icon);
		
		
		JLabel text = new JLabel("<html>Microsoft Windows <br>Version 22H2(OS Build 19045.2846)<br>© Microsoft Corportaion. All rights reserved.<br><br>"
				+ "The Windows 10 Pro operationg system and its user interface <br> are protected by trademark and other pending or existing <br> intellectual property rights in the United States and other countries/regions. </html>");
		text.setBounds(130,60,500,300);
		text.setFont(new Font("TIMES_NEW_ROMAN", Font.PLAIN, 16));
		add(text);
		
		JButton b1 = new JButton("Ok");
		b1.setBounds(500,350,70,25);
		b1.setBackground(Color.white);
		b1.setFocusPainted(false);
		b1.addActionListener(this);
		add(b1);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}
	
	public static void main(String[] args) {
		new About();
	}

}
