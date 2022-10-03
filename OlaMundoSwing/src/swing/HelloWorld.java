package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class HelloWorld extends JFrame {

	private JPanel contentPane;
	private JLabel lblMensagem;
	private JButton btnBotao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld frame = new HelloWorld();
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
	public HelloWorld() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 65, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(165, 105, 89, 23);
		getContentPane().add(btnNewButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensagem;
		lblMensagem = new JLabel("Mensagem");
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setBounds(116, 173, 182, 26);
		contentPane.add(lblMensagem);
		
		JButton btnBotao;
		btnBotao = new JButton("Clique aqui");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblMensagem.setText("Hello World!");
				
			}
		});
		btnBotao.setBounds(146, 67, 131, 38);
		contentPane.add(btnBotao);
	}
}
