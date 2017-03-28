create table users (userId int NOT NULL AUTO_INCREMENT , name VARCHAR(25), email VARCHAR(60) UNIQUE, password VARCHAR(15), gender CHAR(1), dateOfBirth DATE, PRIMARY KEY (userId));

ALTER TABLE users ALTER userId RESTART WITH 100;