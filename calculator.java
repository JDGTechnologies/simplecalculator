package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class calculator {

	private JFrame frmCalculatorByNoel;
	private JTextField num1;
	private JTextField num2;
	
	double first;
	double second;
	double answer;
	private JTextField ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculatorByNoel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorByNoel = new JFrame();
		frmCalculatorByNoel.setTitle("Calculator by Noel");
		frmCalculatorByNoel.setBounds(100, 100, 450, 300);
		frmCalculatorByNoel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorByNoel.getContentPane().setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(22, 31, 134, 28);
		frmCalculatorByNoel.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(260, 31, 134, 28);
		frmCalculatorByNoel.getContentPane().add(num2);
		num2.setColumns(10);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(num1.getText());
				second = Double.parseDouble(num2.getText());
				
				answer = first + second;
				
				ans.setText(Double.toString(answer));
				
				
				
			}
		});
		button.setBounds(147, 75, 117, 29);
		frmCalculatorByNoel.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(num1.getText());
				second = Double.parseDouble(num2.getText());
				
				answer = first - second;
				
				ans.setText(Double.toString(answer));
			}
		});
		button_1.setBounds(147, 101, 117, 29);
		frmCalculatorByNoel.getContentPane().add(button_1);
		
		JButton btnX = new JButton("x");
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(num1.getText());
				second = Double.parseDouble(num2.getText());
				
				answer = first * second;
				
				ans.setText(Double.toString(answer));
			}
		});
		btnX.setBounds(147, 129, 117, 29);
		frmCalculatorByNoel.getContentPane().add(btnX);
		
		JButton button_2 = new JButton("\\");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(num1.getText());
				second = Double.parseDouble(num2.getText());
			if(second != 0){
				answer = first/second;
				
				ans.setText(Double.toString(answer));
			}
			else{
				ans.setText("Err: Divide by 0");
			}
			}
		});
		button_2.setBounds(147, 159, 117, 29);
		frmCalculatorByNoel.getContentPane().add(button_2);
		
		ans = new JTextField();
		ans.setEnabled(false);
		ans.setEditable(false);
		ans.setBounds(147, 217, 117, 28);
		frmCalculatorByNoel.getContentPane().add(ans);
		ans.setColumns(10);
	}
}
