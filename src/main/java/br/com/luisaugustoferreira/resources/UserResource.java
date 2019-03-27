package br.com.luisaugustoferreira.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.luisaugustoferreira.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Cristino", "alex@gmail.com");
		User dora = new User("3", "Dora Lice", "dora@gmail.com");
		User chico = new User("4", "Chico Bento", "chico@gmail.com");
		User luis = new User("5", "Luis Augusto", "luis@gmail.com");
		User gilberto = new User("6", "Gilberto Reis", "gilberto@gmail.com");
		List<User> list = new ArrayList<>();

		list.addAll(Arrays.asList(maria, alex, dora, chico, luis, gilberto));

		return ResponseEntity.ok().body(list);
	}
}
