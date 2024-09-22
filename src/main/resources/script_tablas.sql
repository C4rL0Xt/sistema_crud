CREATE TABLE categoria_principal (
	categoria_principal_id INT PRIMARY KEY,
	nombre VARCHAR(100) 
)

CREATE TABLE categoria_secundaria (
	categoria_secundaria_id INT PRIMARY KEY,
	nombre VARCHAR(100)
)


CREATE TABLE categoria_especifica (
	categoria_especifica_id INT PRIMARY KEY,
	nombre VARCHAR(100),
	categoria_secundaria_id INT,
	CONSTRAINT fk_categoria_secundaria FOREIGN KEY (categoria_secundaria_id) REFERENCES categoria_secundaria(categoria_secundaria_id)
)

CREATE TABLE categoria_temporada (
	categoria_temporada_id INT PRIMARY KEY,
	nombre VARCHAR(100)
)

CREATE TABLE categoria_talla (
	categoria_talla_id VARCHAR(10) PRIMARY KEY,
	nombre VARCHAR(50)
)

CREATE TABLE categoria_color (
	categoria_color_id INT PRIMARY KEY,
	nombre VARCHAR(100)
)

CREATE TABLE categoria_material (
	categoria_material_id INT PRIMARY KEY,
	nombre VARCHAR(100)
)




CREATE TABLE productos (
	producto_id INT PRIMARY KEY,
	stock INT,
	precio FLOAT,
	descripcion VARCHAR(200),
	categoria_color_id INT,
	categoria_talla_id VARCHAR(10),
	categoria_material_id INT,
	categoria_temporada_id INT,
	categoria_especifica_id INT,
	categoria_principal_id INT,
	CONSTRAINT fk_categoria_color FOREIGN KEY (categoria_color_id) REFERENCES categoria_color(categoria_color_id),
	CONSTRAINT fk_categoria_talla FOREIGN KEY (categoria_talla_id) REFERENCES categoria_talla(categoria_talla_id),
	CONSTRAINT fk_categoria_material FOREIGN KEY (categoria_material_id) REFERENCES categoria_material(categoria_material_id),
	CONSTRAINT fk_categoria_temporada FOREIGN KEY (categoria_temporada_id) REFERENCES categoria_temporada(categoria_temporada_id),
	CONSTRAINT fk_categoria_especifica FOREIGN KEY (categoria_especifica_id) REFERENCES categoria_especifica(categoria_especifica_id),
	CONSTRAINT fk_categoria_principal FOREIGN KEY (categoria_principal_id) REFERENCES categoria_principal(categoria_principal_id) 
)