package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.Response;
import com.example.demo1.entity.Qualification;
import com.example.demo1.service.QualificationService;

@RestController
@RequestMapping("/qualif")
public class QualificationController {
  @Autowired
  private QualificationService qualificationService;
//  Exception exp = new ArithmeticException();
  @PostMapping
  public ResponseEntity<Response> createQualification(@RequestBody Qualification qualification){
    return qualificationService.createQualification(qualification);
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteQuailfication(@PathVariable int id){
    return qualificationService.deleteQualfication(id);
  }
}