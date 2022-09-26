package prova;

import javax.swing.JOptionPane;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public String cpf;
    public String cidade;
    public String nacionalidade;
    public String idade;
    public String sexo;
    public String senha;
    public String email;
    public String celular;
    public String profissao;

    @Override
    public String toString() {
        return "nome:" + nome + "," + "sobrenome: " + sobrenome + "," + "cpf:" + cpf + "," + "cidade: " + cidade + "," + "nacionalidade : " + nacionalidade + "," + "idade: " + idade + "," + "sexo :" + sexo + "," + "senha : " + senha + "," + "email: " + email + "," + "celular : " + celular + "," + "profissao: " + profissao + ",";

    }
}
