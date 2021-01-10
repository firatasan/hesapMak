package hesapMak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frm1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int s1,s2,sonuc, m;
	int islem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm1 frame = new frm1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		textField.setBounds(10, 11, 268, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 121, 59, 36);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(79, 121, 55, 36);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(144, 121, 62, 36);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 168, 59, 36);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(79, 168, 57, 36);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(144, 168, 62, 36);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 215, 59, 36);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(79, 215, 55, 36);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(144, 215, 62, 36);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(10, 262, 124, 36);
		contentPane.add(btn0);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 3;
				textField.setText("");
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(216, 121, 62, 36);
		contentPane.add(btnX);
		
		JButton btnMns = new JButton("-");
		btnMns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 2;
				textField.setText("");
				
			}
		});
		btnMns.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMns.setBounds(216, 168, 62, 36);
		contentPane.add(btnMns);
		
		JButton btnPls = new JButton("+");
		btnPls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 1;
				textField.setText("");
				
				
			}
		});
		btnPls.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPls.setBounds(216, 215, 62, 36);
		contentPane.add(btnPls);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s2 = Integer.parseInt(textField.getText());
				if (islem==1) {sonuc=s1+s2;
				textField.setText(Integer.toString(sonuc));
				}
				else if (islem==2) {sonuc=s1-s2;
				textField.setText(Integer.toString(sonuc));}
				else if (islem==3) {sonuc=s1*s2;
				textField.setText(Integer.toString(sonuc));}
				else if (islem==4) {sonuc=s1/s2;
				textField.setText(Integer.toString(sonuc));}
			}
		});
		btnEql.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEql.setBounds(216, 262, 62, 36);
		contentPane.add(btnEql);
		
		JButton btnBl = new JButton("/");
		btnBl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 4;
				textField.setText("");
				
			}
		});
		btnBl.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBl.setBounds(216, 74, 62, 36);
		contentPane.add(btnBl);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(10, 74, 59, 36);
		contentPane.add(btnClear);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				m = Integer.parseInt(textField.getText());
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnM.setBounds(79, 74, 55, 36);
		contentPane.add(btnM);
		
		JButton btnNokta = new JButton(",");
		btnNokta.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNokta.setBounds(144, 262, 62, 36);
		contentPane.add(btnNokta);
		
		JButton btnM2 = new JButton("M+");
		btnM2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(Integer.toString(m));
			}
		});
		btnM2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnM2.setBounds(144, 74, 62, 36);
		contentPane.add(btnM2);
	}
}
