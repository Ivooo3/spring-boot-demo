package com.demo.springboot.service;

import com.demo.springboot.entity.Release;

public interface ReleaseService {

    Iterable<Release> listReleases();
}
