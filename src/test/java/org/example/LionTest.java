package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
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
    public void doesHaveManeWithCorrectDataTest(String sexLion, boolean hasMane) throws Exception {
        Lion lion = new Lion(sexLion, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "Trans"})
    public void withInvalidSexInConstructorLionThrowsExceptionTest(String sexLion) {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(sexLion, feline);
        });
        String expectedMessage = "Use valid animal sex values - male or female";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
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
        List<String> expectedListFoodLion = List.of("Animals", "Birds", "Fish");
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(expectedListFoodLion);
        assertEquals(expectedListFoodLion, lion.getFood());
    }
}