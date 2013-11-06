mysql --user=root --password=saupw mysql < Init.sql
mysql --user=tcms --password=tcms --default-character-set=utf8 tcms < Schema.sql
mysql --user=tcms --password=tcms --default-character-set=utf8 tcms < MasterData.sql


