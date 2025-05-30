package prueba.Mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import prueba.Mongo.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
