use bubuxdb;

create table personne(
	id int not null auto_increment primary key,
	nom varchar(50),
	prenom varchar(50),
	dateNaiss date
);
