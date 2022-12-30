package com.ap2.ap2.services;

import com.ap2.ap2.models.Educacion;
import com.ap2.ap2.models.Experiencia;
import com.ap2.ap2.repository.EducacionRepo;
import com.ap2.ap2.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ExperienciaService {

        private final ExperienciaRepo experienciaRepo;

        @Autowired
        public ExperienciaService(ExperienciaRepo experienciaRepo) {
            this.experienciaRepo = experienciaRepo;
        }
        public Experiencia addExperiencia(Experiencia experiencia){
            return experienciaRepo.save(experiencia);
        }
        public List<Experiencia> buscarExperiencias(){
            return experienciaRepo.findAll();
        }

        public Experiencia editarExperiencia(Experiencia experiencia){
            return experienciaRepo.save(experiencia);
        }
        public void borrarExperiencia(Long id){
            experienciaRepo.deleteById(id);
        }

}
