package prueba.Mongo.controller;

import org.springframework.web.bind.annotation.*;
import prueba.Mongo.model.Producto;
import prueba.Mongo.repository.ProductoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> obtenerTodos() {
        return repo.findAll();
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return repo.save(producto);
    }
}
