CREATE TABLE mapita;

CREATE TABLE usuario (idUsuario serial NOT NULL,
		NOMRE text NOT NULL,
		CORREO text NOT NULL, 
		CONTRASENIA text NOT NULL,
		FECHANACIMIENTO date,
		PRIMARY KEY (idUsuaruio)
);

CREATE TABLE marcador (idMarcador serial NOT NULL,
		descrpcion text NOT NULL,
		longitud text NOT NULL, 
		latitud text NOT NULL,
		idUsuario serial NOT NULL
);

INSERT INTO usuario (nomre,correo,contrasenia,fechanacimiento) VALUES ('Dani','dani@hotmail.es','171717','16-02-1994');

