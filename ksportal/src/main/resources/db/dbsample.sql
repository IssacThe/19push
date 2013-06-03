--liquibase formatted sql

--changeset FadelTOURE1:(dbms:postgresql failOnError:true)
INSERT INTO account (accountName, accountDescription,  created,createdBy) 
	VALUES
	('ab12345','Account Test 1',now(),'Tester'),
	('ac12345','Account Test 2',now(),'Tester');
	
INSERT INTO user_info (accountid,username,password, firstname,middlename, lastname, sex, created,createdBy) 
	VALUES
	(1,'docteur','orthodoc','Souleymane','Mamadou', 'CAMARA','M',now(),'Testers'),
	(2,'medecin','orthodoc','Mamae','Diarra', 'BOUSSO','F',now(),'Testers');
	
INSERT INTO patient (accountid, firstname,middlename, lastname, dob, pob, sex, created,createdBy) 
	VALUES
	(1,'Fadel','','TOURE','1977-12-16 12:21:13','Kaedi','M',now(), 'Testers' ),
	(1,'Isaac','','NDIAYE','1992-12-16 12:21:13','Saint-Louis','M',now(), 'Testers' ),
	(1,'Alain','','BA','1990-12-16 12:21:13','Thies','M',now(), 'Testers' ),
	(1,'Joosephine','','NDIAYE','1985-12-16 12:21:13','Dakar','M',now(), 'Testers' ),
	(2,'Edem','','KODJO','1994-12-16 18:21:13','Lome','M',now(), 'Testers' );


	

	

  

  


  