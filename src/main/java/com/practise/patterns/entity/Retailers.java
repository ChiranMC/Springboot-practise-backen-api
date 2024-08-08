package com.practise.patterns.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "retailers")
public class Retailers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nic_no")
    private String nic_no;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "second_name")
    private String second_name;

    @Column(name = "address")
    private String address;

    public void setNic_no(String nic_no){
        this.nic_no = nic_no;
    }

    public String getNic_no() {
        return nic_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
