create table bank_account(

account_id serial primary key,
user_name varchar(30) not null,
balance decimal

);

insert into bank_account (user_name,balance) values 
('safa',10000),('rifa',8000),('raheefa',5000)

select * from bank_account

begin
update bank_account set balance=balance-5000 where account_id=2
rollback


create table employee_details(

emp_id serial primary key,
emp_name varchar(30) not null,
emp_salary decimal,
emp_age smallint
);


insert into employee_details (emp_name,emp_salary,emp_age) values
('safa',10000,20),('rifa',11000,21),('raheefa',9000,19)

create or replace view employee_view As select emp_name from employee_details

select * from employee_view

create user sumaiya with password 'sumaiya123'

grant select on employee_view to sumaiya




create or replace function view_menu(choice int)
returns void As $$
declare
	rec record;
begin
	raise notice '1. create view';
	raise notice '2. display view';
	raise notice '3. update view';
	raise notice '4. drop view';
	raise notice '5. exit';

	if choice=1 then
		execute 'create or replace view view_employee_details As select * from employee_details';
		raise notice 'view created';

	elsif choice=2 then
		raise notice 'display view';
		for rec in select * from view_employee_details loop
			raise notice 'employee id : %, employee name : %, employee salary : %, employee age : %',rec.emp_id,rec.emp_name,rec.emp_salary,rec.emp_age;
		end loop;

	elsif choice=3 then
		execute 'update view_employee_details set emp_name=''anu'' where emp_id=2';
		raise notice 'view updated';

	elsif choice=4 then
		execute 'drop view view_employee_details';
		raise notice 'view deleted';

	elsif choice=5 then
		raise notice 'exited successfully';
		
	end if;
end;
$$ language plpgsql


select view_menu (5)

create database transport_company
		


