-- Inserta estados de tarea (task_status)
INSERT INTO task_status (id, name) VALUES (1, 'PENDING');
INSERT INTO task_status (id, name) VALUES (2, 'IN_PROGRESS');
INSERT INTO task_status (id, name) VALUES (3, 'DONE');

-- Inserta usuarios
INSERT INTO users (username, password) VALUES ('admin', '$2a$12$IKyskvK8M4XXkBpPAGIE2OMIVAwus0Y46d0zR1MnFDYAmMT5a7oBa');
INSERT INTO users (username, password) VALUES ('user', '$2a$12$rozV.EXPWDQgsCj1PVSmp.UwsYTE2rZcGxNZfwtg6B.Yjq0wQhpZO');

-- Inserta tareas (task)
INSERT INTO task (title, description, status_id) VALUES ('Design database schema', 'Create and normalize the initial database design', 1);
INSERT INTO task (title, description, status_id) VALUES ('Implement authentication', 'Add login functionality using JWT', 2);
INSERT INTO task (title, description, status_id) VALUES ('Write unit tests', 'Cover services with JUnit tests', 3);
