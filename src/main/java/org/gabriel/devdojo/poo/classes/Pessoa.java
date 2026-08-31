package org.gabriel.devdojo.poo.classes;

public class Pessoa {
    public String nomePessoa;
    public int idadePessoa;
    public char sexoPessoa;

    private void metodoPrivado(){
        System.out.println("Sou um método PRIVADO e somente sou acessível dentro dessa classe, fora dela não é possível me chamar");
    }

    public void metodoPublico(){
        System.out.println("Sou um método PÚBLICO e sou acessível dentro dessa classe, fora dela, dentro de outros 'packages' e subclasses." +
                " Podem me chamar de qualquer lugar!");
    }

    protected void metodoProtegido(){
        System.out.println("Sou um método PROTEGIDO e somente sou acessível dentro dessa classe, das classes de mesmo 'package' e subclasses herdadas." +
                " Fora desse pacote não é possível me chamar a não ser que seja em uma classe filha!");
    }

    void metodoDefault(){
        System.out.println("Sou um método DEFAULT e somente sou acessível dentro dessa classe e dentro de classe de mesmo pacote. Qualquer acesso fora de" +
                " /classes  gerará erro de compilação e acesso!");
    }
}
