package controllers;

import models.Product;
import org.springframework.web.bind.annotation.*;
import repositories.repoProduct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ProductController {
    @Autowired
    private repoProduct repoProduct;

    @GetMapping("/product")
    public List<Product> products(){
        return repoProduct.findAll();
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product newproduct){
        if(repoProduct.findById(newproduct.getIdPro()).orElse(null) != null && repoProduct.findByName(newproduct.getIdPro()) != null){
            throw new ProductException(ExceptionRes)

        }else if(){

        }
    }

    @DeleteMapping("/delete/{idPro}")
    public List<Product> delete(){

    }

    @PutMapping("/edit/{idPro}")
    public Product edit(){

    }

}
