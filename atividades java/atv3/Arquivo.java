package ava3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {


    public static ArrayList ler(String nomeArq, int valorResto) throws IOException {
        String conteudo = "";
        String texto = "";
        ArrayList<String> lista = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("tabela.txt"));
            int contador = 0;
            while ((conteudo = br.readLine()) != null) {

                contador++;
                if (contador % 2 == valorResto) {
                    lista.add(conteudo);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
}