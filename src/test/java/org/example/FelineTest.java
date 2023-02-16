package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    Feline feline;
    @BeforeEach
    public void initFeline() {
        feline = new Feline();
    }
    @Test
    public void eatMeatMethodReturnsCorrectList() throws Exception {
        List<String> expectedListOfFood = List.of("Animals", "Birds", "Fish");
        List<String> actualListOfFood = feline.eatMeat();
        assertEquals(expectedListOfFood, actualListOfFood);
    }

    @Test
    public void getFamilyMethodReturnsFeline() {
        assertEquals("Feline", feline.getFamily());
    }

    @Test
    public void getKittensMethodReturnsNumberIsOne() {
        assertEquals(1, feline.getKittens());
    }

}