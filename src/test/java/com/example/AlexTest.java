package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void alexHasNoKittens() throws Exception {
        Alex alex = new Alex(feline);
        thrown.expect(Exception.class);
        thrown.expectMessage("Alex has no kittens");
        alex.getKittens();
    }

    @Test
    public void alexLivesInNewYorkZoo() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("Зоопарк Нью-Йорка",alex.getPlaceOfLiving());
    }

    @Test
    public void alexHasFriends() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"),alex.getFriends());

    }




}
