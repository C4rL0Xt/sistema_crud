package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_especifica")
public class CategoriaEspecifica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_especifica_id")
    private Integer categoriaEspecificaId;

    @Column(name = "nombre")
    private String nombreCategoriaEspecifica;

    @OneToOne
    @JoinColumn(name = "categoria_secundaria_id")
    private CategoriaSecundaria categoriaSecundaria;

}
