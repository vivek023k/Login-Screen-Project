import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginScreen extends JFrame{
	LoginScreen(String v){
		super(v);
	}
	
			// Reffernce Variables..
		JLabel l1;
		JLabel l2;
		JLabel l3;
		JLabel l4;
		JTextField t1;
		JPasswordField t2;
		JButton b1;
		JButton b2;
		Cursor c1;
		JLabel img1;
		JLabel img2;
	
	void Compo(){
			
			// Object
		l1 = new JLabel("User Name");
		l2 = new JLabel("Password");
		l3 = new JLabel("Welcome To Hogwards");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JPasswordField();
		b1 = new JButton("Login");
		b2 = new JButton("Clear");
		c1 = new Cursor(HAND_CURSOR);
		img1 = new JLabel();
		img2 = new JLabel();
		ImageIcon ic1 = new ImageIcon("C:/Users/HP/Downloads/Downloads 1968 to 2025/Icon/User_name.png");
		ImageIcon ic2 = new ImageIcon("C:/Users/HP/Downloads/Downloads 1968 to 2025/Icon/Password.png");
		
			// Coponent's Locations
		Font f = new Font("Arial", Font.PLAIN, 20);
		l1.setBounds(765, 280, 150, 70); // user name
		l1.setFont(f);
		l2.setBounds(765, 320, 150, 70); // password
		l2.setFont(f);
		l3.setBounds(750, 30, 400, 100); // Main Title
		l3.setFont(l3.getFont().deriveFont(35f));
		l4.setBounds(880, 600, 100, 100); // Label 4
		t1.setBounds(900, 305, 133, 23);
		t1.setCursor(c1);
		t2.setBounds(900, 344, 133, 23);
		t2.setCursor(c1);
		b1.setBounds(805, 440, 100, 30); // login button
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.GRAY);
		b1.setCursor(c1);
		b2.setBounds(930, 440, 100, 30); // clear button
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.WHITE);
		b2.setCursor(c1);
		img1.setBounds(720,275,80,80);
		img1.setIcon(ic1);
		img2.setIcon(ic2);
		img2.setBounds(720,315,80,80);
		
			// Add Component's
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(new Buton1());
		b2.addActionListener(new Buton2());
		t1.addActionListener(new ActionListener(){	// Enter click Focus
			public void actionPerformed(ActionEvent a){
				t2.requestFocusInWindow();
			}
		});
		t2.addActionListener(new ActionListener(){	// Enter click Focus
			public void actionPerformed(ActionEvent a){
				b1.setBackground(Color.GREEN);
				b1.doClick();
				b1.setBackground(Color.GRAY);
			}
		});
		getRootPane().setDefaultButton(b2);
		b1.addMouseListener(new ColBut1());
		b2.addMouseListener(new ColBut2());
		add(img1);
		add(img2);
	}
	
	class Buton1 implements ActionListener{
		public void actionPerformed(ActionEvent a1){
			String x1 = t1.getText();
			String x2 = new String(t2.getPassword());
			
			if(x1.equals("Myname") && x2.equals("12112")){
				JOptionPane.showMessageDialog(null, "Login Sucessfull", "User-Login",JOptionPane.INFORMATION_MESSAGE);
			}
			
			else if(x1.trim().isEmpty() || x2.trim().isEmpty()){
				JOptionPane.showMessageDialog(null, "Please Enter Correctly Both Field ", "Alert",JOptionPane.WARNING_MESSAGE);
				t1.requestFocusInWindow();
			}
			
			else{
				JOptionPane.showMessageDialog(null, "Username or Password is Wrong", "User-Login", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	class Buton2 implements ActionListener{
		public void actionPerformed(ActionEvent a1){
			String x1 = t1.getText();
			String x2 = new String(t2.getPassword());
			t1.setText("");
			t2.setText("");
			l4.setText("");
		}
	}
	
	class ColBut1 implements MouseListener{
		 
		public void mouseClicked(MouseEvent e1){}
		public void mouseEntered(MouseEvent e1){}
		public void mousePressed(MouseEvent e1){
			b1.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent e1){
			b1.setBackground(Color.GRAY);
		}
		public void mouseExited(MouseEvent e1){}
	}
	class ColBut2 implements MouseListener{
		 
		public void mouseClicked(MouseEvent e1){}
		public void mouseEntered(MouseEvent e1){}
		public void mousePressed(MouseEvent e1){
			b2.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent e1){
			b2.setBackground(Color.GRAY);
		}
		public void mouseExited(MouseEvent e1){}
	}
	
	public static void main(String args[]){
		LoginScreen ls = new LoginScreen("Login Screen");
		ls.setSize(1920, 1080);
		ls.setResizable(false);
		ls.setLayout(null);
		ls.Compo();
		ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ls.setVisible(true);
	}
}