package com.example.demo1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo1.dto.Response;
import com.example.demo1.entity.Qualification;
import com.example.demo1.enums.ErrorCode;
import com.example.demo1.repository.EmployeeRepository;
import com.example.demo1.repository.QualificationRepository;
import com.example.demo1.service.QualificationService;

@Service
public class QualificationServiceImpl implements QualificationService{
  
  @Autowired
  private QualificationRepository qualifRepo;
  @Autowired
  private EmployeeRepository empRepo;
  @Override
  public ResponseEntity<Response> createQualification(Qualification qualification) {
    Qualification q;
    try {
      q = qualifRepo.save(qualification);
    } catch(Exception e) {
      e.printStackTrace();
      Response response = new Response();
      response.setErrorCode(ErrorCode.ID_NOT_FOUND);
      response.setSuccess(false);
      response.setMessage("Error Occured While Creating Qualification");
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body(response);
    }
    q.setEmp(empRepo.findById(q.getEmp().getId()).orElse(null));
    Response response = new Response();
    response.setData(q);
    response.setMessage("Qualification Created Successfully");
    response.setSuccess(true);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
  @Override
  public ResponseEntity<?> deleteQualfication(int id) {
    boolean b = qualifRepo.existsById(id);
    if (b) {
      qualifRepo.deleteById(id);
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.internalServerError().build();
    }

  

}