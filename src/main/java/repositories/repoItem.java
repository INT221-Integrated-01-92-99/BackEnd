package repositories;

import models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repoItem extends JpaRepository<Item,Long> {
}
