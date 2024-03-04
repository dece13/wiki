package com.wiki.wiki.repository;

import org.springframework.data.repository.CrudRepository;
import com.wiki.wiki.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}

