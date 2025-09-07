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
public class AtividadeProjetinhoTest {
    
    public AtividadeProjetinhoTest() {
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
    
    //TESTES UNITARIOS
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AtividadeProjetinho.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaiorDeIdadeLimite() {
        System.out.println("Testa os 18 anos que ja deve ser considerado maior de idade");
        assertTrue(AtividadeProjetinho.maiorDeIdade(18));
    }
    
    @Test
    public void testarTerceiraIdade(){
        System.out.println("Testando se o suario que digitar 65+ é idoso");
        int anoNas = 1960;
        int anoAtual = 2025;
        int total = 65;
        int result = AtividadeProjetinho.calcularIdade(anoNas, anoAtual);
        assertEquals(total, result);
    }
    
            
    @Test
    public void testCalcularIdade() {
        System.out.println("Testar o metodo calcularIdade para ver se esta retornando certo");
        int anoNas = 2000;
        int anoAtual = 2025;
        int expResult = 25;
        int result = AtividadeProjetinho.calcularIdade(anoNas, anoAtual);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMaiorDeIdade(){
        System.out.println("maior De idade retornando verdadeiro");
        int idade = 20;
        boolean expResult = true;
        boolean result = AtividadeProjetinho.maiorDeIdade(idade);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaiorDeIdadeFalso() {
        System.out.println("maior De Idade retornando falso");
        int idade = 15;
        boolean expResult = false;
        boolean result = AtividadeProjetinho.maiorDeIdade(idade);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularIdadeZeroAno() {
        System.out.println("Testa se o metodo retorna 0 quando o ano de nascimento é igual ao ano atual");
        assertEquals(0, AtividadeProjetinho.calcularIdade(2025, 2025));
    }
    
    // TESTES DE INTEGRAÇÕES
    @Test //testando a integração com valor maior que 18
    public void testIntegracaoMaiorDeIdade() {
        int anoNas = 2000;
        int anoAtual = 2025;
        int idade = AtividadeProjetinho.calcularIdade(anoNas, anoAtual);//aqui calcula a idade do usuario
        boolean resultado = AtividadeProjetinho.maiorDeIdade(idade); //aqui ele verifica se é maior de idade
        assertTrue(resultado);
    }
    
    @Test //testando a integração com o valor igual 18
    public void testIntegracaoMaiorDeIdade18Anos() {
        int anoNas = 2007;
        int anoAtual = 2025;
        int idade = AtividadeProjetinho.calcularIdade(anoNas, anoAtual);
        boolean resultado = AtividadeProjetinho.maiorDeIdade(idade);//nesse caso ele vai verificar que a idade esta no limite para n ser menor de idade
        assertTrue(resultado);
    }


 
    
    
}
