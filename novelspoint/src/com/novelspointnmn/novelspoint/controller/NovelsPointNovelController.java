package com.novelspointnmn.novelspoint.controller;

import com.novelspointnmn.novelspoint.model.NovelsPointNovel;
import com.novelspointnmn.novelspoint.repository.NovelsPointNovelRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/novel")
public class NovelsPointNovelController {

    @Autowired
    NovelsPointNovelRepository novelRepository;

    @PostMapping
    public NovelsPointNovel createNovel(@RequestBody NovelsPointNovel novel) {
         return novelRepository.insert(novel);
    }

    @GetMapping
    public List<NovelsPointNovel> getAllNovels() {
        return novelRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<NovelsPointNovel> getNovelById(String id) {
        return novelRepository.findNovelByTitle(id);
    }

    @GetMapping("/{title}")
    public Optional<NovelsPointNovel> getNovelByTitle(String title) {
        return novelRepository.findNovelByTitle(title);
    }
}
