import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class TelaConsulta extends JFrame{
	
	/**
	 * author: Laercio Nazareno Neto
	 */
	private static final long serialVersionUID = 5974783926594300357L;

	Set<String> exames = new LinkedHashSet<String>();
	
	Color backBut = new Color(153,217,234);
	
	Color backgroud = new Color(218,243,247);
	
	JLabel iF = new JLabel("Informe o CPF do paciente:"), pE = new JLabel("Exames: "), textSP = new JLabel("Sintómas Préscritos"),
			textSA = new JLabel("Sinais analizados"), textDF = new JLabel("Diagnóstico final");
	
	JPanel campo1 = new JPanel(),campo2 = new JPanel(),campo3 = new JPanel()
			,campo4 = new JPanel(),campo5 = new JPanel(),nada = new JPanel(), menu = new JPanel();		
			
	JButton iP = new JButton("Informações do paciente"),concluir = new JButton("Concluir");
	
	JCheckBoxMenuItem sangue =new JCheckBoxMenuItem("Sangue");
	JCheckBoxMenuItem fezes =new JCheckBoxMenuItem("fezes");
	JCheckBoxMenuItem urina =new JCheckBoxMenuItem("urina");
	JCheckBoxMenuItem raioX =new JCheckBoxMenuItem("raioX");
	JCheckBoxMenuItem endoscopia =new JCheckBoxMenuItem("endoscopia");
	JCheckBoxMenuItem ultrasson =new JCheckBoxMenuItem("ultrasson");
	JCheckBoxMenuItem outro =new JCheckBoxMenuItem("Outros");
		
	JTextArea 	paciente = new JTextArea(1,11),campoSP = new JTextArea(5,5),
				campoSA = new JTextArea(5,5),campoDF = new JTextArea(5,5),campoOutros = new JTextArea(5,5);
	
	Border borda = BorderFactory.createLineBorder(Color.BLACK);
	
	public TelaConsulta() {
		super("Consulta");
				
		paciente.setBorder(new EmptyBorder(10,10,10,10));
		campoSA.setBorder(new EmptyBorder(10,10,10,10));
		campoSP.setBorder(new EmptyBorder(10,10,10,10));
		campoDF.setBorder(new EmptyBorder(10,10,10,10));
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		menu.add(raioX);
		menu.add(sangue);
		menu.add(urina);
		menu.add(fezes);
		menu.add(endoscopia);
		menu.add(ultrasson);
		menu.add(raioX);
		menu.add(outro);
		
		
		menu.setBackground(backgroud);
		campo1.setBackground(backgroud);
		campo2.setBackground(backgroud);
		campo3.setBackground(backgroud);
		campo4.setBackground(backgroud);
		campo5.setBackground(backgroud);
		
		iP.setBackground(backBut);
		concluir.setBackground(backBut);
		
		campoSA.setBackground(Color.lightGray);
		campoSP.setBackground(Color.lightGray);
		campoDF.setBackground(Color.lightGray);
		
		this.setLayout(new BorderLayout());
		
		
		campo1.setLayout(new GridLayout(0,3,6,6));
				
		campo1.add(textSP);campo1.add(textSA);campo1.add(textDF);
		
		campo1.add(campoSP);campo1.add(campoSA);campo1.add(campoDF);
		
		campo1.add(menu);
				
		campo2.add(concluir);
		
		campo4.add(iP);
		
		campo5.add(iF);campo5.add(paciente);
		
		
		Container janela = this.getContentPane();
		
		janela.add(campo1, BorderLayout.CENTER);
		janela.add(campo2, BorderLayout.SOUTH);
		janela.add(campo3, BorderLayout.NORTH);
		janela.add(campo4, BorderLayout.EAST);
		janela.add(campo5, BorderLayout.WEST);
		
		pack();
				
		concluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Arquivo salvar = new Arquivo();
				salvar.salvarConsulta(paciente.getText(),campoSP.getText(),campoSA.getText(),campoDF.getText());
			}
			
		});
		
	}
}
