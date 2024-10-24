package com.meghna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meghna.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
