CREATE DATABASE notificator_db;
USE notificator_db;

CREATE TABLE serie(
	id INT AUTO_INCREMENT,
	nombre VARCHAR(100),
    fecha_capitulos VARCHAR(20),
    en_emision BOOLEAN,
);

INSERT INTO serie VALUES(NULL, 'Nanatsu no taizai', 'Sabado', TRUE);

SELECT (ELT(WEEKDAY(NOW()) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo')) AS DIA_SEMANA