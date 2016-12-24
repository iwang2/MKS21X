import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{

    private Container pane;

    private JButton f,c;
    private JLabel l;
    private JTextField t;

    public Window(){
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	f = new JButton("F --> C");
	f.addActionListener(this);
	f.setActionCommand("toC");
	c = new JButton("C --> F");
	c.addActionListener(this);
	c.setActionCommand("toF");
	l = new JLabel("Temperature",null,JLabel.CENTER);
	t = new JTextField(12);

	pane.add(f);
	pane.add(c);
	pane.add(t);
	pane.add(l);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toC")){
	    int s = Integer.parseInt(t.getText());
	    l.setText("Celsius: " + Temperature.FtoC(s));
	}
	if(event.equals("toF")){
	    int s = Integer.parseInt(t.getText());
	    l.setText("Fahrenheit: " + Temperature.CtoF(s));
	}
    }
    
    public static void main(String[]args){
	
	try {
	// Set System L&F
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} 
	catch (UnsupportedLookAndFeelException e) {
	    // handle exception
	}
	catch (ClassNotFoundException e) {
	    // handle exception
	}
	catch (InstantiationException e) {
	    // handle exception
	}
	catch (IllegalAccessException e) {
	    // handle exception
	}

	Window a = new Window();
	a.setVisible(true);
    }
}
