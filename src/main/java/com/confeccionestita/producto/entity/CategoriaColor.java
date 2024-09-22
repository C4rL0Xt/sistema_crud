package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categoria_color")
public class CategoriaColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_color_id")
    private Integer categoriaColorId;

    @Column(name = "nombre")
    private String nombreCategoriaColor;

}
