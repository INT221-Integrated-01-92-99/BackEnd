package controllers;

import models.Item;
import org.springframework.web.bind.annotation.GetMapping;
import repositories.repoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private repoItem repoItem;

    @GetMapping("item")
    public List<Item> item(){
        return repoItem.findAll();
    }
}
