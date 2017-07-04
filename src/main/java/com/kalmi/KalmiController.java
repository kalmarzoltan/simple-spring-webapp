package com.kalmi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by java on 2017.07.04..
 */

@RestController
public class KalmiController {
    @RequestMapping("/kalmi")
    public String whoisTheKing() {
        return "Kalmi";
    }

    @RequestMapping("/kalmi/list")
    public List<String> list() {
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("One");
        listOfString.add(UUID.randomUUID().toString());
        listOfString.add(LocalDateTime.now().toString());
        return listOfString;
    }

    @RequestMapping("/kalmi/map")
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("A", UUID.randomUUID().toString());
        map.put("B", "Hello");
        return map;


    }
}
