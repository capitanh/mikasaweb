CREATE TABLE IF NOT EXISTS users
(
	USERNAME VARCHAR(10) NOT NULL PRIMARY KEY,
	PASSWORD VARCHAR(50) NOT NULL,
	ENABLED INTEGER NOT NULL,
	CONSTRAINT CNT_ENABLED CHECK(ENABLED IN (1,0))
);

CREATE TABLE IF NOT EXISTS authorities
(
	USERNAME VARCHAR(10) NOT NULL,
	AUTHORITY VARCHAR(50) NOT NULL,
	FOREIGN KEY(USERNAME) REFERENCES users(USERNAME)
);
CREATE UNIQUE INDEX IX_AUTH_USERNAME ON authorities (USERNAME,AUTHORITY);

CREATE TABLE IF NOT EXISTS regions
(
  ID INTEGER NOT NULL PRIMARY KEY,
  NAME VARCHAR(30)
);

COMMIT;


