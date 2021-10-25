package com.ironhack.leadservice.controller;

import com.ironhack.leadservice.dao.Lead;
import com.ironhack.leadservice.dto.LeadDTO;
import com.ironhack.leadservice.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/lead")
public class LeadController {

    @Autowired
    LeadService leadService;

    @PostMapping("/new")
    public Lead create(@RequestBody @Valid LeadDTO leadDTO){
        return leadService.validateCreate(leadDTO);
    }
}
