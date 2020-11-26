package org.atomiv.template.lite.web.restapi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addresses")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;


    //private String street;
    private String city;



//    @JsonBackReference // doesn't show customer: null field, but it's still empty
//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.ALL)
    // i think it only started doing the id properly and showing up in pgAdmin after @MapsId
    // but orderItems use @JoinColumn...
//    @MapsId("customer_id")
//    @MapsId //?
    @JoinColumn(name = "customer_id")
    private Customer customer;





    public Address(Long id, String city, Customer customer) {
        this.id = id;
        this.city = city;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
