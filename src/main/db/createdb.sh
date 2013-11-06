mysql --user=root --password=saupw mysql < Init.sql
mysql --user=mikasadb --password=mikasadb --default-character-set=utf8 mikasadb < Schema.sql
mysql --user=mikasadb --password=mikasadb --default-character-set=utf8 mikasadb < MasterData.sql


