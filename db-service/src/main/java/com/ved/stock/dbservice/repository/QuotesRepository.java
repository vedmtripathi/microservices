package com.ved.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ved.stock.dbservice.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote,Integer> {

	List<Quote> findByUsername(String username);

} // ends: interface
