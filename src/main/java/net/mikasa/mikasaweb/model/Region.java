package net.mikasa.mikasaweb.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region implements java.io.Serializable {
  
  private static final long serialVersionUID = 7878378792402868513L;
  private BigDecimal id;
  private String name;
  
  public Region() {
  }

  public Region(BigDecimal id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  @Id 
  @Column(name="id", unique=true, nullable=false)
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  @Column(name="name", nullable=false, length=30)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  

}
