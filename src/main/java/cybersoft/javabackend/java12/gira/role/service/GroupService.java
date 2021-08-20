package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javabackend.java12.gira.role.dto.GroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;

public interface GroupService {
	List<GroupDto> findAll();
	Group saveGroup(CreateGroupDto createGroupDto);
	Group findProgramById(int id);
	void update(Group group, int id);
	void deleteById(int id);
}
