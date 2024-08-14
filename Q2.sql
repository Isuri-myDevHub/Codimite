CREATE TABLE IF NOT EXISTS students(
  id INT AUTO_INCREMENT PRIMARY KEY,
  student_name VARCHAR(100) NOT NULL,
  contact VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTS course(
  id INT AUTO_INCREMENT PRIMARY KEY,
  course_name VARCHAR(100) NOT NULL,
  duration_in_months INT NOT NULL
);


CREATE TABLE IF NOT EXISTS lecturer(
  id INT AUTO_INCREMENT PRIMARY KEY,
  lecturer_name VARCHAR(100) NOT NULL,
  contact VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS lecturer_course(
  lecturer_id INT,
  course_id INT,
  CONSTRAINT PRIMARY KEY (lecturer_id, course_id),
  CONSTRAINT fk_1 FOREIGN KEY (lecturer_id) REFERENCES lecturer_id,
  CONSTRAINT fk_2 FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE

);















