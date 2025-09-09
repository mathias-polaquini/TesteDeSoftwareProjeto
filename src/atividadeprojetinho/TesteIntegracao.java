/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeprojetinho;
import javax.swing.*;
/**
 *
 * @author mathi
 */
public class TesteIntegracao {
    public static void main(String[] args){
        testeIdadeCrianca();
        testeIdadeAdolescente();
        testeIdadeAdulto();
        testeIdadeIdoso();
        testeIdadeInvalidaIntegracao();
    }
    public static void testeIdadeCrianca(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true); //precisa setar como true para a tela aparecer quando é instanciada, se não o usuario n ve nada 
        tela.getTxtIdade().setText("2015");
        tela.getBotaoDeCalcular().doClick();//10
        System.out.println("teste de integração com a idade de uma criança "+tela.mensagem.getText());
    }
    public static void testeIdadeAdolescente(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        tela.getTxtIdade().setText("2006");
        tela.getBotaoDeCalcular().doClick();//19
        System.out.println("Teste de integração com a idade do Adolescente "+tela.mensagem.getText());
    }
    public static void testeIdadeAdulto(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        tela.getTxtIdade().setText("1980");//45 anos
        tela.getBotaoDeCalcular().doClick();
        System.out.println("Teste de iIntegração com uma idade para adulto "+tela.mensagem.getText());
    }
    public static void testeIdadeIdoso(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        tela.getTxtIdade().setText("1940");//85 anos
        tela.getBotaoDeCalcular().doClick();
        System.out.println("Teste de Integração com idade para um idoso "+tela.mensagem.getText());
    }
    public static void testeIdadeInvalidaIntegracao(){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        tela.getTxtIdade().setText("1899");
        tela.getBotaoDeCalcular().doClick();;
        System.out.println("É PRA DAR ERRO!!!" + tela.mensagem.getText());
    }
}
