package com.example.admistrator.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

import java.util.Date;  // Use java.util.Date instead of java.sql.Date for MongoDB

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "queries")  // Specify the MongoDB collection name
public class SupportData {
    @Id
    private String id;  // MongoDB uses String for IDs

    private String name;
    private String email;
    private Date date;
    private String department;
    private String query;
}
