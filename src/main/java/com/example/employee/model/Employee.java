package com.example.employee.model;
import jakarta.persistence.*;

@Entity
@Table(name = "employeehierarchy")
public class Employee {
    @Id
    private Integer employeeId;
    
    private String employeeName;
    
    private String managerName;
    
    private Integer pathLevel;
    
    private String pathHierarchy;
    
    private String employeeFormat;

    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Integer getPathLevel() {
        return pathLevel;
    }

    public void setPathLevel(Integer pathLevel) {
        this.pathLevel = pathLevel;
    }

    public String getPathHierarchy() {
        return pathHierarchy;
    }

    public void setPathHierarchy(String pathHierarchy) {
        this.pathHierarchy = pathHierarchy;
    }

    public String getEmployeeFormat() {
        return employeeFormat;
    }

    public void setEmployeeFormat(String employeeFormat) {
        this.employeeFormat = employeeFormat;
    }
}
