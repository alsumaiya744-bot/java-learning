CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    amount NUMERIC,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
INSERT INTO customers VALUES
(1, 'Asha', 'Chennai'),
(2, 'Rahul', 'Mumbai'),
(3, 'John', 'Delhi');

INSERT INTO orders VALUES
(101, 1, 6000),
(102, 2, 3000),
(103, 3, 8000),
(104, 1, 2000);
SELECT 
    o.order_id,
    c.customer_name,
    c.city,
    o.amount
FROM 
    orders o
INNER JOIN customers c
ON o.customer_id = c.customer_id
WHERE 
    o.amount > 5000;








CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    salary NUMERIC,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)

);
INSERT INTO departments VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance');

INSERT INTO employees VALUES
(101, 'Amit', 1, 35000),
(102, 'Neha', 2, 28000),
(103, 'Raj', 1, 40000),
(104, 'John', 3, 50000);
SELECT 
    e.emp_name,
    d.dept_name,
    e.salary
FROM 
    employees e
INNER JOIN departments d
ON e.dept_id = d.dept_id
WHERE 
    e.salary > 30000
    AND d.dept_name = 'HR';






CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    amount NUMERIC
);
INSERT INTO orders VALUES
(101, 1, 6000),
(102, 2, 3000),
(103, 3, 8000),
(104, 1, 2000);
SELECT 
    order_id,
    customer_id,
    amount
FROM 
    orders
WHERE 
    amount > (
        SELECT AVG(amount) 
        FROM orders
    );
