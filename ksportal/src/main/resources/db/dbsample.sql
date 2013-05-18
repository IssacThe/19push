--liquibase formatted sql

--changeset FadelTOURE:(dbms:postgresql failOnError:true)
INSERT INTO student ( accountid , studentid, studentfirstname,studentlastname, createddate)
VALUES(1,nextval('student_seq'),'fadel','toure',now());
