package org.example;

import java.util.List;

public class Alex extends Lion{

    public Alex(Feline feline) throws Exception {
        super("Male", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Marty the zebra", "Gloria the hippo", "Melman the giraffe");
    }

    public String getPlaceOfLiving() {
        return "New York City's Central Park Zoo";
    }
}
