package org.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Herbivorous".equals(animalKind)) {
            return List.of("Herb", "Different plants");
        } else if ("Predator".equals(animalKind)) {
            return List.of("Animals", "Birds", "Fish");
        } else {
            throw new Exception("Animal species unknown, use Herbivore or Predator");
        }
    }

    public String getFamily() {
        return "There are several families: hare, squirrel, mouse, feline, canine, bear, marten";
    }
}
