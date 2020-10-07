package com.weflux.example.reactor.controller;

import com.weflux.example.reactor.configproperty.MapConfigLoader;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping(path="/configProperty")
@AllArgsConstructor
public class ConfigProperty {

    private final MapConfigLoader mapConfigLoader;

    @GetMapping("loadMapFromYAML")
    public Map<String, MapConfigLoader.InnerObject> loadingMapfromYAML(){
        System.out.println("fucntion called");
        return mapConfigLoader.getMapkeyValuePair();
    }

}
