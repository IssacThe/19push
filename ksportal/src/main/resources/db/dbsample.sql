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
	
INSERT INTO patient (accountid, firstname,middlename, lastname, dob, pob, sex, pictureurl, created,createdBy) 
	VALUES
	(1,'Fadel','','TOURE','1977-12-16 12:21:13','Kaedi','M','https://lh5.googleusercontent.com/-7vEvkcLpw9U/T7-pW_QO5eI/AAAAAAAAApg/4K4eH0waZa4/s506-o/396916_2994135814950_1308830659_3313367_615457332_n.jpg',now(), 'Testers' ),
	(1,'Isaac','','NDIAYE','1992-12-16 12:21:13','Saint-Louis','M','',now(), 'Testers' ),
	(1,'Alain','','BA','1990-12-16 12:21:13','Thies','M','',now(), 'Testers' ),
	(1,'Joosephine','','NDIAYE','1985-12-16 12:21:13','Dakar','M','',now(), 'Testers' ),
	(2,'Edem','','KODJO','1994-12-16 18:21:13','Lome','M','',now(), 'Testers' ),
	(1,'Mahmoudou','','TOURE','1975-12-16 12:21:13','Kaedi','M','https://lh6.googleusercontent.com/--iA_0LiisWE/UPXLR0RDOXI/AAAAAAAACn4/IKOPK7_iXl4/w787-h588-no/BD673A51-4823-45D7-B055-CF9614DF9352.JPG',now(), 'Testers' ),
	(1,'Mamadou','','TOURE','1970-12-16 12:21:13','Kaedi','M','https://lh6.googleusercontent.com/-__9kR_hZZ9o/TiPfekCoZQI/AAAAAAAAJ1Q/9qNbLiEPXvQ/w590-h588-no/DSC00786.JPG',now(), 'Testers' ),
	(1,'Ibra','','TOURE','1965-12-16 12:21:13','Kaedi','M','',now(), 'Testers' ),
	(1,'Marieme','','TOURE','1968-12-16 12:21:13','Kaedi','F','',now(), 'Testers' ),
	(1,'Fadel','','TOURE','1986-10-07 12:21:13','Kaedi','M','https://lh5.googleusercontent.com/-7vEvkcLpw9U/T7-pW_QO5eI/AAAAAAAAApg/4K4eH0waZa4/s506-o/396916_2994135814950_1308830659_3313367_615457332_n.jpg',now(), 'Testers' );


	

	

  

  


  