package com.blog.simpleblog;

import com.blog.simpleblog.entity.Employee;

/**
 * description
 * @author lilei
 * @date 2022/6/22 16:51
 */
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id){
        super("Could not find employee "+ id);
    }
}
