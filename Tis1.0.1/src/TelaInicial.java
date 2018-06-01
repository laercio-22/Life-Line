import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TelaInicial extends JFrame{
	
	/**
	 * author: Laercio Nazareno Neto
	 */
	private static final long serialVersionUID = 9163556035249649620L;

	Border borda  = BorderFactory.createRaisedBevelBorder();
	
	JButton crm = new JButton("CRM");
	
	JButton nc = new JButton("Nova consulta");
	
	JPanel superior = new JPanel();
	
	JPanel inferior = new JPanel();
	
	Color backgroud = new Color(218,243,247);
	
	Color backBut = new Color(153,217,234);
	
	ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpeg"));
	
	JLabel imagem = new JLabel(logo);
	
	public TelaInicial() {
		super("Médico");
		
		crm.setBackground(backBut);
		
		nc.setBackground(backBut);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout( new BorderLayout());
		
		Container janela = this.getContentPane();
		
		superior.setLayout(new GridLayout(0,7));
		
		janela.setBackground(backgroud);
		
		inferior.setBackground(backgroud);
		
		superior.setBackground(backgroud);
		
		superior.add(crm, BorderLayout.EAST);
		
		inferior.add(nc, BorderLayout.CENTER);
		
		janela.add(imagem);
		
		janela.add(inferior,BorderLayout.SOUTH);
		
		janela.add(superior,BorderLayout.NORTH);
		
		crm.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInputDialog(null,"Informe o seu CRM");
			}
			
		});
		
		nc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				TelaConsulta proxima = new TelaConsulta(); 
				proxima.setVisible(true);
			}
		});
		
		pack();
	}
}
