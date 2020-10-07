package com.weflux.example.reactor.configproperty;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

@Setter
@Getter
@Configuration
@ConfigurationProperties( prefix = "propertyname")
public class MapConfigLoader {

    private Map<String, InnerObject> mapkeyValuePair;

    @Configuration
    @Setter
    @Getter
    public static class InnerObject{
        private String name;
        private int integerField;
        private boolean booleanType;
    }

}
