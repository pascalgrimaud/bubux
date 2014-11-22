use bubuxdb;

create table EXEMPLE(
	ID int not null unique auto_increment primary key,
	CODE varchar(10) not null unique,
	DESCRIPTION varchar(50),
	TSTAMP timestamp not null
);

insert into EXEMPLE(CODE,DESCRIPTION) values('EX01','Description Exemple 01');
