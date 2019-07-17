package com.demo.springboot.service.impl;

import com.demo.springboot.entity.Release;
import com.demo.springboot.repository.ReleaseRepository;
import com.demo.springboot.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }
}
