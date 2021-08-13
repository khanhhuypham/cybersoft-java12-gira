package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.ProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.repository.ProgramRepository;

@Service
public class ProgramServiceImpl implements ProgramService {
	private ProgramRepository programRepository;
	
	public ProgramServiceImpl(ProgramRepository programRepository) {
		this.programRepository = programRepository;
	}
	
	@Override
	public List<Program> findAll() {
		// TODO Auto-generated method stub
		return programRepository.findAll();
	}

	@Override
	public Program addNewProgram(ProgramDto programDto) {
		Program newProgram = new Program();
		newProgram.setName(programDto.getName());
		newProgram.setMethod(programDto.getMethod());
		newProgram.setPath(programDto.getPath());
		return programRepository.save(newProgram);
	}

	@Override
	public Program findProgramById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Program program, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		programRepository.deleteById((long) id);
		
	}
	

}
