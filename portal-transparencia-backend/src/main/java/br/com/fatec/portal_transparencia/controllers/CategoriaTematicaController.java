package br.com.fatec.portal_transparencia.controllers;

import br.com.fatec.portal_transparencia.models.CategoriaTematica;
import br.com.fatec.portal_transparencia.services.CategoriaTematicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias") //a url base deste controlador
@CrossOrigin(origins = "*") //permite que o frontend converse com esta API sem bloqueios de segurança
public class CategoriaTematicaController {

    private final CategoriaTematicaService service;

    public CategoriaTematicaController(CategoriaTematicaService service) {
        this.service = service;
    }

    //URL: GET http://localhost:8080/api/categorias
    @GetMapping
    public ResponseEntity<List<CategoriaTematica>> listarTodas() {
        List<CategoriaTematica> categorias = service.listarTodas();
        return ResponseEntity.ok(categorias); //retorna status 200 (OK) com a lista em JSON
    }

    //URL: GET http://localhost:8080/api/categorias/1
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaTematica> buscarPorId(@PathVariable Long id) {
        Optional<CategoriaTematica> categoria = service.buscarPorId(id);
        return categoria.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build()); //retorna 404 se não achar
    }

    //URL: POST http://localhost:8080/api/categorias
    @PostMapping
    public ResponseEntity<CategoriaTematica> salvar(@RequestBody CategoriaTematica categoria) {
        CategoriaTematica novaCategoria = service.salvar(categoria);
        return ResponseEntity.ok(novaCategoria);
    }
}