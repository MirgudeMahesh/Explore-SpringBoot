package com.ticket.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class mytable9999 {
    @Id
    int trainno;
    int price;
    public mytable9999(int trainno,
    int price){
        this.trainno= trainno;
        this.price= price;
    }

    public mytable9999() {

    }
}
