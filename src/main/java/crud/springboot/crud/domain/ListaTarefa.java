package crud.springboot.crud.domain;
import crud.springboot.crud.enums.StatusTarefa;
import jakarta.persistence.*;

@Entity
@Table(name = "tarefas")
public class ListaTarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    public Long getId() {
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status){
        this.status = status;
    }
}
