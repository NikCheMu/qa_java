package com.example;

import java.util.List;

public class Alex extends Lion{
    public Alex( Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Зоопарк Нью-Йорка";
    }

    @Override
    public int getKittens() throws Exception {
        throw new Exception("Alex has no kittens");
    }


}


