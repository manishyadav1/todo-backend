package com.team29.plagiarismdetector.repositories;
import com.team29.plagiarismdetector.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String>{
}
