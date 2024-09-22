package com.confeccionestita.producto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categoria_talla")
public class CategoriaTalla {

    @Id
    @Column(name = "categoria_talla_id")
    private String categoriaTallaId;

    @Column(name = "nombre")
    private String nombreCategoriaTalla;

}
