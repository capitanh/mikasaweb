drop database mikasadb;
drop user 'mikasadb'@'localhost';
create database mikasadb;
create user 'mikasadb'@'localhost' identified by 'mikasadb';
grant all privileges on mikasadb.* to mikasadb;
flush privileges;
commit;
