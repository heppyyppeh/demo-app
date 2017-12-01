package co.uk.shawnhepworth.demo.enums;

import java.util.ArrayList;
import java.util.List;

public enum Animals {
    DOG("rover"), CAT("coco"), HORSE("drogo");

    private String nickname;

    Animals(String nickname) {
        this.nickname = nickname;
    }

    public static Animals getAnimalByNickname(String nickname) {
        for (Animals animal : Animals.values()) {
            if (animal.getNickname().equals(nickname)) {
                return animal;
            }
        }
        return null;
    }


    public static List<Animals> getAnimalsWithNicknameContains(char character) {

        List<Animals> matched = new ArrayList<>();

        for (Animals animal : Animals.values()) {
            if (animal.getNickname().contains(Character.toString(character))) {
                matched.add(animal);
            }
        }
        return matched;
    }

    public String getNickname() {
        return nickname;
    }
}
