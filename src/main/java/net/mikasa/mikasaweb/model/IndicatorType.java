package net.mikasa.mikasaweb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "indicatorTypes")
public class IndicatorType {
  
  private String description;

  public IndicatorType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  

}
