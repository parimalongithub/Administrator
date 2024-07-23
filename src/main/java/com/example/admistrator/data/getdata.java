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




    public  ArrayList<support_data> find_all_department(){
        ArrayList <support_data> data=(ArrayList<support_data>) repository.findAll();
        ArrayList <String> Deapartment=new ArrayList<>(); 
        for(support_data Data:data){
            String dep=Data.getDeapartment();
            Deapartment.add(dep);
        }
        System.out.println(Deapartment);
        return data;
    }

    
}
