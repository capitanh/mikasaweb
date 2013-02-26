drop database tcms;
create database tcms;
drop user 'tcms'@'localhost';
create user 'tcms'@'localhost' identified by 'tcms';
grant all privileges on tcms.* to 'tcms'@'localhost';
flush privileges;
commit;
