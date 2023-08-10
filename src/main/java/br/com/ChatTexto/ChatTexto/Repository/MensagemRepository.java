package br.com.ChatTexto.ChatTexto.Repository;

import br.com.ChatTexto.ChatTexto.Entity.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
