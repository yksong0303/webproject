
/* Drop Triggers */

DROP TRIGGER TRI_member_num_ num;



/* Drop Tables */

DROP TABLE member_num CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_member_num_ num;




/* Create Sequences */

CREATE SEQUENCE SEQ_member_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE member_num
(
	 num number(10,0) NOT NULL,
	name varchar2(20) NOT NULL,
	id varchar2(20) NOT NULL UNIQUE,
	pwd varchar2(20) NOT NULL,
	joindate date NOT NULL,
	etc varchar2(2000),
	PRIMARY KEY ( num)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_member_num_ num BEFORE INSERT ON member_num
FOR EACH ROW
BEGIN
	SELECT SEQ_member_num_ num.nextval
	INTO :new. num
	FROM dual;
END;

/




