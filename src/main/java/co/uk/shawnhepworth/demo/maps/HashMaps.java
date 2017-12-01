package co.uk.shawnhepworth.demo.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public Map<String, String> addMaps(Map<String, String> map1, Map<String, String> map2) {

        Map<String, String> newMap = new HashMap<>();
        newMap.putAll(map1);
        newMap.putAll(map2);
        return newMap;
    }

    public Map<String, String> removeMapFromMap(Map<String, String> originalMap, Map<String, String> mapToRemove) {

        Map<String, String> newMap = new HashMap<>();
        newMap.putAll(originalMap);

        for (String key : mapToRemove.keySet()) {
            newMap.remove(key);
        }
        return newMap;
    }
}
