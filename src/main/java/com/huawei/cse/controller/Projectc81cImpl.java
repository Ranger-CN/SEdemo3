package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-12T14:00:03.713Z")

@RestSchema(schemaId = "projectc81c")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectc81cImpl {

    @Autowired
    private Projectc81cDelegate userProjectc81cDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectc81cDelegate.helloworld(name);
    }

}
