package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.ProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;

public interface ProgramService {
	List<Program> findAll();
	Program addNewProgram(ProgramDto programDto);
	Program findProgramById(int id);
	void update(Program program, int id);
	void deleteById(int id);
	
}

