CREATE TABLE USERS
(
	USERNAME VARCHAR(10) NOT NULL PRIMARY KEY,
	PASSWORD VARCHAR(50) NOT NULL,
	ENABLED INTEGER NOT NULL,
	CONSTRAINT CNT_ENABLED CHECK(ENABLED IN (1,0))
);

CREATE TABLE AUTHORITIES
(
	USERNAME VARCHAR(10) NOT NULL,
	AUTHORITY VARCHAR(50) NOT NULL,
	FOREIGN KEY(USERNAME) REFERENCES USERS(USERNAME)
);
CREATE UNIQUE INDEX IX_AUTH_USERNAME ON AUTHORITIES (USERNAME,AUTHORITY);

INSERT INTO USERS(USERNAME,PASSWORD,ENABLED)VALUES('admin','secret',1);
INSERT INTO AUTHORITIES(USERNAME,AUTHORITY)VALUES('admin','administrator');

commit;
