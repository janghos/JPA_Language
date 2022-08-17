package com.example.demo.Controller;


import com.example.demo.Service.LanguageService;
import com.example.demo.VO.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/language")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    @GetMapping("/list")
    public List<Language> getAll() {
        return languageService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Language> getLan(@PathVariable("id")int id) {
        return languageService.getLan(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        languageService.delete(id);
    }

//    @PostMapping("insert")
//    public  Optional<Language> insert(@RequestBody Language language) {
//        languageService.
//    }


}
