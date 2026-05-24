package br.com.fatec.portal_transparencia.controllers;

import br.com.fatec.portal_transparencia.models.GastoSocial;
import br.com.fatec.portal_transparencia.services.GastoSocialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gastos")
@CrossOrigin(origins = "*")
public class GastoSocialController {

    private final GastoSocialService service;

    public GastoSocialController(GastoSocialService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GastoSocial>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GastoSocial> buscarPorId(@PathVariable Long id) {
        Optional<GastoSocial> gasto = service.buscarPorId(id);
        return gasto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GastoSocial> salvar(@RequestBody GastoSocial gastoSocial) {
        return ResponseEntity.ok(service.salvar(gastoSocial));
    }
}