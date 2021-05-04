package com.revature.repositories;

import com.revature.models.PracticeUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepo extends CrudRepository<PracticeUser, Integer> {

}
