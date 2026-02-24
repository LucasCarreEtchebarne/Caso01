package com.caso1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
public Integer getIdArticulo() {
    return idArticulo;
}

public void setIdArticulo(Integer idArticulo) {
    this.idArticulo = idArticulo;
}

public String getImagenArticulo() {
    return imagenArticulo;
}

public void setImagenArticulo(String imagenArticulo) {
    this.imagenArticulo = imagenArticulo;
}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Integer idArticulo;

    @Column(name = "detalle", length = 30)
    private String detalle;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "fecha_vence", length = 10)
    private String fechaVence;

    @Column(name = "imagen_articulo", length = 1024)
    private String imagenArticulo;

    }


