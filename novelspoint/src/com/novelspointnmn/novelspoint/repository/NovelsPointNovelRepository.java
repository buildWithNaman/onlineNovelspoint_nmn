package com.novelspointnmn.novelspoint.repository;

import com.novelspointnmn.novelspoint.model.NovelsPointNovel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NovelsPointNovelRepository extends MongoRepository<NovelsPointNovel, String> {

    Optional<NovelsPointNovel> findNovelById(String id);
    Optional<NovelsPointNovel> findNovelByTitle(String title);
    Optional<NovelsPointNovel> findNovelByBestSeller(String bestSeller);

}
