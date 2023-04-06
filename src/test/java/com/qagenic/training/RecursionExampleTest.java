package com.qagenic.training;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class RecursionExampleTest {
    static RecursionExample rec;
    
    @BeforeClass
    public static void define(){
        rec = new RecursionExample();
    }

    @Test
    public void TC01_Factorial_positivenumber(){
        int act_res = rec.factorial(5);
        assertEquals(120, act_res);
        System.out.println("Factorial Test is successful");
    }


}
