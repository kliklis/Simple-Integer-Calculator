
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class GUI extends JFrame {
//1 dhlwsh
	private JButton PLUS,MINUS,MULTIPLE,DIVIDE,MODULO,POWER,C,i;
	private JPanel panel;
	private JPanel up;
	private JPanel screen;
	private JPanel center;
	private JPanel down;
	private BorderLayout base;
	private JTextArea result;
	private JTextField tf,tf2;
	private JLabel R;
	
	public GUI(){
		
		
//2	dhmiourgia
	PLUS=new JButton("+");
	MINUS=new JButton("-");
	MULTIPLE=new JButton("*");
	DIVIDE=new JButton("/");
	MODULO=new JButton("%");
	POWER=new JButton("^");
	C=new JButton("C");
	i=new JButton("i");
	result=new JTextArea();
	tf=new JTextField("x");
	tf2=new JTextField("y");
	R=new JLabel("Result:");
//3	pros8esh sto panel
	panel=new JPanel();
	up=new JPanel();
	center=new JPanel();
	down=new JPanel();
	//screen=new JPanel();
	base = new BorderLayout();
	
	up.add(tf);
	up.add(tf2);
	up.add(R);
	up.add(result);
	center.add(PLUS);
	center.add(MINUS);
	center.add(MULTIPLE);
	center.add(DIVIDE);
	down.add(MODULO);
	down.add(POWER);
	down.add(C);
	down.add(i);
	
	panel.setLayout(base);
	panel.add(up, BorderLayout.NORTH);
	//panel.add(screen, BorderLayout.CENTER);
	panel.add(center, BorderLayout.CENTER);
	panel.add(down, BorderLayout.SOUTH);
	
	tf.setColumns(5);
	tf2.setColumns(5);
	
//4	pros8esh sto para8yro
	this.setContentPane(panel);
	
	
	//listeners
//a
	ButtonListener listener = new ButtonListener();
//b	
	PLUS.addActionListener(listener);
	
	ButtonListener2 listener2 = new ButtonListener2();
	MINUS.addActionListener(listener2);
	
	ButtonListener3 listener3 = new ButtonListener3();
	C.addActionListener(listener3);
	
	ButtonListener4 listener4 = new ButtonListener4();
	MULTIPLE.addActionListener(listener4);
	
	ButtonListener5 listener5 = new ButtonListener5();
	DIVIDE.addActionListener(listener5);
	
	ButtonListener6 listener6 = new ButtonListener6();
	MODULO.addActionListener(listener6);
	
	ButtonListener7 listener7 = new ButtonListener7();
	POWER.addActionListener(listener7);
	
	ButtonListener8 listener8 = new ButtonListener8();
	i.addActionListener(listener8);
	
	//instructions
	PLUS.setToolTipText("x+y");
	MINUS.setToolTipText("x-y");
	MULTIPLE.setToolTipText("x*y");
	DIVIDE.setToolTipText("x/y");
	MODULO.setToolTipText("x%y");
	POWER.setToolTipText("x^y");
	C.setToolTipText("Clear");
	i.setToolTipText("Info");
	
	//window definition
	this.setVisible(true);
	this.setSize(400,200);
	this.setTitle("Simple (Integer) Calculator");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//focus code
	tf.addFocusListener(new FocusListener() {
		public void focusGained(FocusEvent e) {
		    tf.setText(""); 
		}
		public void focusLost(FocusEvent e) {
			if(tf.getText().trim().length()==0)
			tf.setText("x");   }
		});  
	
	tf2.addFocusListener(new FocusListener() {
		public void focusGained(FocusEvent e) {
		    tf2.setText(""); 
		}
		public void focusLost(FocusEvent e) {
			if(tf2.getText().trim().length()==0)
			tf2.setText("y");  }
		});
	
}

	//PLUS button
//c	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		int z;
//d		
		//if(!SwingUtilities.isEventDispatchThread()){		
		z = Integer.parseInt(tf.getText()) + Integer.parseInt(tf2.getText()); 	
		result.append(String.valueOf(z));
	  //}
		}	
	}
	//MINUS button
	class ButtonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		int z;
		//if(!SwingUtilities.isEventDispatchThread()){
		z = Integer.parseInt(tf.getText()) - Integer.parseInt(tf2.getText()); 	
		result.append(String.valueOf(z));
	  //}
		}	
	}
	//C button
	class ButtonListener3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {	
		result.setText("");
		tf.setText("");
		tf2.setText("");
		}	
	}
	//MULTIPLE button
	class ButtonListener4 implements ActionListener {
			public void actionPerformed(ActionEvent event) {
			int z;
	//d		
			//if(!SwingUtilities.isEventDispatchThread()){		
			z = Integer.parseInt(tf.getText()) * Integer.parseInt(tf2.getText()); 	
			result.append(String.valueOf(z));
		  //}
			}	
		}
	//DIV button
	class ButtonListener5 implements ActionListener {
			public void actionPerformed(ActionEvent event) {
			int z;
			//if(!SwingUtilities.isEventDispatchThread()){		
			z = Integer.parseInt(tf.getText()) / Integer.parseInt(tf2.getText()); 	
			result.append(String.valueOf(z));
			  //}
				}	
			}
	//MOD button	
	class ButtonListener6 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		int z;
		//if(!SwingUtilities.isEventDispatchThread()){		
		z = Integer.parseInt(tf.getText()) % Integer.parseInt(tf2.getText()); 	
		result.append(String.valueOf(z));
		  //}
			}	
		}
	//POWER button
	class ButtonListener7 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		int z;	
		//if(!SwingUtilities.isEventDispatchThread()){		
		z = (int) Math.pow(Integer.parseInt(tf.getText()), Integer.parseInt(tf2.getText())); 	
		result.append(String.valueOf(z));
		  //}
			}	
		}
	//INFO button
	class ButtonListener8 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "This is a Simple (Integer) Calculator, made by Kostas Klimantakis.");
		
			}	
		}
	
}