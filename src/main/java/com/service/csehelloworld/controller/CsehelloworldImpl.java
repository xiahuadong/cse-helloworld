package com.service.csehelloworld.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-23T10:12:48.031Z")

@RestSchema(schemaId = "csehelloworld")
@RequestMapping(path = "/cse-helloworld", produces = MediaType.APPLICATION_JSON)
public class CsehelloworldImpl {

    @Autowired
    private CsehelloworldDelegate userCsehelloworldDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsehelloworldDelegate.helloworld(name);
    }

}
