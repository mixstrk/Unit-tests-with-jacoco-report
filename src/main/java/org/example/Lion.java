package org.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Male".equals(sex)) {
            hasMane = true;
        } else if ("Female".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Use valid animal sex values - male or female");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return this.feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Predator");
    }
}
