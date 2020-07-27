package com.example.todoapp.controllers;

import javax.validation.Valid;


import com.example.todoapp.models.Todo;
import com.example.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api")
public class TodoController{
	@Autowired
	private TodoRepository todoRepository;

	
@PostMapping("/todoss")
public Todo create(@RequestBody Todo todo) {
	return todoRepository.save(todo);
}

//
//@GetMapping("/get")
//public Todo getCustomer(String emailid) {
//	return todoRepository.findByEmailid(emailid);
//}

@GetMapping("/getAll")

public List<Todo>getAll(){
return todoRepository.findAll();

}
@GetMapping(value="/todos/{id}")
public ResponseEntity<Todo> getTodoById(@PathVariable("id") String id) {
    return todoRepository.findById(id)
            .map(todo -> ResponseEntity.ok().body(todo))
            .orElse(ResponseEntity.notFound().build());
}
@PutMapping("/update")	

public Todo update(@RequestBody Todo todo) {
return todoRepository.save(todo);
}
@DeleteMapping("/delete")

public void delete(@RequestBody Todo todo) {
 todoRepository.delete(todo);
}

@DeleteMapping("/deleteAll")

public void deleteAll() {
todoRepository.deleteAll();
}

@DeleteMapping(value="/todos/{id}")
public ResponseEntity<?> deleteTodo(@PathVariable("id") String id) {
    return todoRepository.findById(id)
            .map(todo -> {
                todoRepository.deleteById(id);
                return ResponseEntity.ok().build();
            }).orElse(ResponseEntity.notFound().build());
}

}