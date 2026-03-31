package crud.springboot.crud.service;
import crud.springboot.crud.domain.ListaTarefa;
import crud.springboot.crud.repositories.ListaTarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListaTarefaService {

    private final ListaTarefaRepository listaTarefaRepository;

    public ListaTarefaService(ListaTarefaRepository listaTarefaRepository) {
        this.listaTarefaRepository = listaTarefaRepository;
    }

    public List<ListaTarefa> buscarListaCompleta() {
        return listaTarefaRepository.findAll();
    }

    public ListaTarefa buscarListaById(long id){
        return listaTarefaRepository.getReferenceById(id);
    }

    public ListaTarefa criarTarefa(ListaTarefa listaTarefa) {
        ListaTarefa novaLista = new ListaTarefa();
        novaLista.setNome(listaTarefa.getNome());
        novaLista.setDescricao(listaTarefa.getDescricao());
        novaLista.setStatus(listaTarefa.getStatus());
        return listaTarefaRepository.save(novaLista);
    }

    public ListaTarefa atualizarTarefa(long id, ListaTarefa listaTarefa){
        ListaTarefa tarefaExistente = buscarListaById(id);
        tarefaExistente.setNome(listaTarefa.getNome());
        tarefaExistente.setDescricao(listaTarefa.getDescricao());
        tarefaExistente.setStatus(listaTarefa.getStatus());
        return listaTarefaRepository.save(tarefaExistente);
    }

    public void deletarTarefa(long id){
        listaTarefaRepository.deleteById(id);
    }
}
