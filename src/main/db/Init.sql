drop database if exists mikasadb;
/* drop user 'mikasadb'@'localhost'; */
create database mikasadb;
create user 'mikasadb' identified by 'mikasadb';
grant all privileges on mikasadb.* to mikasadb;
flush privileges;
commit;

-- Oracle
/*
drop user mikasadb cascade;
create user mikasadb identified by mikasadb;
grant all privileges to mikasadb;
commit;
*/