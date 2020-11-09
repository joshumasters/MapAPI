package com.tts.mapsapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    
    @GetMapping("/home")
    public String getDefaultMap() {
        return "index";
    }
    
}