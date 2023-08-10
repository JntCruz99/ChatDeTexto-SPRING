package br.com.ChatTexto.ChatTexto.Repository;

import br.com.ChatTexto.ChatTexto.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
