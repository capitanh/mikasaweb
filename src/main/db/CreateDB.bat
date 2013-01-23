@echo off
sqlplus system/ADMINPASSWORD @Init.sql
sqlplus DBUSER/DBPASSWORD @01-Tables.sql
sqlplus DBUSER/DBPASSWORD @02-MasterData.sql


