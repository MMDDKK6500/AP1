package br.dev.mmddkk.view;

import javax.swing.JOptionPane;

public class JOptionPane_Ex1 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome: ");
        String natural = JOptionPane.showInputDialog("Informe a naturalidade: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ").replace(",", "."));
        
        JOptionPane.showMessageDialog(
                null, "\nNome: " + nome
                + "\nNatural de: " + natural
                + "\nIdade: " + idade
                + "\nAltura: " + altura,
                "Informação",
                JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
