package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnym.entity.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant,Long>{

}
