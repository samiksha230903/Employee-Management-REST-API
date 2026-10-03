package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.entity.Qualification;

@Repository
public interface QualificationRepository  extends JpaRepository<Qualification, Integer>{
  
}