package com.example.demo.Service;

import com.example.demo.RepositoryJPA.LanguageRepository;
import com.example.demo.VO.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAll() {
        return languageRepository.findAll();
    }
    public Optional<Language> getLan(int langauge_id) {
        return languageRepository.findById(langauge_id);
    }

    public String delete(int id) {
        languageRepository.deleteById(id);
        return id + "제품 삭제되었습니다.";
    }

//    public Optional<Language> insert() {
//
//        return languageRepository.
//    }

}
