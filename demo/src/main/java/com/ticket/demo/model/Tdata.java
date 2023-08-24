package com.ticket.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="mytable999")


public class Tdata {
    @Id
    int trainno;
    String startpoint;
    String destination;
    public  Tdata(int trainno,
    String startpoint,
    String destination){
        this.trainno= trainno;
        this.startpoint=startpoint;
        this.destination= destination;
    }


    public Tdata() {

    }
}
