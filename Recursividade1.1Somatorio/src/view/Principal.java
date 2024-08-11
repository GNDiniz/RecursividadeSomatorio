package view;

import controller.SomatorioController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		SomatorioController sc = new SomatorioController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro natural: "));
		int somatorio = sc.somatorio(num);
		System.out.println("A soma dos "+num+" primeiros números naturais é igual a: "+somatorio);

	}

}