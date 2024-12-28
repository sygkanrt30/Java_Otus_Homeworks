CREATE TABLE test
(
	id int4 NOT NULL,
	questions varchar UNIQUE NOT NULL,
	ans_id int4 UNIQUE NOT NULL,
	CONSTRAINT test_pk PRIMARY KEY (id),
	CONSTRAINT test_fk FOREIGN KEY (ans_id) REFERENCES answers(answer_id)
);