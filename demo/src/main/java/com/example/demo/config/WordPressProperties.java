package com.example.demo.config;

import com.example.demo.model.Menu;
import com.example.demo.model.Server;
import com.example.demo.model.Theme;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Data
@Component
@ConfigurationProperties("wordpress")
public class WordPressProperties {

    private List<Menu> menus = new ArrayList<>();
    private Theme themes;
    private List<Server> servers = new ArrayList<>();
}
