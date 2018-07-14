package br.cvm.eti.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.cvm.eti.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/books")
	public String books(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		
		return "books";
	}
}
