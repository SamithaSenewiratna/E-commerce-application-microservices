package icet.edu.adviser;

import icet.edu.exception.EntryNotFoundException;
import icet.edu.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StandardResponse> handleEntryNotFoundException(EntryNotFoundException e){

        return new ResponseEntity<>(
                new StandardResponse(
                        404,e.getMessage(),e
                ), HttpStatus.NOT_FOUND
        );
    }
}
