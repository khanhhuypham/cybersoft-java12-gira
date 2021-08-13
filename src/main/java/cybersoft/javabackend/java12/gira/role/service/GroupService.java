package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.GroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;

public interface GroupService {
	List<Group> findAll();
	Group addNewProgram(GroupDto groupDto);
	Group findProgramById(int id);
	void update(Group group, int id);
	void deleteById(int id);
}
