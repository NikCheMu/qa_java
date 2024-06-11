package com.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;


    @Test
    public void felinesGetKittensCalledWhenLionsGetKittensCall() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens();
    }

    @Test
    public void felineGetFoodCalledWhenLionGetFoodCall() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getFood();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }



}
