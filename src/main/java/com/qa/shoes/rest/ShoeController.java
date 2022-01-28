package com.qa.shoes.rest;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.shoes.domain.Shoe;

@RestController
public class ShoeController {

	private List<Shoe> shoes = new ArrayList<>();

	@PostMapping("/addShoe")
	public ResponseEntity<Shoe> addShoe(@RequestBody Shoe s) {
		this.shoes.add(s);
		Shoe newShoe = this.shoes.get(shoes.size() - 1);
		return new ResponseEntity<Shoe>(newShoe, HttpStatus.CREATED);
	}

	@GetMapping("/getShoe")
	public ResponseEntity<Shoe> getShoe(@PathParam("id") int id) {
		Shoe thisShoe = this.shoes.get(id);
		return new ResponseEntity<Shoe>(thisShoe, HttpStatus.FOUND);
	}

	@PutMapping("/updateShoe")
	public ResponseEntity<Shoe> updateShoe(@PathParam("id") int id, @RequestBody Shoe s) {
		Shoe shoeUpdated = this.shoes.get(id);
		this.shoes.set(id, s);
		return new ResponseEntity<Shoe>(shoeUpdated, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteShoe")
	public ResponseEntity<Shoe> deleteShoe(@PathParam("id") int id) {
		Shoe shoeDeleted = this.shoes.get(id);
		this.shoes.remove(id);
		return new ResponseEntity<Shoe>(shoeDeleted, HttpStatus.ACCEPTED);
	}

}
