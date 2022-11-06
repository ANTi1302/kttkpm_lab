package com.example.springredis.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "employee")
//No @Entity concept here
public class Employee implements Serializable {

     private static final long serialVersionUID = -7817224776021728682L;
     @Id
     private String employeeId;
     private String employeeName;
    
     private String employeeAddress;
     private String employeeEmail;
}