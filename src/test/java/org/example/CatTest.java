package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CatTest {

    Cat cat;
    @Mock
    Feline feline;

    @BeforeEach
    public void initCat() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundMethodReturnsMeow() {
        assertEquals("Meow", cat.getSound());
    }

    @Test
    public void getFoodMethodReturnsEatMeat() throws Exception {
        List<String> expectedListOfFood = List.of("Animals", "Birds", "Fish");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);
        assertEquals(expectedListOfFood, cat.getFood());
    }
}