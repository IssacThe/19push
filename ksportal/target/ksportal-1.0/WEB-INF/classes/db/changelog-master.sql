--liquibase formatted sql

--changeset FadelTOURE:(dbms:postgresql failOnError:true)
CREATE TABLE etudiant (
    accountid integer,
    etudiantid integer,
    etudiantfirstname character varying(35),
    etudiantlastname character varying(35),
    createddate timestamp without time zone DEFAULT NOW(),
    activeendtime timestamp without time zone
);
