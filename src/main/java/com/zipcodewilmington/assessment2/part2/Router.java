package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String, String> hMap;

    public Router(){
        hMap = new HashMap<>();
    }
    
    public void add(String path, String controller) {
        hMap.put(path, controller);
    }

    public Integer size() {
        return hMap.size();
    }

    public String getController(String path) {
        return hMap.get(path);
    }

    public void update(String path, String studentController) {
        hMap.put(path, studentController);
    }

    public void remove(String path) {
        hMap.remove(path);
    }

    public String toString(){
//        StringBuilder mapAsString = new StringBuilder("{");
//        for (String key : hMap.keySet()) {
//            mapAsString.append(key + "=" + hMap.get(key) + ", ");
//        }

        StringBuilder mapAsString = new StringBuilder();
//        for (Map.Entry<String, String> entry : hMap.entrySet()){
//        mapAsString.append("\n" + entry + " -> " + hMap.get(entry) + "\n");
//        }
        for (Map.Entry<String, String> entry : hMap.entrySet()) {
            mapAsString.append(entry.getKey()).append(entry.getValue()).append("\n");
        }
        return String.valueOf(mapAsString);
    }
}
