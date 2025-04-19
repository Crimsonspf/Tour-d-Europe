package trabalho;

import javax.swing.JOptionPane;

public class Principal {
	private static String[] nomesPaises = { "ALBANIA", "ALEMANHA", "AUSTRIA", "BELGICA", "BIELORUSSIA",
			"BOSNIA HERZEGOVINA", "BULGARIA", "CROACIA", "DINAMARCA", "ESLOVAQUIA", "ESLOVENIA", "ESPANHA", "ESTONIA",
			"FINLANDIA", "FRANCA", "GRECIA", "HOLANDA", "HUNGRIA", "ITALIA", "LETONIA", "LITUANIA", "LUXEMBURGO",
			"MACEDONIA DO NORTE", "MOLDAVIA", "MONACO", "MONTENEGRO", "POLONIA", "PORTUGAL", "REINO UNIDO", "ROMENIA",
			"RUSSIA", "SUECIA", "SUICA", "SERVIA", "TCHEQUIA", "UCRANIA" };

	private static int lerPais(String tipo) {
		
		while (true) {
			
			String entrada = tipo.trim();

				Pais pais = Pais.valueOf(entrada.toUpperCase());
				return pais.getValor();
			
		}
	}

	public static void main(String[] args) {
		int decisao = 0;
		Grafo g = new Grafo(Pais.values().length);
		criaArestas(g);

		
		
		do {
			int origem = lerPais(String.valueOf(JOptionPane.showInputDialog(null,
					"Escolha a Origem", 
					"Medidor de distância média das capitais Europeias",
					 3, null, nomesPaises, nomesPaises[0])));
			int destino = lerPais(String.valueOf(JOptionPane.showInputDialog(null,
					"Escolha o Destino", 
					"Medidor de distância média das capitais Europeias",
					 3, null, nomesPaises, nomesPaises[0])));

			ResultadoCaminho resultado = g.caminhoMinimo(origem, destino);

			String rotaRapida = "A rota mais rápida é: \n";
			for (Integer pais : resultado.getCaminho()) {
				rotaRapida+=Pais.values()[pais].name() + "(" + Pais.values()[pais].getCapitalPais() + ")" + " -> ";
			}
			rotaRapida+="\nDistância média: " + resultado.getDistanciaTotal() + "km";
			JOptionPane.showMessageDialog(null, rotaRapida,"Medidor de distância média das capitais Europeias",3);
			 decisao = JOptionPane.showConfirmDialog(null,"Deseja continuar",
			          "Medidor de distância média das capitais Europeias",JOptionPane.YES_NO_OPTION);

		}while(decisao==0);
	}

