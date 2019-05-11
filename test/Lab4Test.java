/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab4.Lab4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710506
 */
public class Lab4Test {
    
    public Lab4Test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void Test1(){
      int a [] = new int[] { 9, 5, 8, 6, 1, 3, 7, 4, 2 };
      int b [] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
      Lab4.sort(a);
      assertArrayEquals(b,a);
    }
    @Test
    public void Test2(){
      int a [] = new int[] { 90, 50, 80, 60, 10, 30, 70, 40, 20 };
      int b [] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
      Lab4.sort(a);
      assertArrayEquals(b,a);
    }
    @Test
    public void Test3(){
      int a [] = new int[] { -900, 500, 800, 600, 100, 300, 700, 400, 200 };
      int b [] = new int[] {-900, 100, 200, 300, 400, 500, 600, 700, 800};
      Lab4.sort(a);
      assertArrayEquals(b,a);
    }
}
