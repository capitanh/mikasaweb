package net.mikasa.mikasaweb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plans")
public class Plan {

  private String name;
  private String plantype;
  
  public Plan(String name, String plantype) {
    this.name = name;
    this.plantype = plantype;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlantype() {
    return plantype;
  }

  public void setPlantype(String plantype) {
    this.plantype = plantype;
  }

}
