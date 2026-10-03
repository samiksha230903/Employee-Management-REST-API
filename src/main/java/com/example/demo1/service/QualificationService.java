package com.example.demo1.service;

import org.springframework.http.ResponseEntity;

import com.example.demo1.dto.Response;
import com.example.demo1.entity.Qualification;

public interface QualificationService {

  ResponseEntity<Response> createQualification(Qualification qualification);

  ResponseEntity<?> deleteQualfication(int id);

}