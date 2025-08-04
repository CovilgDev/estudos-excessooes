package br.com.dio.validator;

import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

public class UserValidator {

	private UserValidator() {
		
	}
	
	public static void verifyModel(final UserModel model) throws ValidatorException {
		if(stringisBlank(model.getName()))
			throw new ValidatorException("Informe um nome válido");
		if(model.getName().length() <= 1)
			throw new ValidatorException("O nome deve conter mais de 1 caracter");
		if(stringisBlank(model.getEmail()))
			throw new ValidatorException("Informe um email válido");
		if((!model.getEmail().contains("@")) || (!model.getEmail().contains(".")))
			throw new ValidatorException("Informe um email valido");
	}
	
	private static boolean stringisBlank(final String value) {
		return value == null || value.isBlank();
	}
}
