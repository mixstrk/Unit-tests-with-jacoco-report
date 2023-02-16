package org.example;

import java.util.List;

public class Feline extends Animal implements Predator{

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Predator");
    }

    @Override
    public String getFamily() {
        return "Feline";
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public int getKittens() {
        return getKittens(1);
    }
}
