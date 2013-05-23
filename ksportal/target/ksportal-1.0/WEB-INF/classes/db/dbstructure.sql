--liquibase formatted sql

--changeset FadelTOURE:(dbms:postgresql failOnError:true)
CREATE TABLE student (
    accountid integer,
    studentid integer,
    studentfirstname character varying(35),
    studentlastname character varying(35),
    createddate timestamp without time zone DEFAULT NOW(),
    activeendtime timestamp without time zone
);
CREATE SEQUENCE student_seq 
  INCREMENT 1
  MINVALUE 1
  NO MAXVALUE
  START 1
  CACHE 1;
