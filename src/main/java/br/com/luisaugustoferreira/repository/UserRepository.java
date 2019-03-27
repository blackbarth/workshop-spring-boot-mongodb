package br.com.luisaugustoferreira.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.luisaugustoferreira.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
