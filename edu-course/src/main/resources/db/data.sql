INSERT INTO COURSE (NAME, ADMIN_ID) VALUES ('Lv3 Intensive Course', 1);

INSERT INTO INSTRUCTOR (NAME) VALUES ('Emily');

INSERT INTO SUBJECT (NAME, COURSE_ID, BUILDING, FLOOR, ROOM_NO, INSTRUCTOR_ID) VALUES ('MSA', 1, '판교캠퍼스 B', '3', '301', 1);

INSERT INTO TRAINEE (ID, NAME) VALUES (1, 'Tim');
INSERT INTO TRAINEE (ID, NAME) VALUES (2, 'Mary');

INSERT INTO ATTENDANCE (COURSE_ID, TRAINEE_ID) VALUES (1, 1);
INSERT INTO ATTENDANCE (COURSE_ID, TRAINEE_ID) VALUES (1, 2);