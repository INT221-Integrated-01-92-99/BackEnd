package models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class brand {
    @Id
    private int idbrand;
    private String brandname;
    @JsonBackReference
    @OneToMany(mappedBy = "brand",fetch = FetchType.LAZY)
    private List<product> productList;


}
