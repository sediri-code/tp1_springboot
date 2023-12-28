package com.pi.departmentservice.model.Department;

import java.util.ArrayList;
import java.util.List;

public class Department {
private Long id;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
private List<Employee> employees = new ArrayList<>();
public Department(Long id, String name) {
    this.id = id;
    this.name = name;
}
public Department() {
}

public List<Employee> getEmployees() {
    return employees;
}
public void setEmployees(List<Employee> employees) {
    this.employees = employees;
}
@Override
public String toString() {
    return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
}
}
