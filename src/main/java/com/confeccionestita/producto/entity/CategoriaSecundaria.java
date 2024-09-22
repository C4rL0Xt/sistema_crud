package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_secundaria")
public class CategoriaSecundaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_secundaria_id")
    private Integer categoriaSecundariaId;

    @Column(name = "nombre")
    private String nombreCategoriaSecundaria;

}
