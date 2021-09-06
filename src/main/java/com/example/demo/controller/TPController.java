package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.TP;
import com.example.demo.service.interfaces.CourseService;
import com.example.demo.service.interfaces.TPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/tps")
public class TPController {
    @Autowired
    private TPService tpService;

    @GetMapping
    public ResponseEntity<List<TP>> getTPs() {
        List<TP> tps = tpService.getTPs();
        return new ResponseEntity<>(tps, HttpStatus.OK);
    }
}
