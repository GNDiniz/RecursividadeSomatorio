package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int num) {
		//condição de parada
		if (num <= 0) {
			return 0;
		} else {
			int res = num;
		//A função deverá retornar a soma do resultado com o número imediatamente anterior
		    return res + somatorio(num - 1);
		}
		
	}

}
