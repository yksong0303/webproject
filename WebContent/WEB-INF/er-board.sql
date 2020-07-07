
/* Drop Triggers */

DROP TRIGGER TRI_member_tbl_02_custno;



/* Drop Tables */

DROP TABLE member_tbl_02 CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_member_tbl_02_custno;




/* Create Sequences */

CREATE SEQUENCE SEQ_member_tbl_02_custno INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE member_tbl_02
(
	custno number(6) NOT NULL,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2),
	PRIMARY KEY (custno)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_member_tbl_02_custno BEFORE INSERT ON member_tbl_02
FOR EACH ROW
BEGIN
	SELECT SEQ_member_tbl_02_custno.nextval
	INTO :new.custno
	FROM dual;
END;

/




