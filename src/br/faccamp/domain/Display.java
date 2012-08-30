package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {
	
	private CalculadoraGUI gui;

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
	}

	public void atualiza(String texto) {
		if (getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(texto);	
		}
		else {
			gui.atualizaDisplay((getConteudo()+texto));	
		}
		
	}

	private String getConteudo() {
		return gui.getDisplay();
	}

}
