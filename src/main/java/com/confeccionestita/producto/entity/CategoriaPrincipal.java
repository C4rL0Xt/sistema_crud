package com.confeccionestita.producto.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_principal")
public class CategoriaPrincipal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_principal_id")
    private Integer categoriaPrincipalId;

    @Column(name = "nombre")
    private String nombreCategoriaPrincipal;
}
