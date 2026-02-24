
DROP DATABASE IF EXISTS esquemaBD01;
CREATE DATABASE esquemaBD01;
USE esquemaBD01;


DROP USER IF EXISTS 'juan32'@'localhost';
CREATE USER 'juan32'@'localhost' IDENTIFIED BY '504660819';

GRANT ALL PRIVILEGES ON esquemaBD01.* TO 'juan32'@'localhost';
FLUSH PRIVILEGES;

DROP TABLE IF EXISTS articulo;

CREATE TABLE articulo (
    id_articulo INT AUTO_INCREMENT PRIMARY KEY,
    detalle VARCHAR(30),
    cantidad INT,
    fecha_vence VARCHAR(10),
    imagen_articulo VARCHAR(1024)
);


INSERT INTO articulo (detalle, cantidad, fecha_vence, imagen_articulo) VALUES
('Cemento', 25, '2026-12-31', 'https://ejemplo.com/img/cemento.png'),
('Lamina zinc', 50, '2027-06-30', 'https://ejemplo.com/img/lamina.png'),
('Tornillos', 200, '2028-01-15', 'https://ejemplo.com/img/tornillos.png'),
('Pintura', 12, '2026-08-20', 'https://ejemplo.com/img/pintura.png');
