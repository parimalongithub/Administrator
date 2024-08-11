package com.example.admistrator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.example.admistrator.Entity.Summerizer;
import com.example.admistrator.Entity.SupportData;
import com.example.admistrator.Service.getdata;


@RestController
public class controller {
    @Autowired
    public
    
    getdata service;

  
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Technical")
    public ResponseEntity<List<SupportData>> getTechsupportqueries(
    @RequestParam(value = "Technical", required = false, defaultValue = "Technical") String Technical) {
    List<SupportData> entity = service.getEntitiesByDepartment(Technical);
    return ResponseEntity.ok(entity);
    }   



    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Customerservice")
    public ResponseEntity<List<SupportData>> getCustomersupportqueries(
    @RequestParam(value = "Customer Service", required = false, defaultValue = "Customer Service") String CustomerService) {
    List<SupportData> entity = service.getEntitiesByDepartment(CustomerService);
    return ResponseEntity.ok(entity);
    } 

    
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Hr")
    public ResponseEntity<List<SupportData>> getDocumantationqueries(
        @RequestParam(value = "Hr", required = false, defaultValue = "Hr") String Hr) {
    List<SupportData> entity = service.getEntitiesByDepartment(Hr);
    return ResponseEntity.ok(entity);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/miscellaneous")
        public ResponseEntity<List<SupportData>> getMiscellaneousqueries(
                @RequestParam(value = "miscellaneous", required = false, defaultValue = "miscellaneous") String miscellaneous) {
            List<SupportData> entity = service.getEntitiesByDepartment(miscellaneous);
            return ResponseEntity.ok(entity);
        }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Summery/{year}")
    public ResponseEntity<List<Summerizer>> getsummery(@PathVariable Integer year){
        List<Summerizer> entity = service.getsummery(year);
        return ResponseEntity.ok(entity);

    
    }


        
}



    





