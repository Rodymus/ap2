package com.ap2.ap2.controller;

import com.ap2.ap2.models.Skills;
import com.ap2.ap2.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkill(){
        List<Skills> skillsList= skillsService.buscarSkills();
        return new ResponseEntity<>(skillsList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkill(@RequestBody Skills skills){
        Skills nuevaSkill=skillsService.addSkills(skills);
        return new ResponseEntity<>(nuevaSkill, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
