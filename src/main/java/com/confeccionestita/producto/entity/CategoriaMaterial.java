package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_material")
public class CategoriaMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_material_id")
    private Integer categoriaMaterialId;

    @Column(name = "nombre")
    private String nombreCategoriaMaterial;

}
