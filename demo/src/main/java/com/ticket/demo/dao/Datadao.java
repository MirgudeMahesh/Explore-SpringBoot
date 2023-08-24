package com.ticket.demo.dao;
import  com.ticket.demo.model.Tdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.*;

@Repository

public interface Datadao extends JpaRepository<Tdata,Integer> {
@Query(value = "SELECT  DISTINCT startpoint from mytable999;",nativeQuery = true)
    List<String> getallstartingpoints();
    @Query(value = "SELECT  DISTINCT destination from mytable999;",nativeQuery = true)
List<String> getalldestinationpoints();
}
