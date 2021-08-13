package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.GroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.repository.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService {
	private GroupRepository groupRepository;
	
	@Override
	public List<Group> findAll() {
		return groupRepository.findAll();
	}

	@Override
	public Group addNewProgram(GroupDto groupDto) {
		Group newGroup = new Group();
		newGroup.setName(groupDto.getName());
		newGroup.setDescription(groupDto.getDescription());
		return groupRepository.save(newGroup);
	}

	@Override
	public Group findProgramById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Group group, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
