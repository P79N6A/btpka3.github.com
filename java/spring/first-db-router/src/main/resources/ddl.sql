DROP TABLE IF EXISTS T_USER;
CREATE TABLE T_USER (
  ID            IDENTITY PRIMARY KEY,
  HOSPITAL_ID   BIGINT,
  NAME          VARCHAR(128),
  REMARK        VARCHAR(512)
);