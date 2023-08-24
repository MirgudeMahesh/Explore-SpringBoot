package com.ticket.demo.dao;
import com.ticket.demo.model.mytable9999;
import  java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface Pricedao extends JpaRepository<mytable9999,Integer> {

    @Query(value = "SELECT * FROM mytable9999 p1 WHERE p1.trainno=:res",nativeQuery = true)
     mytable9999 getpricebytrainno(int res);
    @Query(value = "SELECT * FROM mytable9999 p1 WHERE p1.trainno=:trainna",nativeQuery = true)
    mytable9999 findbytrainno(int trainna);
}
