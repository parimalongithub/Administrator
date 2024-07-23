package com.example.admistrator.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.admistrator.data.support_data;


@Repository
public interface repository extends CrudRepository<support_data,Long> {

}


