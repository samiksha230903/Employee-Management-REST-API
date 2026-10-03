package com.example.demo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Qualification {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int ssc;
  private int hsc;
  private int graduation;
  @OneToOne
  private Employee emp;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getSsc() {
    return ssc;
  }
  public void setSsc(int ssc) {
    this.ssc = ssc;
  }
  public int getHsc() {
    return hsc;
  }
  public void setHsc(int hsc) {
    this.hsc = hsc;
  }
  public int getGraduation() {
    return graduation;
  }
  public void setGraduation(int graduation) {
    this.graduation = graduation;
  }
  public Employee getEmp() {
    return emp;
  }
  public void setEmp(Employee emp) {
    this.emp = emp;
  }
  
}
