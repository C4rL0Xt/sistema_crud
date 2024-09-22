package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_temporada")
public class CategoriaTemporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_temporada_id")
    private Integer categoriaTemporadaId;

    @Column(name = "nombre")
    private String nombreCategoriaTemporada;
}
