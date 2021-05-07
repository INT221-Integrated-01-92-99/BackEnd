package controllers;

import models.Color;
import repositories.repoColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ColorController {
    @Autowired
    private repoColor repoColor;

    @GetMapping("/color")
    public List<Color> colors(){
        return repoColor.findAll();
    }
}
