package com.syntel.hackathon.service;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.syntel.hackathon.model.Input;

@RepositoryRestResource
public interface InputRepository extends JpaRepository <Input, Long>{

	@RestResource(path="by-name")
	Collection<Input> findByName(@Param("in") String in);
}
