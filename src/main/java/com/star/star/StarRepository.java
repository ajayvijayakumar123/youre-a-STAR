package com.star.star;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annotation makes it easy to use: get, post, put, update, delete
@RepositoryRestResource(collectionResourceRel = "stars", path = "stars")
public interface StarRepository extends MongoRepository<Star, String> {
    List<Star> findBySituation(@Param("situation") String situation);
}
