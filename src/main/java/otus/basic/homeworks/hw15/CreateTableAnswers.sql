CREATE TABLE answers
(
	 answer_id int4 UNIQUE NOT NULL,
	 correct_answer varchar NOT NULL,
	 answer_2 varchar NOT NULL,
	 answer_3 varchar UNIQUE,
	 answer_4 varchar UNIQUE,
	 answer_5 varchar UNIQUE
);