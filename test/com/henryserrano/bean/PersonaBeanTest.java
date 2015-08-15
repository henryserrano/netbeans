/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henryserrano.bean;

import com.henryserrano.model.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sistemas
 */
public class PersonaBeanTest {
    
    public PersonaBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPersona method, of class PersonaBean.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        PersonaBean instance = new PersonaBean();
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersona method, of class PersonaBean.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = null;
        PersonaBean instance = new PersonaBean();
        instance.setPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrar method, of class PersonaBean.
     */
    @Test
    public void testRegistrar() throws Exception {
        System.out.println("registrar");
        PersonaBean instance = new PersonaBean();
        instance.registrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
