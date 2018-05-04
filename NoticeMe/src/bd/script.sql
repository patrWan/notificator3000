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

CREATE TABLE serie(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    dia_capitulos VARCHAR(50),
    en_emision BOOLEAN,
    PRIMARY KEY(id)
);

SELECT * FROM serie;
INSERT INTO serie VALUES(NULL, 'Nanatsu', 'Viernes', TRUE);

-- Rescata el nombre del dia actual.
SELECT (ELT(WEEKDAY(NOW()) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo')) AS DIA_SEMANA
-- Rescata las series de un dia.
SELECT nombre FROM serie WHERE dia_capitulos = 'Lunes';



