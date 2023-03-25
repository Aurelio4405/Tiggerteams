package com.apirest.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.modelo.apirest;
import com.apirest.repository.ApirestRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RequestMapping({"estudiantes"})
public class ApirestController {
	
	@Autowired
	private ApirestRepository repository;
	
	@GetMapping("listar")
	public List<apirest> listarApirests(){
		List<apirest> apirests = (List<apirest>)repository.findAll();
		return apirests;
	}
	
	@PostMapping
	public apirest agregarApiRest(@RequestBody apirest apirest) {
		return repository.save(apirest);
	}
	
	@GetMapping("{id}")
	public Optional<apirest> getApiById(@PathVariable int id){
		return repository.findById(id);
	}
	
	@PutMapping("/{id}")
	public apirest modificarApi(@RequestBody apirest apirest, @PathVariable int id) {
		apirest.setId(id);
		return repository.save(apirest);
	}
	
	@DeleteMapping("{id}")
	public void eliminarApi(@PathVariable int id) {
		repository.deleteById(id);
	}
	

}
