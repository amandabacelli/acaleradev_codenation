package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivo {
	
	public static List<Jogador> lerCSV() {

        String arquivo = "C:/Users/Cliente/codenation/java-3/src/main/resources/data.csv";
        String linha = "";

        List<Jogador> jogadoresLista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            br.readLine(); //ler a primeira linha
            while ((linha = br.readLine()) != null) {

                // use comma as separator
                String[] jogador = linha.split(",");

                if (jogador.length > 0) {
                    Jogador jog = new Jogador(jogador[0],
                            jogador[1],
                            jogador[2],
                            jogador[3],
                            jogador[6],
                            jogador[8],
                            jogador[14],
                            jogador[17],
                            jogador[18]);
                    jogadoresLista.add(jog);
                }
            }
        } catch (IOException e) {
        	
        }

        return jogadoresLista;
    }

}
