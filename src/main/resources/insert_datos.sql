INSERT INTO categoria_principal(nombre) VALUES 
	('MUJER'),
	('HOMBRE'),
	('NI�O'),
	('NI�A'),
	('Unisex'),
	('Beb�');

INSERT INTO categoria_temporada(nombre) VALUES
	('Verano'),
	('Invierno'),
	('Oto�o'),
	('Primavera'),
	('Todo el a�o');

INSERT INTO categoria_secundaria(nombre) VALUES
	('Casual'),
    ('Deportiva'),
    ('Fiesta'),
    ('Playa'),
	('Ropa interior'),
	('Escolar'),
	('Formal'),
	('Dormir');

INSERT INTO categoria_especifica(nombre,categoria_secundaria_id) VALUES
	('Brasier',1),
	('Buzo',2),
	('Vestido',3),
	('Calcetin',1),
	('Boxer', 1),      
    ('Polo', 2),      
    ('Blazer', 3),     
    ('Pijama', 4),;

INSERT INTO categoria_color(nombre) VALUES
	('Blanco'),
    ('Verde'),
    ('Gris'),
    ('Rosa'),
    ('Naranja'),
	('Rojo'),
	('Azul'),
	('Amarillo'),
	('Coral'),
	('Negro');

INSERT INTO categoria_material(nombre) VALUES
	('Algodon pima'),
	('Poliester'),
	('Rip'),
	('Algodon'),
	('Lino'),
    ('Nylon'),
    ('Seda'),
    ('Denim'),
	('Jean');

INSERT INTO categoria_talla(categoria_talla_id, nombre) VALUES
	('0',''),('2',''),('4',''),('6',''),('8',''),('10',''),('12',''),('14',''),('16',''),('26',''),('28',''),('30',''),('32',''),('34',''),('36',''),('38',''),('40',''),
	('S','Small'),
	('M','Medium'),
	('L','Large'),
	('XL','Extra large'),
	('XXL','Extra Extra large'),
	('XXXL','Extra Extra Extra large'),
	('XS','Extra Small'),;


INSERT INTO productos(stock,precio,descripcion,categoria_color_id,categoria_talla_id,categoria_material_id,categoria_temporada_id,categoria_especifica_id,categoria_principal_id) VALUES
	(25, 80.0, 'Buzo escolar de algod�n', 2, 'M', 4, 1,2,5), 
    (10, 120.0, 'Vestido formal de poli�ster', 5, 'S', 2, 2,3,1),
    (30, 90.0, 'Calcet�n de algod�n para invierno', 4, 'L', 1, 3,4,5), 
    (15, 65.0, 'Polo casual de poli�ster', 3, 'L', 2, 4,6,2), 
    (20, 110.0, 'Blazer formal de lana', 1, 'M', 3, 2,7,2), 
    (12, 150.0, 'Pijama para beb� de algod�n', 4, 'XS', 1, 1,8,6), 
    (18, 75.0, 'Buzo deportivo de algod�n pima', 2, 'M', 1, 5,2,5), 
    (8, 130.0, 'Vestido casual de algod�n', 3, 'S', 4, 5,3,1),
	(10,150.0,'Vestido off-the-shoulder',1,'M',2,5,3,1);
