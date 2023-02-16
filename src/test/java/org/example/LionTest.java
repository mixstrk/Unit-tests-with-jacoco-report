package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @ParameterizedTest
    @CsvSource({
            "Male, true",
            "Female, false"
    })
    public void doesHaveManeMethodWithCorrectDataTest(String sexLion, boolean hasMane) throws Exception {
        Lion lion = new Lion(sexLion, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void checkThatExceptionIsAvailableWithInvalidSex() throws Exception {
        String expectedExceptionMessage = "Use valid animal sex values - male or female";
        Exception exception = new Exception();
        try {
            Lion lion = new Lion("Trans", feline);
        } catch (Exception e) {
            exception = e;
        }
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }

    @Test
    public void getKittensMethodReturnsNumIsOne() throws Exception {
        Lion lion = new Lion("Female", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodMethodReturnsCorrectList() throws Exception {
        Lion lion = new Lion("Male", feline);
        List<String> listFoodLion = List.of("Animals", "Birds", "Fish");
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(listFoodLion);
        assertEquals(listFoodLion, lion.getFood());
    }
}