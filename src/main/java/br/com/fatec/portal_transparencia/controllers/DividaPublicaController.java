package br.com.fatec.portal_transparencia.controllers;

import br.com.fatec.portal_transparencia.models.DividaPublica;
import br.com.fatec.portal_transparencia.services.DividaPublicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dividas")
@CrossOrigin(origins = "*")
public class DividaPublicaController {

    private final DividaPublicaService service;

    public DividaPublicaController(DividaPublicaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DividaPublica>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DividaPublica> buscarPorId(@PathVariable Long id) {
        Optional<DividaPublica> divida = service.buscarPorId(id);
        return divida.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DividaPublica> salvar(@RequestBody DividaPublica dividaPublica) {
        return ResponseEntity.ok(service.salvar(dividaPublica));
    }
}