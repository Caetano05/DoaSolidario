package project.doa.solidario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.doa.solidario.modals.Item;
import project.doa.solidario.modals.enums.Categoria;
import project.doa.solidario.modals.enums.Situacao;
import project.doa.solidario.services.ItemService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController{

    @Autowired
    private ItemService serviceItem;

    @PostMapping
    public ResponseEntity create(@RequestBody Item entity){
        Item save = serviceItem.salvar(entity);
        return ResponseEntity.created(null).body(save);
    }

    @GetMapping
    public ResponseEntity<?> findAll(
            @RequestParam(required = false) Categoria categoria,
            @RequestParam(required = false) Situacao situacao
    ) {
        List<Item> itens = serviceItem.listarTodos(categoria, situacao);
        return ResponseEntity.ok(itens);
    }




    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable("id") Long id){
        Item item = serviceItem.listarPorId(id);
        return ResponseEntity.ok().body(item);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        serviceItem.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Item entity){
        Item ItemAlterado = serviceItem.alterarItem(id, entity);
        return  ResponseEntity.ok().body(ItemAlterado);
    }


}
