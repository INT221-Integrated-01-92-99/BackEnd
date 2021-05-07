package repositories;

import models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repoProduct extends JpaRepository<Product,Long> {
    
}
