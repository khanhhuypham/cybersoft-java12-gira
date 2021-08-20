package cybersoft.javabackend.java12.gira.common.util;

import java.util.LinkedList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class ErrorUtils {
	public static List<String> getErrorMessages(BindingResult errors){
		
		List<String> messages = new LinkedList<>();
		for(ObjectError error : errors.getAllErrors()) {
			messages.add(error.getDefaultMessage());
		}
		
		return messages;

	}
}
