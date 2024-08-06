package com.example.admistrator.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admistrator.Repository.repository;


@Service
public class getdata {
    @Autowired 
    private repository repository;

    public List<SupportData> getEntitiesByDepartment(String department) {
        return repository.findBydepartment(department);
    }




    
}
