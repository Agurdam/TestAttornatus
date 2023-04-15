package com.Attornatus.TestAttornatus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Attornatus.TestAttornatus.model.PersonModel;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {

}
