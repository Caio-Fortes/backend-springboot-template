package crud.springboot.crud.repositories;

import crud.springboot.crud.domain.ListaTarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaTarefaRepository extends JpaRepository<ListaTarefa, Long> {

}
