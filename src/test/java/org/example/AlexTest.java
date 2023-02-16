package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AlexTest {

    @Mock
    Feline feline;

    Alex alex;

    @BeforeEach
    public void alexInit() throws Exception {
        alex = new Alex(feline);
    }
    @Test
    public void getKittensMethodReturnsZero() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsMethodReturnsListAlexFriends() {
        List<String> alexFriends = List.of("Marty the zebra",
                "Gloria the hippo", "Melman the giraffe");
        assertEquals(alexFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsPlaceOfLivingAlex() {
        assertEquals("New York City's Central Park Zoo",
                alex.getPlaceOfLiving());
    }

    @Test
    public void doesHaveManeReturnsTrue() {
        assertTrue(alex.hasMane);
    }

    @Test
    public void getFoodMethodReturnsCorrectList() throws Exception {
        List<String> listFoodAlex = List.of("Animals", "Birds", "Fish");
        Mockito.when(alex.getFood()).thenReturn(listFoodAlex);
        assertEquals(listFoodAlex, alex.getFood());
    }
}
