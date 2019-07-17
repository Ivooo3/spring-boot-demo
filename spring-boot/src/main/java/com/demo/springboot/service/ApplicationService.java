package com.demo.springboot.service;

import com.demo.springboot.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
}
