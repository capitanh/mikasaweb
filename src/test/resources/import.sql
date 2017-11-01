insert into users (username,password,enabled) values ('admin','admin',1);
insert into authorities(username,authority) values ('admin','administrator');
commit;
