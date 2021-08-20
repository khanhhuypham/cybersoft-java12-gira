package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.javabackend.java12.gira.role.dto.CreateProgramDto;
import cybersoft.javabackend.java12.gira.role.dto.ProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;

public interface ProgramService {
	@Transactional(readOnly = true)
	@Query("SELECT p FROM Program p")
	List<ProgramDto> findAll();
	Program saveProgram(CreateProgramDto createProgramDto);
	Program findProgramById(int id);
	void update(Program program, int id);
	void deleteById(int id);
	
}

