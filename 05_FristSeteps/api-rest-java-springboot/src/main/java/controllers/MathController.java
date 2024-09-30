package controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.NumberConverter;
import br.com.erudio.exceptions.UnsuportedMathOperationException;

@RestController
public class MathController {
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo
			) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value!");
		}
		return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);

	}
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(
			@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo
			) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value!");
		}
		return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);

	}
	
	@GetMapping("/multi/{numberOne}/{numberTwo}")
	public Double multi(
			@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo
			) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value!");
		}
		return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);

	}
	
	

}
