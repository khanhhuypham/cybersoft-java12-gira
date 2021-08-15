package cybersoft.javabackend.java12.gira.role.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.javabackend.java12.gira.role.dto.GroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;


@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
	
	@Transactional(readOnly = true)
	@Query("SELECT p FROM Program p")
	List<GroupDto> findAllDto();
	
}
