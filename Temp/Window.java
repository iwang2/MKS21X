import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame{

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
	c = new JButton("C --> F");
	l = new JLabel("",null,JLabel.CENTER);
	t = new JTextField(12);

	pane.add(f);
	pane.add(c);
	pane.add(l);
	pane.add(t);
    }

    public static void main(String[]args){
	Window a = new Window();
	a.setVisible(true);
    }
}
