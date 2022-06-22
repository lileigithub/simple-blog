package com.blog.simpleblog.dao;

import com.blog.simpleblog.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description
 * @author lilei
 * @date 2022/6/22 16:26
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
