import java.awt.*;
import java.awt.event.*;

public class MyGUIProgram extends Frame implements ActionListener, WindowListener{
	Panel pnl;
	Label lblProblem;
	Label lblAnswer;
	TextField textAnswer;
	TextField textOutput;
	
	public MyGUIProgram() {
		setLayout(new FlowLayout());
		lblProblem = new Label("Your problem is: ");
		lblAnswer = new Label("Your answer is: ");
		textAnswer = new TextField();
		textAnswer.addActionListener(this);
		textOutput = new TextField();
		textOutput.setEditable(false);
		add(lblProblem);
		add(lblAnswer);
		add(textAnswer);
		add(textOutput);
		addWindowListener(this);
		setTitle("UIL Number Sense Practice");
		setSize(500,200);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyGUIProgram app = new MyGUIProgram();
	}
	
	
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);  // Terminate the program
	}
	@Override public void windowOpened(WindowEvent evt) { }
	@Override public void windowClosed(WindowEvent evt) { }

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int numberIn = Integer.parseInt(textAnswer.getText());
	    textAnswer.setText("");  // Clear input TextField
	    textOutput.setText(numberIn + ""); // Display sum on the output TextField
		
	}
}
