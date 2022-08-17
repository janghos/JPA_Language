package com.example.demo.RepositoryJPA;

import com.example.demo.VO.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
