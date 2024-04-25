/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Calculadora;

/**
 *
 * @author admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    	@Test
	void testFactorial() {
		//Primer caso de prueba
		Calculadora a = new Calculadora(-1,2);
		Integer resultado = a.factorial();
		assertNull(resultado);
		
		//Segundo caso de prueba
		a = new Calculadora(0,2);
		resultado = a.factorial();
		assertEquals(resultado,1);
		
		//Tercer caso de prueba
		a = new Calculadora(1,2);
		resultado = a.factorial();
		assertEquals(resultado,1);
	}
	
}
