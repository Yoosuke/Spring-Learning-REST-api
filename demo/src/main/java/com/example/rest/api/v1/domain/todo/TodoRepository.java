package com.example.rest.api.v1.domain.todo;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(collectionResourceRel = "todo", path="todos")
public interface TodoRepository extends PagingAndSortingRepository<TodoEntity, Long>{
   
}
