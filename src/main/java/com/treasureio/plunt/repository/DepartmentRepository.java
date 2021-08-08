package com.treasureio.plunt.repository;

import com.treasureio.plunt.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Method to return department details from the name (Case sensitive)
    public Department findByDepartmentName(String departmentName);

    //Method to return department details from the name (Case insensitive)
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
