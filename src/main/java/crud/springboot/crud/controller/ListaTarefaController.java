package crud.springboot.crud.controller;

import crud.springboot.crud.domain.ListaTarefa;
import crud.springboot.crud.service.ListaTarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend")
public class ListaTarefaController {

    private final ListaTarefaService listaTarefaService;

    public ListaTarefaController(ListaTarefaService listaTarefaService){
        this.listaTarefaService = listaTarefaService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/buscar-tarefas")
    public List<ListaTarefa> BuscarTarefas(){
        return listaTarefaService.buscarListaCompleta();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/buscar-tarefa/{id}")
    public ListaTarefa buscarTarefaPorId(@PathVariable int id){
        return listaTarefaService.buscarListaById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/criar-tarefa")
    public ListaTarefa criarTarefa(@RequestBody ListaTarefa listaTarefa){
        return listaTarefaService.criarTarefa(listaTarefa);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/atualizar-tarefa/{id}")
    public ListaTarefa atualizarTarefa(@PathVariable int id, @RequestBody ListaTarefa listaTarefa){
        return listaTarefaService.atualizarTarefa(id, listaTarefa);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/deletar-tarefa/{id}")
    public void deletarTarefa(@PathVariable int id){
        listaTarefaService.deletarTarefa(id);
    }
}
