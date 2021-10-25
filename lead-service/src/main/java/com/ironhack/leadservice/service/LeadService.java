package com.ironhack.leadservice.service;

import com.ironhack.leadservice.dao.Lead;
import com.ironhack.leadservice.dto.LeadDTO;
import com.ironhack.leadservice.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LeadService {

    @Autowired
    LeadRepository repository;

    public Lead validateCreate(LeadDTO leadDTO){
        Lead lead = new Lead(leadDTO.getName());
        return repository.save(lead);
    }
}
