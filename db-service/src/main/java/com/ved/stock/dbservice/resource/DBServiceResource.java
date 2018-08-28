package com.ved.stock.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ved.stock.dbservice.model.Quote;
import com.ved.stock.dbservice.model.Quotes;
import com.ved.stock.dbservice.repository.QuotesRepository;

@RestController
@RequestMapping("/rest/db")
public class DBServiceResource {

	private QuotesRepository quotesRepository;

	@GetMapping("/{username}")
	public List<String> getQuotes(@PathVariable("username") final String username){
		
		return quotesRepository.findByUsername(username)
				.stream()
				.map(Quote::getQuote)
				.collect(Collectors.toList());
	} //ends: getQuotes() 
	
	@PostMapping("/add")
	public List<String> add(@RequestBody final Quotes quotes){
		
		return null;
		
	} // ends: add()
	
} // ends: class
