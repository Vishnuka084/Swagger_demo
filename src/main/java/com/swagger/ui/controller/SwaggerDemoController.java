package com.swagger.ui.controller;

import com.swagger.ui.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/25/2024
 * @project : Swagger-demo
 */

@RestController
public class SwaggerDemoController {

    @GetMapping("/viewStudent")
    public ResponseEntity<Student> show(){
        return new ResponseEntity(new Student(), HttpStatus.OK);
    }

}
