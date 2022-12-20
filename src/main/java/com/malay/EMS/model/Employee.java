package com.malay.EMS.model;
import java.sql.Timestamp;


public class Employee {
    private long id;
    private String name ;
    private String address ;
    private long pincode ;
    private String state ;
    private Timestamp row_creation_timestamp;

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getRow_creation_timestamp() {
        return row_creation_timestamp;
    }

    public void setRow_creation_timestamp(Timestamp row_creation_timestamp) {
        this.row_creation_timestamp = row_creation_timestamp;
    }

    public Employee(long id, String name, String name1, String address, long pincode, String state, Timestamp row_creation_timestamp) {
    }



}
