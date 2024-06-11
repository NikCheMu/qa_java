package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Mock
    private Feline feline;

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean mane;


    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }



    @Test
    public void maneDependsOnLionSex() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(mane,hasMane);
    }
}
