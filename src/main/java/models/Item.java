package models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Item {
  @Id
  private long idItem;
  @JsonBackReference
  @ManyToOne
  @JoinColumn(name="idColor")
  private Color color;
  @ManyToOne
  @JoinColumn(name="idPro")
  private Product product;

  public long getIdItem() {
    return idItem;
  }

  public void setIdItem(long idItem) {
    this.idItem = idItem;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
