package com.ticket.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

@Entity(name="mytable0")
@Data
public class Pinfo {
    @Id
    int id;
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   String name;
   int cellno;
   String startpoint;
   String destination;
   String payment;

}
