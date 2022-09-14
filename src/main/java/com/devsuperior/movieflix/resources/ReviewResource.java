package com.devsuperior.movieflix.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping(value = "/review")
public class ReviewResource {
	
	@SuppressWarnings("unused")
	private UserService service;
	//
//  @GetMapping(value = "/{id}")
//  public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
//    UserDTO dto = service.findById(id);
//    return ResponseEntity.ok().body(dto);
//  }
}
