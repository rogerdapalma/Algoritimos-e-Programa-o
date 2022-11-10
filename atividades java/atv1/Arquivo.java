package ava1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo { 
    private String nome;
    private BufferedWriter bw;
    private BufferedReader br;
    
public Arquivo(String nome){
    this.nome = nome;
}

    Arquivo() {
        
    }

    public void gravar(String texto , String nomeArquivo) {
        try {
            bw = new BufferedWriter(new FileWriter(nomeArquivo +".txt"));
            bw.write(texto);
            bw.close();
        } catch (Exception e) {
        }
    }
    
    public String ler(String nomeArquivo){
        String conteudo = "";
        String texto = "";
        try {
            br = new BufferedReader(new FileReader(nomeArquivo + ".txt"));
            while((conteudo = br.readLine()) != null){
                texto = texto + conteudo +"\n";
            }
        } catch (Exception e) {
        }
        return texto;
    }
}
