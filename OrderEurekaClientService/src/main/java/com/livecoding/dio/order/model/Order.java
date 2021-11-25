package com.livecoding.dio.order.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name = "customer_id", nullable = false)
  public long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(long customer_id) {
    this.customer_id = customer_id;
  }

  @Column(name = "description", nullable = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name = "value", nullable = false)
  public long getValue() {
    return value;
  }

  public void setValue(long value) {
    this.value = value;
  }

  private long id;

  private long customer_id;

  private String description;

  private long value;


  public Order(long id, long customer_id, String description, long value) {
    this.id = id;
    this.customer_id = customer_id;
    this.description = description;
    this.value = value;
  }

  public Order() {
  }



  @Override
  public String toString() {
    return "Order [id=" + id + ", customer_id=" + customer_id + ", description=" + description
      + ", value ="+ value+"]";
  }
}
