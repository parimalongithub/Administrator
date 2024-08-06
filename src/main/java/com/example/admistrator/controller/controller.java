package com.example.admistrator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.example.admistrator.data.SupportData;
import com.example.admistrator.data.getdata;


@RestController
public class controller {
    @Autowired
    public
    
    getdata service;
      
        
     

    @GetMapping("/general")
    public String genral_support(){
        return "general_support";
    }
    @GetMapping("/Technical")
    public String Technical(@RequestParam(value = "Technical", required = false, defaultValue = "Technical") String department, Model model) {
        List<SupportData> entities = service.getEntitiesByDepartment(department);
        model.addAttribute("entities", entities);
        return "Technical_support"; 
    }

    

    @GetMapping("/Product")
        public String Product(@RequestParam(value = "Product", required = false, defaultValue = "Product") String department, Model model) {
            List<SupportData> entities = service.getEntitiesByDepartment(department);
            model.addAttribute("entities", entities);
            return "product_support"; 
        }






//api
 
  
        @GetMapping("/")
        public String admistrator(){
            return "Admistrator";
        }
  

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Techsupport")
    public ResponseEntity<List<SupportData>> getTechsupportqueries(
    @RequestParam(value = "Techsupport", required = false, defaultValue = "Techsupport") String Techsupport, 
    Model model) {
    List<SupportData> entity = service.getEntitiesByDepartment(Techsupport);
    return ResponseEntity.ok(entity);
    }   



    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Customersupport")
    public ResponseEntity<List<SupportData>> getCustomersupportqueries(
    @RequestParam(value = "Customersupport", required = false, defaultValue = "Customersupport") String Customersupport, 
    Model model) {
    List<SupportData> entity = service.getEntitiesByDepartment(Customersupport);
    return ResponseEntity.ok(entity);
    } 



    
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/Documentation")
    public ResponseEntity<List<SupportData>> getDocumantationqueries(
        @RequestParam(value = "Documentation", required = false, defaultValue = "Documentation") String documentation, 
        Model model) {
    List<SupportData> entity = service.getEntitiesByDepartment(documentation);
    return ResponseEntity.ok(entity);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Miscellaneous")
        public ResponseEntity<List<SupportData>> getMiscellaneousqueries(
                @RequestParam(value = "Miscellaneous", required = false, defaultValue = "Miscellaneous") String Miscellaneous, 
                Model model) {
            List<SupportData> entity = service.getEntitiesByDepartment(Miscellaneous);
            return ResponseEntity.ok(entity);
        }
        


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/Salessupport")
        public ResponseEntity<List<SupportData>> getSalessupportqueries(
                @RequestParam(value = "Salessupport", required = false, defaultValue = "Salessupport") String Salessupport, 
                Model model) {
            List<SupportData> entity = service.getEntitiesByDepartment(Salessupport);
            return ResponseEntity.ok(entity);
        }
        


    
}



    





