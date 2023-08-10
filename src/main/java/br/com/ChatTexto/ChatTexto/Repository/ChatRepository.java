package br.com.ChatTexto.ChatTexto.Repository;

import br.com.ChatTexto.ChatTexto.Entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
