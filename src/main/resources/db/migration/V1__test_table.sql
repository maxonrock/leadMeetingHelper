CREATE TABLE test (
  id           SERIAL,
  title        CHARACTER VARYING,
  date_created TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);
INSERT INTO test (title) VALUES ('test');