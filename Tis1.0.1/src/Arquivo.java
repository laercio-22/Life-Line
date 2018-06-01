import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Arquivo {
	Object data = LocalDate.now();
	
	public void salvarConsulta(String cpf,String sP,String sA,String dF) {
		try {
			FileOutputStream arq = new FileOutputStream(cpf+".txt", true);
			PrintWriter escrever = new PrintWriter(arq);
			escrever.println("Consulta do dia :"+data);
			escrever.println("sintomas prescritos:\t"+sP);
			escrever.println("Sintomas analizados:\t"+sA);
			escrever.println("Diagnostico:\t"+dF);
			escrever.close();
			arq.close();
			JOptionPane.showConfirmDialog(null, "ok");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Paciente inesistente");
		}
	}
}
