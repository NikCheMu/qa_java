package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void catShouldDoMeow(){
        Cat cat = new Cat(feline);
        String whatTheCatSay = cat.getSound();
        Assert.assertEquals("Cat should say meow","Мяу",whatTheCatSay);
    }

    @Test
    public void interfaceMethodCalledWhenCatGetFoodCalls() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();

    }


}
