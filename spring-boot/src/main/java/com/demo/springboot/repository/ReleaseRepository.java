package com.demo.springboot.repository;

import com.demo.springboot.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
