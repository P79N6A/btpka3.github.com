DROP TABLE IF EXISTS T1;
CREATE TABLE T1
(
  ID character varying(255),
  NAME character varying(255)
);

DROP TABLE IF EXISTS T2;
CREATE TABLE T2
(
  ID character varying(255),
  ADDR character varying(255)
);

INSERT INTO T1 VALUES('A', 'NAME_A');
INSERT INTO T1 VALUES('B', 'NAME_B');

INSERT INTO T2 VALUES('A', 'ADDR_A');
INSERT INTO T2 VALUES('C', 'ADDR_C');

-- INNER JOIN
SELECT T1.*, T2.* FROM T1, T2 WHERE T1.ID = T2.ID;
/*
ID;NAME;ID;ADDR
"A";"NAME_A";"A";"ADDR_A"
*/

-- LEFT OUTER JOIN
SELECT T1.*, T2.* FROM T1 LEFT OUTER JOIN T2 ON (T1.ID = T2.ID);
/*
ID;NAME;ID;ADDR
"A";"NAME_A";"A";"ADDR_A"
"B";"NAME_B";"";""

*/


-- RIGHT OUTER JOIN
SELECT T1.*, T2.* FROM T1 RIGHT OUTER JOIN T2 ON (T1.ID = T2.ID);
/*
ID;NAME;ID;ADDR
"A";"NAME_A";"A";"ADDR_A"
"";"";"C";"ADDR_C"

*/

-- FULL JOIN
SELECT T1.*, T2.* FROM T1 FULL OUTER JOIN T2 ON (T1.ID = T2.ID);
/*
ID;NAME;ID;ADDR
"A";"NAME_A";"A";"ADDR_A"
"B";"NAME_B";"";""
"";"";"C";"ADDR_C"

*/