	public static void criaArestas(Grafo g) {

		// Adicionando as arestas (distÃ¢ncias)
		g.criaAresta(Pais.PORTUGAL.getValor(), Pais.ESPANHA.getValor(), 625);
		g.criaAresta(Pais.ESPANHA.getValor(), Pais.FRANCA.getValor(), 1270);
		g.criaAresta(Pais.FRANCA.getValor(), Pais.REINOUNIDO.getValor(), 450);
		g.criaAresta(Pais.FRANCA.getValor(), Pais.ITALIA.getValor(), 1420);
		g.criaAresta(Pais.FRANCA.getValor(), Pais.SUICA.getValor(), 580);
		g.criaAresta(Pais.FRANCA.getValor(), Pais.ALEMANHA.getValor(), 1050);
		g.criaAresta(Pais.FRANCA.getValor(), Pais.BELGICA.getValor(), 312);

		g.criaAresta(Pais.HOLANDA.getValor(), Pais.ALEMANHA.getValor(), 650);
		g.criaAresta(Pais.HOLANDA.getValor(), Pais.BELGICA.getValor(), 210);
		g.criaAresta(Pais.SUICA.getValor(), Pais.ITALIA.getValor(), 800);
		g.criaAresta(Pais.SUICA.getValor(), Pais.ALEMANHA.getValor(), 750);
		g.criaAresta(Pais.SUICA.getValor(), Pais.AUSTRIA.getValor(), 750);
		g.criaAresta(Pais.LUXEMBURGO.getValor(), Pais.ALEMANHA.getValor(), 740);
		g.criaAresta(Pais.LUXEMBURGO.getValor(), Pais.BELGICA.getValor(), 220);
		g.criaAresta(Pais.LUXEMBURGO.getValor(), Pais.BELGICA.getValor(), 380);
		g.criaAresta(Pais.ALEMANHA.getValor(), Pais.DINAMARCA.getValor(), 440);
		g.criaAresta(Pais.ALEMANHA.getValor(), Pais.POLONIA.getValor(), 570);
		g.criaAresta(Pais.ALEMANHA.getValor(), Pais.TCHEQUIA.getValor(), 350);
		g.criaAresta(Pais.ALEMANHA.getValor(), Pais.BELGICA.getValor(), 750);
		g.criaAresta(Pais.TCHEQUIA.getValor(), Pais.AUSTRIA.getValor(), 330);
		g.criaAresta(Pais.TCHEQUIA.getValor(), Pais.POLONIA.getValor(), 690);
		g.criaAresta(Pais.TCHEQUIA.getValor(), Pais.ESLOVAQUIA.getValor(), 330);
		g.criaAresta(Pais.ESLOVAQUIA.getValor(), Pais.POLONIA.getValor(), 530);
		g.criaAresta(Pais.ESLOVAQUIA.getValor(), Pais.UCRANIA.getValor(), 1100);
		g.criaAresta(Pais.POLONIA.getValor(), Pais.BIELORUSSIA.getValor(), 550);
		g.criaAresta(Pais.POLONIA.getValor(), Pais.UCRANIA.getValor(), 690);
		g.criaAresta(Pais.POLONIA.getValor(), Pais.LITUANIA.getValor(), 400);
		g.criaAresta(Pais.BIELORUSSIA.getValor(), Pais.LITUANIA.getValor(), 180);
		g.criaAresta(Pais.BIELORUSSIA.getValor(), Pais.LETONIA.getValor(), 470);
		g.criaAresta(Pais.BIELORUSSIA.getValor(), Pais.RUSSIA.getValor(), 720);
		g.criaAresta(Pais.LITUANIA.getValor(), Pais.LETONIA.getValor(), 300);
		g.criaAresta(Pais.ESTONIA.getValor(), Pais.LETONIA.getValor(), 310);
		g.criaAresta(Pais.AUSTRIA.getValor(), Pais.ESLOVAQUIA.getValor(), 80);
		g.criaAresta(Pais.ROMENIA.getValor(), Pais.UCRANIA.getValor(), 850);
		g.criaAresta(Pais.ROMENIA.getValor(), Pais.MOLDAVIA.getValor(), 470);
		g.criaAresta(Pais.FINLANDIA.getValor(), Pais.SUECIA.getValor(), 530);
		g.criaAresta(Pais.FINLANDIA.getValor(), Pais.RUSSIA.getValor(), 1100);
		g.criaAresta(Pais.RUSSIA.getValor(), Pais.ESTONIA.getValor(), 1000);
		g.criaAresta(Pais.RUSSIA.getValor(), Pais.LETONIA.getValor(), 950);
		g.criaAresta(Pais.ROMENIA.getValor(), Pais.SERVIA.getValor(), 600);
		g.criaAresta(Pais.ROMENIA.getValor(), Pais.MACEDONIADONORTE.getValor(), 750);
		g.criaAresta(Pais.ROMENIA.getValor(), Pais.BULGARIA.getValor(), 360);
		g.criaAresta(Pais.UCRANIA.getValor(), Pais.BIELORUSSIA.getValor(), 550);
		g.criaAresta(Pais.UCRANIA.getValor(), Pais.RUSSIA.getValor(), 850);
		g.criaAresta(Pais.UCRANIA.getValor(), Pais.MOLDAVIA.getValor(), 470);
		g.criaAresta(Pais.BOSNIAHERZEGOVINA.getValor(), Pais.MONTENEGRO.getValor(), 230);
		g.criaAresta(Pais.BOSNIAHERZEGOVINA.getValor(), Pais.SERVIA.getValor(), 200);
		g.criaAresta(Pais.DINAMARCA.getValor(), Pais.SUECIA.getValor(), 650);
		g.criaAresta(Pais.ITALIA.getValor(), Pais.AUSTRIA.getValor(), 1000);
		g.criaAresta(Pais.ITALIA.getValor(), Pais.ESLOVENIA.getValor(), 750);
		g.criaAresta(Pais.ESLOVENIA.getValor(), Pais.CROACIA.getValor(), 140);
		g.criaAresta(Pais.ESLOVENIA.getValor(), Pais.HUNGRIA.getValor(), 380);
		g.criaAresta(Pais.ESLOVENIA.getValor(), Pais.AUSTRIA.getValor(), 380);
		g.criaAresta(Pais.ESLOVENIA.getValor(), Pais.BOSNIAHERZEGOVINA.getValor(), 400);
		g.criaAresta(Pais.CROACIA.getValor(), Pais.SERVIA.getValor(), 400);
		g.criaAresta(Pais.CROACIA.getValor(), Pais.BOSNIAHERZEGOVINA.getValor(), 290);
		g.criaAresta(Pais.CROACIA.getValor(), Pais.HUNGRIA.getValor(), 350);
		g.criaAresta(Pais.SERVIA.getValor(), Pais.MONTENEGRO.getValor(), 450);
		g.criaAresta(Pais.SERVIA.getValor(), Pais.ROMENIA.getValor(), 600);
		g.criaAresta(Pais.SERVIA.getValor(), Pais.BULGARIA.getValor(), 400);
		g.criaAresta(Pais.SERVIA.getValor(), Pais.MACEDONIADONORTE.getValor(), 430);
		g.criaAresta(Pais.SERVIA.getValor(), Pais.KOSOVO.getValor(), 280);
		g.criaAresta(Pais.KOSOVO.getValor(), Pais.MONTENEGRO.getValor(), 250);
		g.criaAresta(Pais.KOSOVO.getValor(), Pais.ALBANIA.getValor(), 180);
		g.criaAresta(Pais.KOSOVO.getValor(), Pais.MACEDONIADONORTE.getValor(), 90);
		g.criaAresta(Pais.MONTENEGRO.getValor(), Pais.ALBANIA.getValor(), 170);
		g.criaAresta(Pais.GRECIA.getValor(), Pais.MACEDONIADONORTE.getValor(), 230);
		g.criaAresta(Pais.GRECIA.getValor(), Pais.BULGARIA.getValor(), 525);
		g.criaAresta(Pais.BULGARIA.getValor(), Pais.MACEDONIADONORTE.getValor(), 240);
		g.criaAresta(Pais.ALBANIA.getValor(), Pais.GRECIA.getValor(), 510);
		g.criaAresta(Pais.ALBANIA.getValor(), Pais.MACEDONIADONORTE.getValor(), 150);
		g.criaAresta(Pais.AUSTRIA.getValor(), Pais.HUNGRIA.getValor(), 250);
		g.criaAresta(Pais.HUNGRIA.getValor(), Pais.UCRANIA.getValor(), 1100);
		g.criaAresta(Pais.HUNGRIA.getValor(), Pais.ROMENIA.getValor(), 640);
		g.criaAresta(Pais.HUNGRIA.getValor(), Pais.SERVIA.getValor(), 320);
		g.criaAresta(Pais.NORUEGA.getValor(), Pais.SUECIA.getValor(), 530);
	}
}
