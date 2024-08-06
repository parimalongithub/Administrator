package com.example.admistrator.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.admistrator.data.SupportData;


@Repository
public interface repository extends MongoRepository<SupportData,String> {
    List<SupportData> findBydepartment(String department);


}


