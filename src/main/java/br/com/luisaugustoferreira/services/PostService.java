package br.com.luisaugustoferreira.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisaugustoferreira.domain.Post;
import br.com.luisaugustoferreira.repository.PostRepository;
import br.com.luisaugustoferreira.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;



	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	}

}
