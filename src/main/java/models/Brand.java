package models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Brand {
  @Id
  private long idBrand;
  private String brandName;
  @JsonBackReference
  @OneToMany(mappedBy = "brand")
  private List<Product> productList;

  public long getIdBrand() {
    return idBrand;
  }

  public void setIdBrand(long idBrand) {
    this.idBrand = idBrand;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }
}
