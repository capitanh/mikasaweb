mysql --user=root --password=saupw mysql < 1-Init.sql
mysql --user=tcms --password=tcms --default-character-set=utf8 tcms < 2-Schema.sql
mysql --user=tcms --password=tcms --default-character-set=utf8 tcms < 3-MasterData.sql


