create table vehicle_details(

vehicle_id serial primary key,
vehicle_name varchar(50) not null,
vehicle_number varchar(40) not null,
capacity int 
);


create table delivery_details(

delivery_id serial primary key,
product_name varchar(50) not null,
shop_name varchar(50),
delivery_area varchar(50) not null,
status varchar(30)
);

insert into delivery_details (product_name,shop_name,delivery_area,status) values ('shop','rani store','kilakarai','delivered'),
('shampoo','meena store','ramnad','not delivered'),('book','neha book store','chennai','delivered')

create or replace view view_delivery As select * from delivery_details where status='delivered'

select * from view_delivery

create index view_delivery_area on delivery_details (delivery_area);

select * from delivery_details where delivery_area='chennai'


begin 

insert into delivery_details (product_name,shop_name,delivery_area,status) values ('lunch box','plastic store','kilakarai','delivered'),
('burger','KVT store','ramnad','not delivered'),('milk shake','juice store','chennai','delivered')

commit


begin

delete from delivery_details where delivery_id=1;

rollback



select * from delivery_details

create or replace view access_select_view As select * from delivery_details

create user malli with password 'malli123'
grant select on access_select_view to malli
