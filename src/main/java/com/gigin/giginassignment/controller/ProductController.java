package com.gigin.giginassignment.controller;


import com.gigin.giginassignment.dto.JobModel;
import com.gigin.giginassignment.dto.RequestModel;
import com.gigin.giginassignment.service.AuthenticationService;
import com.gigin.giginassignment.service.JobList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

@RestController
public class ProductController {
RequestModel model;
    JobModel jobModel;
    JobList jobList;
AuthenticationService authenticationService;
public ProductController(AuthenticationService authenticationService){
 this.authenticationService = authenticationService;
}
    @PostMapping("/login")
public ResponseEntity<String> login(@RequestBody RequestModel model){
authenticationService.authenticateLogin(model.getEmailId(),model.getPassword());
return new ResponseEntity<>(HttpStatus.OK);
}

@PostMapping("/json/to/pojo")
    private void getInputStream(String fileName) throws IOException, FileNotFoundException {
        InputStream inputStream = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        inputStream = fileName != null && fileName.endsWith(".json") ? new GZIPInputStream(fileInputStream)
                : fileInputStream;


    }

    @GetMapping("/v4/gigs/postings/list")
    public List<String> getJobListbyEmployeeId(@RequestBody JobModel jobModel ){
    return jobList.getList(jobModel.getId());

    }
}
