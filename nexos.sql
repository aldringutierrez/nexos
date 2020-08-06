-- base de datos oracle
drop table personas;

create table personas (
id_persona    number(10),
nombre        varchar2(100),
correo        varchar2(100),
parentesco    varchar2(100),
id_padre      number(10)
);

alter table personas add constraint personas_pk primary key (id_persona);
alter table personas add constraint personas_personas_fk foreign key (id_padre) references personas(id_persona);

insert into personas values (1,'juan','juan@qq.com','titular',null);
insert into personas values (2,'pedro','pedro@qq.com','hijo',1);
insert into personas values (3,'ana','ana@qq.com','hija',1);
insert into personas values (4,'alfredo','alfredo@qq.com','nieto',1);
insert into personas values (5,'mariela','mariela@qq.com','nieto',1);
