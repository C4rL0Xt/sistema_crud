package com.confeccionestita.producto.entity;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Integer productoId;

    @Column(name = "stock")
    private Integer stockProducto;

    @Column(name = "precio")
    private Float precioProducto;

    @Column(name = "descripcion")
    private String descripcionProducto;

    @OneToOne
    @JoinColumn(name = "categoria_color_id")
    private CategoriaColor categoriaColor;

    @OneToOne
    @JoinColumn(name = "categoria_talla_id")
    private CategoriaTalla categoriaTalla;

    @OneToOne
    @JoinColumn(name = "categoria_material_id")
    private CategoriaMaterial categoriaMaterial;

    @OneToOne
    @JoinColumn(name = "categoria_temporada_id")
    private CategoriaTemporada categoriaTemporada;

    @OneToOne
    @JoinColumn(name = "categoria_especifica_id")
    private CategoriaEspecifica categoriaEspecifica;

    @OneToOne
    @JoinColumn(name = "categoria_principal_id")
    private CategoriaPrincipal categoriaPrincipal;
}
