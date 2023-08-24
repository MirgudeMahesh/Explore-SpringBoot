package com.ticket.demo;

import jakarta.persistence.Id;
import lombok.Data;

@Data


public class Alldata {
   @Id
    int trainno;
    int price;
    String startpoint;
    String endpoint;
    public Alldata(int trainno,
    int price,
    String startpoint,
    String endpoint){
        this.trainno=trainno;
        this.price= price;
        this.startpoint= startpoint;
        this.endpoint= endpoint;
    }
    public  Alldata(){}



}
