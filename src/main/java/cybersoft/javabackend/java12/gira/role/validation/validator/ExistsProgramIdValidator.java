package cybersoft.javabackend.java12.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cybersoft.javabackend.java12.gira.common.util.ValidatorUtils;
import cybersoft.javabackend.java12.gira.role.service.ProgramService;
import cybersoft.javabackend.java12.gira.role.validation.annotation.ExistsProgramId;

public class ExistsProgramIdValidator implements ConstraintValidator<ExistsProgramId, Long> {
	private String message;
	private ProgramService programService;
	
	public ExistsProgramIdValidator(ProgramService programService) {
		this.programService = programService;
	}
	
	@Override
	public void initialize(ExistsProgramId constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	@Override
	public boolean isValid(Long programId, ConstraintValidatorContext context) {
		boolean isExisted = programService.isExistedId(programId);
		
		if(isExisted)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
