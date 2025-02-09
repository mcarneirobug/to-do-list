package br.com.slandrade.todolist.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "User already exists")
public class UserAlreadyExistException extends Exception {

  public UserAlreadyExistException(String message) {
    super(message);
  }
}
