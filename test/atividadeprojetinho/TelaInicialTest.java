/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package atividadeprojetinho;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mathi
 */
public class TelaInicialTest {
    
    public TelaInicialTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class AtividadeProjetinho.
     */
    @Test// teste inicial pra ver se a logica para calcular a idade do código esta certa
    public void testeCalcularIdade(){
        int idade = TelaInicial.calcularIdade(2005, 2025);
        assertEquals(20,idade);
    }
    @Test //testa o ano de nascimento sendo igual ao ano atual q eu passei na variavel
    public void testeAnosIguais(){
        int idade = TelaInicial.calcularIdade(2025, 2025);
        assertEquals(0,idade);
    }
    
    
    @Test
    public void testeCrianca(){ //testa se a logica de calcular a faixa etarea da criança esta certa
        assertTrue(TelaInicial.crianca(0));//valor fronteira
        assertTrue(TelaInicial.crianca(11));//esse também
        assertTrue(TelaInicial.crianca(9));//valor mediano
        assertFalse(TelaInicial.crianca(12));//valor fronteira a cima
        assertFalse(TelaInicial.crianca(20));//valor bem a cima
    }
    
    @Test
    public void testeAdolecente(){// mesma coisa q a da criança só q com o adolecente
        assertTrue(TelaInicial.adolescente(12));
        assertTrue(TelaInicial.adolescente(20));
        assertTrue(TelaInicial.adolescente(19));
        assertFalse(TelaInicial.adolescente(21));
        assertFalse(TelaInicial.adolescente(30));
        assertFalse(TelaInicial.adolescente(5));
    }
    
    
    @Test
    public void testeMaiorDeIdade(){//mesma coisa q o teste da criança
        assertTrue(TelaInicial.maiorDeIdade(21));
        assertTrue(TelaInicial.maiorDeIdade(64));
        assertTrue(TelaInicial.maiorDeIdade(35));
        assertFalse(TelaInicial.maiorDeIdade(65));
        assertFalse(TelaInicial.maiorDeIdade(100));
        assertFalse(TelaInicial.maiorDeIdade(19));//falso pq 19 é adolescente
    }
    @Test
    public void testeTerceiraIdade(){//mesma coisa q o teste da criança
        assertTrue(TelaInicial.terceiraIdade(65));
        assertTrue(TelaInicial.terceiraIdade(123));
        assertTrue(TelaInicial.terceiraIdade(99));
        assertFalse(TelaInicial.terceiraIdade(124));
        assertFalse(TelaInicial.terceiraIdade(2000));
        assertFalse(TelaInicial.terceiraIdade(64));//testa falso pq aqui é pra devolver adulto
    }
    @Test
    public void testeIdadeInvalida(){
        int idade = 124; //variavel idade recebe 124
        assertFalse(TelaInicial.crianca(idade));
        assertFalse(TelaInicial.adolescente(idade));//idade q vale 124 
        assertFalse(TelaInicial.maiorDeIdade(idade));
        assertFalse(TelaInicial.terceiraIdade(idade));
    }
    @Test
    public void testeIdadeInvalidaNegativa(){
        int idade = -1; //variavel idade recebe -1
        assertFalse(TelaInicial.crianca(idade));
        assertFalse(TelaInicial.adolescente(idade));//idade q vale -1
        assertFalse(TelaInicial.maiorDeIdade(idade));
        assertFalse(TelaInicial.terceiraIdade(idade));
    }
    
    //Testes de Integração -----------------------------------------------------
    //@Test
    //public void testeBotaoDeCalcular_Criancas(){
    //    TelaInicial tela = new TelaInicial();
    //    tela.txtidade.setText("2015");
    //    tela.BotaoDeCalcular.doClick();
    //}
}
