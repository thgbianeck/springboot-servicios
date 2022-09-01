package br.com.bieniek.springboot.app.productos.controllers;

import br.com.bieniek.springboot.app.productos.models.entity.Producto;
import br.com.bieniek.springboot.app.productos.models.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductoController {

    private final IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productoService.findById(id);
    }


}
