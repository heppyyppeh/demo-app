package co.uk.shawnhepworth.demo.maps;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HashMapsTest {

    private HashMaps hashMaps;

    @Before
    public void setup() {
        hashMaps = new HashMaps();
    }

    @Test
    public void shouldCopyContentsOfMapToAnother() {
        //arrange
        Map<String, String> mapActual;

        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Apple");
        map1.put("2", "Orange");

        Map<String, String> map2 = new HashMap<>();
        map2.put("3", "Lemon");
        map2.put("4", "Grapefruit");
        map2.put("5", "Pinapple");

        //act
        mapActual = hashMaps.addMaps(map1, map2);

        //assert
        assertEquals(expectedResult1(), mapActual);
    }

    @Test
    public void shouldDeleteMapFromMap() {
        Map<String, String> mapActual;

        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Apple");
        map1.put("2", "Orange");

        Map<String, String> map2 = new HashMap<>();
        map2.put("2", "Orange");

        //act
        mapActual = hashMaps.removeMapFromMap(map1, map2);

        //assert
        assertEquals(expectedResult2(), mapActual);
    }

    private Map<String, String> expectedResult1() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Apple");
        map1.put("2", "Orange");
        map1.put("3", "Lemon");
        map1.put("4", "Grapefruit");
        map1.put("5", "Pinapple");
        return map1;
    }

    private Map<String, String> expectedResult2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Apple");
        return map1;
    }

}