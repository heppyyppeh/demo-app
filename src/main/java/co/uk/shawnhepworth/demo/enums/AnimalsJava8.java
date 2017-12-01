package co.uk.shawnhepworth.demo.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public enum AnimalsJava8 {
    DOG("rover"), CAT("coco"), HORSE("drogo");

    private String nickname;

    AnimalsJava8(String nickname) {
        this.nickname = nickname;
    }

    public static Optional<AnimalsJava8> getAnimalByNickname(String nickname) {
        return Arrays.stream(AnimalsJava8.values())
                .filter(a -> a.getNickname().equals(nickname))
                .findFirst();
    }

    public static List<AnimalsJava8> getAnimalsWithNicknameContains(char character) {
        return Arrays.stream(AnimalsJava8.values())
                .filter(a -> a.getNickname().contains(Character.toString(character)))
                .collect(Collectors.toList());
    }

    public String getNickname() {
        return nickname;
    }

}
