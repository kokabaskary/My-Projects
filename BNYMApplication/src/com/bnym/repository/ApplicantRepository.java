package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;

import com.bnym.entity.Applicant;

public interface ApplicantRepository extends CrudRepository<Applicant,Long>{

}
