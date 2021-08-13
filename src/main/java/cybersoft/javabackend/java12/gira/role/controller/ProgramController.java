package cybersoft.javabackend.java12.gira.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java12.gira.common.ResponseHandler;
import cybersoft.javabackend.java12.gira.role.dto.ProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.service.ProgramService;

@RestController
@RequestMapping("/api/program")
public class ProgramController {
	private ProgramService programService;
	public ProgramController(ProgramService programService) {
		this.programService = programService;
	}
	
	@GetMapping
	public Object findAllProgram() {
		List<Program> programs = programService.findAll();
		return ResponseHandler.getResponse(programs, HttpStatus.OK);
		
	}
	
	@PostMapping
	public Object saveProgram(@Valid @RequestBody ProgramDto programDto, BindingResult errors) {
		if(errors.hasErrors()) {
			return new ResponseEntity<>(errors.getAllErrors(),HttpStatus.BAD_REQUEST);
		}
		Program addedProgram = programService.addNewProgram(programDto);
		return ResponseHandler.getResponse(addedProgram, HttpStatus.CREATED);
	}
	

}
