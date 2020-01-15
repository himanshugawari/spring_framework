package com.gawari._himanshu.springbootin10steps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gawari._himanshu.springbootin10steps.model.Books;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return Arrays.asList(new Books(1l, "King of Kings", "Himanshu Gawari"));
	}

}
