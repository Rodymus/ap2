package com.ap2.ap2.repository;

import com.ap2.ap2.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
