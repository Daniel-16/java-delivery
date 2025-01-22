package com.example.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
