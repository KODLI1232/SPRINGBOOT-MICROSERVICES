package Com.self.SpringBoot.Exception;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandling {
	
	// eception handler method for : MethodArgumentNotValidException
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){
		
		List<FieldError> errors =	ex.getFieldErrors();
	
	Map<String,String> response1=	errors.stream().collect(Collectors.toMap(e-> e.getField(), e->e.getDefaultMessage()));

		
		List<FieldError> errors1 =	ex.getFieldErrors();
		List<String> validationErrors = errors1.stream().map(e->e.getField()+ ":" +e.getDefaultMessage()).toList();
	return ResponseEntity.badRequest().body(validationErrors);
		
	}

//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){
//		
////	List<FieldError> errors =	ex.getFieldErrors();
////		
////	Map<String,String> response=	errors.stream().collect(Collectors.toMap(e-> e.getField(), e->e.getDefaultMessage()));
//		
//		//Validation failed for argument [0]
//		
//		List<FieldError> errors =	ex.getFieldErrors();
//		List<String> validationErrors = errors.stream().map(e->e.getField()+ ":" +e.getDefaultMessage()).toList();
//	return ResponseEntity.badRequest().body(validationErrors);
//		
//	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleExceptions(Exception ex){
		
		return ResponseEntity.internalServerError().body("Internal Sever down, try after sometime");
	}
	

}
