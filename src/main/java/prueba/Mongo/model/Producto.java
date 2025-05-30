package prueba.Mongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    private String id;
    private String nombre;
    private double precio;
}
