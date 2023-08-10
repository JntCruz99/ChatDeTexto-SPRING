package br.com.ChatTexto.ChatTexto.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.bridge.Message;

import java.util.List;

@Entity
@Table(name = "tb_chat")
@Getter
@Setter
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name="chat_usuario", joinColumns=
            {@JoinColumn(name="chat_id")}, inverseJoinColumns=
            {@JoinColumn(name="usuario_id")})
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "chat")
    private List<Mensagem> mensagems;
}
