drop table Shopper;
create table if not exists Shopper(
	SHOPPER_ID NUMBER(10) PRIMARY KEY,
	FIRST_NAME CHAR(20),
	LAST_NAME CHAR(20),
	AGE NUMBER(2)
);
