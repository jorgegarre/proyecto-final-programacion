CREATE DATABASE GESTION_PARKING_HJ;
CREATE TABLE Persona (
    dni VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(20),
    edad INT
);

CREATE TABLE Matricula (
    matricula VARCHAR(10) PRIMARY KEY
);

CREATE TABLE coche (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Coche',
    FOREIGN KEY (id_dueño) REFERENCES Persona(dni),
    FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE moto (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Moto',
    FOREIGN KEY (id_dueño) REFERENCES Persona(id),
	FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE furgoneta (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    longitud DOUBLE,
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Furgoneta',
    FOREIGN KEY (id_dueño) REFERENCES Persona(id),
	FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE combustion (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    combustible ENUM('Diesel','Gasolina') ,
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Coche',
    FOREIGN KEY (id_dueño) REFERENCES Persona(id),
    FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE hibrido_enchufable (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
	autonomia_real INT,
    autonomia_total INT,
    enchufable BOOLEAN,
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Coche',
    FOREIGN KEY (id_dueño) REFERENCES Persona(id),
    FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE hibrido_total (
    matricula VARCHAR(10) PRIMARY KEY,
    id_dueño INT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    autonomia_real INT,
    autonomia_total INT,
    enchufable BOOLEAN,
    tipoVehiculo VARCHAR(15) NOT NULL DEFAULT 'Coche',
    FOREIGN KEY (id_dueño) REFERENCES Persona(id),
    FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE aparcamiento (
n_plaza INT PRIMARY KEY,
matricula VARCHAR(10),
tipo_plaza ENUM('Furgoneta','Coche','Moto'),
libre BOOLEAN,
tarifaHora DOUBLE,
longitudMaxima DOUBLE,
fechaEntrada TIME,
fechaSalida TIME,
FOREIGN KEY (matricula) REFERENCES Matricula(matricula)
);

CREATE TABLE parking (
id_plaza INT PRIMARY KEY,
nombre VARCHAR(30),
direccion VARCHAR(50),
plazas_ocupadas INT
);
