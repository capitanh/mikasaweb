package net.mikasa.mikasaweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region implements java.io.Serializable {
  
  private Integer id;
  private String name;
  
  public Region() {
  }

  public Region(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  @Id 
  @Column(name="id", unique=true, nullable=false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
