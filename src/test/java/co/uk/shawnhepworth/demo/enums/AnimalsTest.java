package co.uk.shawnhepworth.demo.enums;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class AnimalsTest {


    @Test
    public void shouldGetAnimalByNickname() {

        Animals animal = Animals.getAnimalByNickname("rover");

        assertEquals(Animals.DOG, animal);

    }

    @Test
    public void shouldNotFindAnimalThatDoesNotExist() {

        Animals animal = Animals.getAnimalByNickname("does not exist");

        assertNull(animal);

    }

    @Test
    public void shouldFindAllAnimalsWithNicknameContainingAnR() {

        char character = 'r';

        List<Animals> animals = Animals.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(2));
        assertThat(animals, equalTo(expectedOutput()));
    }

    @Test
    public void shouldNotFindAnyAnimalsWithNicknameContainingAZ() {

        char character = 'z';

        List<Animals> animals = Animals.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(0));
    }

    @Test
    public void shouldNotFindAnyAnimalsWithNicknameContainingADifferentCase() {

        char character = 'R';

        List<Animals> animals = Animals.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(0));
    }

    private List<Animals> expectedOutput() {

        List<Animals> animals = new ArrayList<>();
        animals.add(Animals.DOG);
        animals.add(Animals.HORSE);
        return animals;
    }
}