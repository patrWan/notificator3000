/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Patricio
 * Created: 21-abr-2018
 */

-- DROP DATABASE notificator_db;

CREATE DATABASE notificator_db;
USE notificator_db;
CREATE TABLE diaSemana(
    id INT AUTO_INCREMENT,
    nombreDia VARCHAR(50),
    PRIMARY KEY(id)
);
INSERT INTO diaSemana VALUES(NULL, 'Lunes');
INSERT INTO diaSemana VALUES(NULL, 'Martes');
INSERT INTO diaSemana VALUES(NULL, 'Miercoles');
INSERT INTO diaSemana VALUES(NULL, 'Jueves');
INSERT INTO diaSemana VALUES(NULL, 'Viernes');
INSERT INTO diaSemana VALUES(NULL, 'Sabado');
INSERT INTO diaSemana VALUES(NULL, 'Domingo');

CREATE TABLE serie(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    diaSemana_fk INT,
    en_emision BOOLEAN,
    PRIMARY KEY(id),
    FOREIGN KEY (diaSemana_fk) REFERENCES diaSemana(id) 
);


SELECT * FROM serie;
SELECT * FROM diaSemana;

-- Dias de la semana ordenados.
SELECT * FROM serie order by diaSemana_fk asc;

-- Rescata el número del dia actual.
SELECT (WEEKDAY(NOW()) + 1) AS DIA_SEMANA

-- Rescata las series de un dia en especifico.
SELECT nombre FROM serie WHERE diaSemana_fk = 5;



