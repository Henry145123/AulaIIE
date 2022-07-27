package com.idat.AulaIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.AulaIIE.model.Aula;
import com.idat.AulaIIE.service.AulaService;


@Controller
@RequestMapping("/api/aula/v1")
public class AulaController {
		
	@Autowired
	private AulaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Aula> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Aula obtener(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Aula aula) {
		service.guardar(aula);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Void> actualizar(@RequestBody Aula aula) {
		service.actualizar(aula);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
