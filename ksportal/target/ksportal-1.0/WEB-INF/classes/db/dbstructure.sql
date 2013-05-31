--liquibase formatted sql

--changeset FadelTOURE2:(dbms:postgresql failOnError:true)
CREATE TABLE patient (
    patientid integer,
    firstname character varying(35),
    lastname character varying(35)
);

CREATE SEQUENCE patient_seq 
  INCREMENT 1
  MINVALUE 1
  NO MAXVALUE
  START 1
  CACHE 1;

