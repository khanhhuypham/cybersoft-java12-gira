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
import cybersoft.javabackend.java12.gira.role.dto.GroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.service.GroupService;


@RestController
@RequestMapping("/api/group")
public class GroupController {
	private GroupService groupService;
	
	public GroupController(GroupService groupService) {
		this.groupService = groupService;
	}
	
	@GetMapping
	public Object findAllGroup() {
		List<Group> groups = groupService.findAll();
		return ResponseHandler.getResponse(groups, HttpStatus.OK);
	}
	
	@PostMapping
	public Object saveGroup(@Valid @RequestBody GroupDto groupDto, BindingResult errors) {
		if(errors.hasErrors()) {
			return new ResponseEntity<>(errors.getAllErrors(),HttpStatus.BAD_REQUEST);
		}
		Group addedGroup = groupService.addNewProgram(groupDto);
		return ResponseHandler.getResponse(addedGroup, HttpStatus.CREATED);
	}
	
}
