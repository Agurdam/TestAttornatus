package com.Attornatus.TestAttornatus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Attornatus.TestAttornatus.model.AddressModel;


public interface AddressRepository extends JpaRepository<AddressModel, Long> {

}
