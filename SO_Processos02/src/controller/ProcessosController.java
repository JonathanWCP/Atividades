package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class ProcessosController {

	public ProcessosController() {
		super();
	}

	public String so() {
		String so = System.getProperty("os.name");
		return so;
	}

	public void chamaProcesso(String processo) {
		StringBuffer buffer = new StringBuffer();
		if (System.getProperty("os.name").contains("Windows")) {

			buffer.append("cmd /c ");
			buffer.append(processo);

			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	public void leProcesso(String so) {
		String processo = "TASKLIST /FO TABLE";
		try {
			Process pr = Runtime.getRuntime().exec(processo);
			InputStream fluxo = pr.getInputStream(); // vários sei lá o que dentro do pr-processo
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine(); // usa o buffer para ler uma linha e joga na mesma
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	public void mataProcesso(String so, String info) { // matar processo por PID e pelo nome do processo
		StringBuffer buffer = new StringBuffer();
		String cmdNome = "TASKKILL /IM "; // matar pelo nome
		String cmdPid = "TASKKILL /PID "; // matar pelo PID
		int pid = 0;

		try {
			pid = Integer.parseInt(info);
			buffer.append(cmdPid);
			buffer.append(pid);
		} catch (NumberFormatException e) {
			if (!info.contains(".exe")) {
				info += ".exe";
			}
			buffer.append(cmdNome);
			buffer.append(info);
		} finally {
			chamaProcesso(buffer.toString());
		}
	}
}
