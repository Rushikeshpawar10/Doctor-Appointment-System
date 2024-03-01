package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Address;
import com.example.demo.entities.Role;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
