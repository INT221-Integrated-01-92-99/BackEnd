package models;


public class Product {

  private long idPro;
  private String proName;
  private String proDescript;
  private double proPrice;
  private java.sql.Date proMfd;
  private String proPathImg;
  private long idBrand;


  public long getIdPro() {
    return idPro;
  }

  public void setIdPro(long idPro) {
    this.idPro = idPro;
  }


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getProDescript() {
    return proDescript;
  }

  public void setProDescript(String proDescript) {
    this.proDescript = proDescript;
  }


  public double getProPrice() {
    return proPrice;
  }

  public void setProPrice(double proPrice) {
    this.proPrice = proPrice;
  }


  public java.sql.Date getProMfd() {
    return proMfd;
  }

  public void setProMfd(java.sql.Date proMfd) {
    this.proMfd = proMfd;
  }


  public String getProPathImg() {
    return proPathImg;
  }

  public void setProPathImg(String proPathImg) {
    this.proPathImg = proPathImg;
  }


  public long getIdBrand() {
    return idBrand;
  }

  public void setIdBrand(long idBrand) {
    this.idBrand = idBrand;
  }

}
