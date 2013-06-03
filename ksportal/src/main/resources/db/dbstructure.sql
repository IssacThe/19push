--liquibase formatted sql

--changeset FadelTOURE2:(dbms:postgresql failOnError:true)
CREATE TABLE base (
	created date NOT NULL,
	createdBy varchar(20) NOT NULL,
	lastUpdated date,
	lastUpdatedBy varchar(20)
);
CREATE SEQUENCE patient_seq 
  INCREMENT 1
  MINVALUE 1
  NO MAXVALUE
  START 1
  CACHE 1;
  
CREATE SEQUENCE user_info_seq 
  INCREMENT 1
  MINVALUE 1
  NO MAXVALUE
  START 1
  CACHE 1;
  
CREATE SEQUENCE account_seq 
  INCREMENT 1
  MINVALUE 1
  NO MAXVALUE
  START 1
  CACHE 1;
  
CREATE TABLE account(
	accountid   integer DEFAULT  nextval('account_seq'),
    accountName varchar(10),
	accountDescription text,
    
    CONSTRAINT account_pk PRIMARY KEY(accountid)
) INHERITS (base);
  
  
CREATE TABLE user_info(
	accountid  integer NOT NULL,
    userid     integer DEFAULT nextval('user_info_seq'),
    username   varchar(10) NOT NULL,
    password   varchar(20),
    firstname  varchar(35) NOT NULL,
    middlename varchar(35),
    lastname   varchar(35) NOT NULL,
    sex	   	   varchar(1),
    
    CONSTRAINT user_pk PRIMARY KEY(accountid,userid)
)INHERITS (base);
  

CREATE TABLE patient (
	accountid  integer NOT NULL,
    patientid  integer DEFAULT nextval('patient_seq'),
    firstname  varchar(35) NOT NULL,
    middlename varchar(35),
    lastname   varchar(35) NOT NULL,
    dob		   date,
    pob		   varchar(35),
    sex	       varchar(1),
    
    CONSTRAINT patient_pk PRIMARY KEY(accountid,patientid)
)INHERITS (base);



