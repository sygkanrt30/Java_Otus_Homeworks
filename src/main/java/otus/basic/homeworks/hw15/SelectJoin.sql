SELECT test.id, test.questions, answers.* FROM test
JOIN answers ON ans_id = answer_id
