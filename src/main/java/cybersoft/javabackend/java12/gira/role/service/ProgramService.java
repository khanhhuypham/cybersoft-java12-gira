package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.CreateProgramDto;
import cybersoft.javabackend.java12.gira.role.dto.ProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;

public interface ProgramService {

	List<ProgramDto> findAll();

	Program saveProgram(CreateProgramDto dto);

	boolean isExistedId(Long programId);
	
}
