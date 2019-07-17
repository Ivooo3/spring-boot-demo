package com.demo.springboot.service.impl;

import com.demo.springboot.entity.Application;
import com.demo.springboot.repository.ApplicationRepository;
import com.demo.springboot.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<Application> listApplications() {
        return applicationRepository.findAll();
    }
}
