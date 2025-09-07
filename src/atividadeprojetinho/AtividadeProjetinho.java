/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeprojetinho;

import javax.swing.*;
import java.util.Scanner;
//import javax.swing.JFrame;

/**
 *
 * @author mathi
 */
public class AtividadeProjetinho {

    /**
     * @param args the command line arguments
     */
    public class InterfaceGrafica extends JFrame{
        public InterfaceGrafica(){
            super.setTitle("Calcula faixa etária de idade"); //define o titulo da janela
            setSize(700,600);//tamanho da janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// quando clicar no "X" a janela fecha
            setLocationRelativeTo(null);// esse centraliza a janels na tela
        }
        private void ComponentesDaInterface(){
            JPanel painel = new JPanel(); //O JPanel vai criar tipo um container para que você possa
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int anoAtual = 2025;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu ano de nascimento aqui:");
        int anoNas = teclado.nextInt();
        
        int idade = calcularIdade(anoNas, anoAtual);
        
        boolean maior = maiorDeIdade(idade);
        boolean idoso = terceiraIdade(idade);
        
        if (maior == true){
            System.out.println("Maior de idade");
        }else if(idoso == true){
            System.out.println("Idoso");
        }else{
            System.out.println("Menor de idade");
        }
        
    } //fim da main
    
    //calcula a idade digitada
    public static int calcularIdade(int anoNas, int anoAtual){
            int idade = anoAtual - anoNas;
            return idade;
        }
    
    //verifica se o usuario é de maior
    public static boolean maiorDeIdade(int idade){
            if(idade >= 18 && idade<65){
                return true;
            }else{
                return false;
            }
        }
    
    //verifica se a pessoa ja é idosa e pode se aposentar
    public static boolean terceiraIdade(int idade){
        if(idade>=65){
            return true;
        }else{
            return false;
        }
    }
    
    
    private static void rodarTesteIntegracao(int anoNasc, int anoAtual, String esperado){
        int idade = AtividadeProjetinho.calcularIdade(anoNasc, anoAtual);
        String 
    }
}
