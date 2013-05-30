--liquibase formatted sql

--changeset FadelTOURE1:(dbms:postgresql failOnError:true)
INSERT INTO patient (patientid, firstname,lastname) 
	VALUES
	(nextval('patient_seq'),'Fadel','TOURE'),
	(nextval('patient_seq'),'Isaac','NDIAYE'),
	(nextval('patient_seq'),'Jules','MUSSET');
