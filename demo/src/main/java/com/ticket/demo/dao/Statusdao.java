package com.ticket.demo.dao;
import com.ticket.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Statusdao extends JpaRepository<Pinfo,Integer> {
}
