/*Se crea la base de datos solicitada 2 ptos*/
CREATE DATABASE CasoEstudio01
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_unicode_ci;

/*Se crea un usuario para la base de datos 2 ptos*/


CREATE USER 'usuario_Caso01'@'%' IDENTIFIED BY 'LaClave';

/*Se asignan todos los privilegios sobre la base de datos solicitada al usuario creado 2 ptos*/

GRANT ALL PRIVILEGES ON esquemaBD01.* TO 'juan32'@'localhost';
FLUSH PRIVILEGES;

/* Se crea la tabla solicitada 2 ptos*/

CREATE TABLE articulo (
    id_articulo INT AUTO_INCREMENT PRIMARY KEY,
    detalle VARCHAR(30),
    cantidad INT,
    fecha_vence VARCHAR(10),
    imagen_articulo VARCHAR(1024)
);

/*Se insertan 4 registros en la tabla solicitada 2ptos */

INSERT INTO articulo (detalle, cantidad, fecha_vence, imagen_articulo) VALUES
('Cemento', 25, '2026-12-31', 'https://ejemplo.com/img/cemento.png'),
('Lamina zinc', 50, '2027-06-30', 'https://ejemplo.com/img/lamina.png'),
('Tornillos', 200, '2028-01-15', 'https://ejemplo.com/img/tornillos.png'),
('Pintura', 12, '2026-08-20', 'https://ejemplo.com/img/pintura.png');