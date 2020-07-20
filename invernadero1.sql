create database invernadero;
use invernadero;
create table catalogo (id_planta int primary key, 
nombre varchar(30), temperatura int, humedad int, observaciones varchar(50));
ALTER TABLE catalogo MODIFY humedad float;

create table invernadero (id_invernadero int primary key, id_planta int);
alter table invernadero add constraint invernadero_catalogo_fk foreign key (id_planta) references catalogo (id_planta);
describe invernadero;


create table sensor (id_sensor int primary key, id_invernadero int);
alter table sensor add constraint sensor_invernadero_fk foreign key (id_invernadero) references invernadero (id_invernadero);
describe sensor;

create table informe (id_informe int primary key, id_sensor int, fecha date, hora time, temperatura int, humedad int);
alter table informe add constraint informe_sensor_fk foreign key (id_sensor) references sensor (id_sensor);
describe informe;

/* Insertar datos a catalogo*/
INSERT INTO catalogo VALUES(1,"Albahaca",20,8.2),(2,"Tomillo",25,7),(3,"menta",20,6.5),
(4,"Estragon",15,6),(5,"Oregano",25,8.13),(6,"Romero",25,6.5);