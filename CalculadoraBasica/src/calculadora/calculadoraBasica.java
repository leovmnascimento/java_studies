package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.SpinnerNumberModel;

public class calculadoraBasica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraBasica frame = new calculadoraBasica();
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
	public calculadoraBasica() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Número 1:");
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(26, 49, 82, 14);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Número 2:");
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(155, 49, 82, 14);
		contentPane.add(lblNum2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(90, 181, 89, 23);
		contentPane.add(lblResultado);
		
		JSpinner txtNum1 = new JSpinner();
		txtNum1.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		txtNum1.setBounds(36, 74, 57, 20);
		contentPane.add(txtNum1);
		
		JSpinner txtNum2 = new JSpinner();
		txtNum2.setBounds(165, 74, 57, 20);
		contentPane.add(txtNum2);
		
		JLabel lblFrase = new JLabel("Frase");
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(10, 11, 251, 14);
		contentPane.add(lblFrase);
		
		lblFrase.setText("Indique os números da operação");
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getValue().toString());
				int num2 = Integer.parseInt(txtNum2.getValue().toString());
				int resultado = num1 + num2;
				
				lblResultado.setText(Integer.toString(resultado));
				
			}
		});
		btnSomar.setBounds(90, 130, 89, 23);
		contentPane.add(btnSomar);
		
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
