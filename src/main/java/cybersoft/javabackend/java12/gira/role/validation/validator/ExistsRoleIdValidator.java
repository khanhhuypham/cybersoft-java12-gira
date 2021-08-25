package cybersoft.javabackend.java12.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cybersoft.javabackend.java12.gira.common.util.ValidatorUtils;
import cybersoft.javabackend.java12.gira.role.service.RoleService;
import cybersoft.javabackend.java12.gira.role.validation.annotation.ExistsRoleId;

public class ExistsRoleIdValidator implements ConstraintValidator<ExistsRoleId, Long> {
	private String message;
	private RoleService programService;
	
	public ExistsRoleIdValidator(RoleService roleService) {
		this.programService = roleService;
	}
	
	@Override
	public void initialize(ExistsRoleId constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Long roleId, ConstraintValidatorContext context) {
		boolean isExisted = programService.isExistedId(roleId);
		
		if(isExisted)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
