package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.AddProgramDto;
import cybersoft.javabackend.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javabackend.java12.gira.role.dto.RoleDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.entity.Role;
import cybersoft.javabackend.java12.gira.role.repository.ProgramRepository;
import cybersoft.javabackend.java12.gira.role.repository.RoleRepository;


//concrete 
@Service
public class RoleServiceImpl implements RoleService {
	private RoleRepository repository;
	private ProgramRepository programRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		repository = roleRepository;
	}
	
	@Override
	public List<RoleDto> findAll() {
		// TODO Auto-generated method stub
		return repository.findAllDto();
	}

	@Override
	public Role addNewRole(CreateRoleDto dto) {
		Role newRole = new Role();
		
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDescription());
		return repository.save(newRole);
		
	}

	@Override
	public Role addProgram(AddProgramDto addProgramDto) {
		Role role = repository.getById(addProgramDto.getRoleId());
		Program program = programRepository.getById(addProgramDto.getProgramId());
		
		role.addProgram(program);
		return repository.save(role);
	}
	
}
