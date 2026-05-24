package br.com.fatec.portal_transparencia.controllers;

import br.com.fatec.portal_transparencia.models.FonteDados;
import br.com.fatec.portal_transparencia.services.FonteDadosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fontes")
@CrossOrigin(origins = "*")
public class FonteDadosController {

    private final FonteDadosService service;

    public FonteDadosController(FonteDadosService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FonteDados>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FonteDados> buscarPorId(@PathVariable Long id) {
        Optional<FonteDados> fonte = service.buscarPorId(id);
        return fonte.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FonteDados> salvar(@RequestBody FonteDados fonteDados) {
        return ResponseEntity.ok(service.salvar(fonteDados));
    }
}