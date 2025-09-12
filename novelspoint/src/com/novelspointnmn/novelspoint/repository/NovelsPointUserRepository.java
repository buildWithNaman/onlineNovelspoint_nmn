package com.novelspointnmn.novelspoint.repository;

import com.novelspointnmn.novelspoint.model.NovelsPointUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NovelsPointUserRepository extends MongoRepository<NovelsPointUser, String> {

    Optional<NovelsPointUser> findUserByUserName(String userName);
    Optional<NovelsPointUser> findUserByEmail(String email);

}
