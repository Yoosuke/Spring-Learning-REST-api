package com.example.api.rest.domain.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>   {
    
}
