CREATE TABLE student(
 id int primary key,
 name varchar(50) not null,
 age int check(age>5),
 dob date
);
select* from student

insert into student values(1,'sumaiya',20,'2005-9-18')
insert into student values(2,'fahima',19,'2006-9-18')
insert into student values(3,'sifa',19,'2006-8-21')
insert into student values(4,'Thahani',18,'2007-8-16')
insert into student values(5,'Harshini',19,'2006-9-18')