package com.example.admistrator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admistrator.Entity.Summerizer;
import com.example.admistrator.Entity.SupportData;
import com.example.admistrator.Repository.SummerizerDatarepository;
import com.example.admistrator.Repository.SupportDatarepository;
import java.util.*;


@Service
public class getdata {

    @Autowired 
    private SupportDatarepository supportDatarepository;
    @Autowired
    private SummerizerDatarepository summerizerDatarepository;

    public List<SupportData> getEntitiesByDepartment(String department) {
        return supportDatarepository.findBydepartment(department);
    }
    public List<Summerizer> getsummery(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY, 1, 0, 0, 0);
        Date start = calendar.getTime();
        calendar.set(year, Calendar.DECEMBER, 31, 23, 59, 59);
        Date end = calendar.getTime();
        return summerizerDatarepository.findByEndDateBetween(start,end);
    }

    




    
}
