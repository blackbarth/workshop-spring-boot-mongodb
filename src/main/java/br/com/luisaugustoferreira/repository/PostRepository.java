package br.com.luisaugustoferreira.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.luisaugustoferreira.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
