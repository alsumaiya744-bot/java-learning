CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50),
    location VARCHAR(50)
);
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    age INT,
    salary INT,
    dept_id INT,
    job_role VARCHAR(50),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);
drop table employee
INSERT INTO department (dept_id, dept_name, location) VALUES
(10, 'HR', 'Chennai'),
(20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
(40, 'Sales', 'Coimbatore');
INSERT INTO employee (emp_id, emp_name, age, salary, dept_id, job_role) VALUES
(101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
(103, 'Charan', 27, 35000, 20, 'Tester'),
(104, 'Divya', 35, 50000, 30, 'Accountant'),
(105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
(106, 'Farhana', 26, 32000, 20, 'Developer'),
(107, 'Gokul', 31, 45000, 30, 'Analyst'),
(108, 'Hari', 24, 22000, 10, 'Assistant');

select d.dept_name,e.emp_name from employee e full join department d on e.dept_id=d.dept_id
select e.emp_name,e.salary,d.location from employee e full join department d on e.dept_id=d.dept_id
select e.emp_name from employee e where e.dept_id=(select dept_id from department where dept_name='IT')
select e.emp_name from employee e where e.dept_id=(select dept_id from department where location='Chennai')
select d.dept_name,e.emp_name from employee e join department d on e.dept_id=d.dept_id where e.salary>30000
SELECT d.dept_name, COUNT(e.emp_id) AS total_employees
FROM department d
JOIN employee e 
ON d.dept_id = e.dept_id
GROUP BY d.dept_name;
SELECT d.dept_name, COUNT(e.emp_id) AS total_employees
FROM department d
JOIN employee e 
ON d.dept_id = e.dept_id
GROUP BY d.dept_name
HAVING COUNT(e.emp_id) > 1;