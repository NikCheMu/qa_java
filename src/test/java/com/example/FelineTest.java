package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void felineIsCatFamily(){
        Feline feline = new Feline();
        String animalFamily = feline.getFamily();
        Assert.assertEquals("Feline should be cat","Кошачьи",animalFamily);
    }

    @Test
    public void felinesFoodIsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> foods = feline.eatMeat();
        Assert.assertEquals("Feline should eats meat",List.of("Животные", "Птицы", "Рыба"),foods);
    }

    @Test
    public void defaultKittensCountEquals1(){
        Feline feline = new Feline();
        Assert.assertEquals(1,feline.getKittens());
    }

    @Test
    public void kittensCountEqualsInputParam(){
        Feline feline = new Feline();
        Assert.assertEquals(365,feline.getKittens(365));
    }

}
