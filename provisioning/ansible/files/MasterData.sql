-- Users
INSERT INTO users(USERNAME,PASSWORD,ENABLED)VALUES('admin','admin',1);
INSERT INTO authorities(USERNAME,AUTHORITY)VALUES('admin','administrator');

-- regions
INSERT INTO regions VALUES (1,'Andalucía');
INSERT INTO regions VALUES (2,'Aragón');
INSERT INTO regions VALUES (3,'Principado de Asturias');
INSERT INTO regions VALUES (4,'Illes Balears');
INSERT INTO regions VALUES (5,'Cantabria');
INSERT INTO regions VALUES (6,'Castilla y León');
INSERT INTO regions VALUES (7,'Castilla-La Mancha');
INSERT INTO regions VALUES (8,'Cataluña');
INSERT INTO regions VALUES (9,'Ciudad de Ceuta');
INSERT INTO regions VALUES (10,'Extremadura');
INSERT INTO regions VALUES (11,'Galicia');
INSERT INTO regions VALUES (12,'Canarias');
INSERT INTO regions VALUES (13,'La Rioja');
INSERT INTO regions VALUES (14,'Comunidad de Madrid');
INSERT INTO regions VALUES (15,'Región de Murcia');
INSERT INTO regions VALUES (16,'Comunidad Foral de Navarra');
INSERT INTO regions VALUES (17,'País Vasco');
INSERT INTO regions VALUES (18,'Comunitat Valenciana');
INSERT INTO regions VALUES (19,'Ciudad de Melilla');

commit;
