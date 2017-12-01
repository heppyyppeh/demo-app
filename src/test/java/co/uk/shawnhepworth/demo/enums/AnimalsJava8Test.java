package co.uk.shawnhepworth.demo.enums;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class AnimalsJava8Test {

    @Test
    public void shouldGetAnimalByNickname() {

        Optional<AnimalsJava8> animal = AnimalsJava8.getAnimalByNickname("rover");

        assertTrue(animal.isPresent());
        assertEquals(AnimalsJava8.DOG, animal.get());

    }

    @Test
    public void shouldNotFindAnimalThatDoesNotExist() {

        Optional<AnimalsJava8> animal = AnimalsJava8.getAnimalByNickname("does not exist");

        assertFalse(animal.isPresent());
    }

    @Test
    public void shouldFindAllAnimalsWithNicknameContainingAnR() {

        char character = 'r';

        List<AnimalsJava8> animals = AnimalsJava8.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(2));
        assertThat(animals, equalTo(expectedOutput()));
    }

    @Test
    public void shouldNotFindAnyAnimalsWithNicknameContainingAZ() {

        char character = 'z';

        List<AnimalsJava8> animals = AnimalsJava8.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(0));
    }

    @Test
    public void shouldNotFindAnyAnimalsWithNicknameContainingADifferentCase() {

        char character = 'R';

        List<AnimalsJava8> animals = AnimalsJava8.getAnimalsWithNicknameContains(character);

        assertThat(animals, hasSize(0));
    }

    private List<AnimalsJava8> expectedOutput() {

        List<AnimalsJava8> animals = new ArrayList<>();
        animals.add(AnimalsJava8.DOG);
        animals.add(AnimalsJava8.HORSE);
        return animals;
    }
}