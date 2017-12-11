package net.mikasa.mikasaweb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "activities")
public class Activity {
  
  private String name;
  private String date;
  private String assistants;
  private String amount;
  private String owner;
  
  public Activity(String name, String date, String assistants, String amount, String owner) {
    this.name = name;
    this.date = date;
    this.assistants = assistants;
    this.amount = amount;
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getAssistants() {
    return assistants;
  }

  public void setAssistants(String assistants) {
    this.assistants = assistants;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
  
  

}
