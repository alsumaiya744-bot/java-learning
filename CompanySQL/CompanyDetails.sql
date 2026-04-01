create table departments(
department_id serial primary key,
department_name varchar(50) not null,
location varchar(50) not null
);
insert into departments (department_name,location) values ('HR','Chennai'),('Development','Bangalore'),('Testing','Chennai'),('Support','Hyderabad')
select* from departments where location='Chennai'


create table employees(
emp_id int primary key,
emp_name varchar(50) not null,
age smallint check (age>21),
salary int not null,
department_id int,
manager_id int,
foreign key (department_id) references departments(department_id),
foreign key (manager_id) references employees(emp_id)
);
insert into employees (emp_id,emp_name,age,salary,department_id) values (101,'Arun',30,40000,2)
insert into employees (emp_id,emp_name,age,salary,department_id,manager_id) values (102,'Bala',28,30000,2,108)
insert into employees (emp_id,emp_name,age,salary,department_id) values (103,'Charan',35,50000,1)
insert into employees (emp_id,emp_name,age,salary,department_id,manager_id) values (104,'Dinesh',25,25000,3,103),(105,'Ezhil',27,28000,4,101)
select* from employees where salary>30000
update employees set salary=35000 where emp_id=102
delete from employees where emp_id=104



create table projects(
project_id int primary key,
project_name varchar(50) not null,
budget int ,
status varchar(50) default 'completed',
emp_id int,
foreign key (emp_id) references employees (emp_id)
);
insert into projects values (201,'project A',100000,'pending',101),(202,'project B',150000,'started',102),(203,'project C',200000,'pending',103),(204,'project D',120000,'completed',101)
select* from projects where status='pending'
update projects set status='completed' where project_id=202
delete from projects where project_id=204



create table tasks(
task_id serial primary key,
task_name varchar(50) not null,
priority varchar(50) default 'High',
due_days smallint,
project_id int,
emp_id int,
foreign key (project_id) references projects (project_id),
foreign key (emp_id) references employees (emp_id)
);
insert into tasks values (301,'Design','High',5,201,101),(302,'Coding','Medium',10,202,102),(303,'Testing','Low',7,203,103),(304,'Deployment','High',3,203,103)
select* from tasks where due_days>5
update tasks set priority='High' where task_id=302
delete from tasks where task_name='Testing'