package controllers;

import exceptions.ExceptionRepo;
import exceptions.ProductException;
import models.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import repositories.repoProduct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ProductController {

    @Autowired
    private repoProduct repoPro;

    @GetMapping("/product")
    public List<Product> products(){
        return repoPro.findAll();
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product newproduct){
        if(repoPro.findById(newproduct.getIdPro()).orElse(null) != null && repoPro.findByName(newproduct.getProName()) != null){

        }
        return null;
    }

    @DeleteMapping("/delete/{idPro}")
    public List<Product> delete(){
        return null;
    }

    @PutMapping("/edit/{idPro}")
    public Product edit(){
        return null;
    }

}
