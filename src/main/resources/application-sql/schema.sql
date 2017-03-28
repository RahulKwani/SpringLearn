create table users (userId int NOT NULL AUTO_INCREMENT , name VARCHAR(25), email VARCHAR(60) UNIQUE, password VARCHAR(15), gender CHAR(1), dateOfBirth DATE, PRIMARY KEY (userId));

ALTER TABLE users ALTER userId RESTART WITH 100;


create table Products (PRODUCT_ID integer not null, brandName varchar(30), description varchar(100), name varchar(40), NUMBER_OF_ITEMS integer not null, price float not null, PRODUCT_TYPE_ID integer, primary key (PRODUCT_ID)) ENGINE=InnoDB;
create table ProductType (PRODUCT_TYPE_ID integer not null, type varchar(40), typeDesc varchar(100), primary key (PRODUCT_TYPE_ID)) ENGINE=InnoDB;
create table UserDetails (USER_ID integer not null, Address varchar(100), city varchar(30), emailId varchar(50), gender varchar(6), mobileNumber bigint unique, name varchar(40), password varchar(50), role varchar(6), primary key (USER_ID)) ENGINE=InnoDB;
alter table Products add constraint FK_PRODUCT_TYPE foreign key (PRODUCT_TYPE_ID) references ProductType (PRODUCT_TYPE_ID);
