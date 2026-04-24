CREATE OR REPLACE PROCEDURE check_even_odd(num INT)
LANGUAGE plpgsql AS $$
BEGIN
    IF num % 2 = 0 THEN
        RAISE NOTICE 'Even Number';
    ELSE
        RAISE NOTICE 'Odd Number';
    END IF;
END;
$$;

CALL check_even_odd(7);




CREATE OR REPLACE FUNCTION greatest_num(a INT, b INT, c INT)
RETURNS INT
LANGUAGE plpgsql AS $$
DECLARE
    result INT;
BEGIN
    IF a > b AND a > c THEN
        result := a;
    ELSIF b > c THEN
        result := b;
    ELSE
        result := c;
    END IF;

    RETURN result;
END;
$$;

SELECT greatest_num(10, 25, 15);







CREATE OR REPLACE PROCEDURE check_vote(age INT)
LANGUAGE plpgsql AS $$
BEGIN
    IF age >= 18 THEN
        RAISE NOTICE 'Eligible for Voting';
    ELSE
        RAISE NOTICE 'Not Eligible';
    END IF;
END;
$$;

CALL check_vote(20);






CREATE OR REPLACE PROCEDURE print_numbers()
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..10 LOOP
        RAISE NOTICE '%', i;
    END LOOP;
END;
$$;

CALL print_numbers();









CREATE OR REPLACE FUNCTION sum_numbers()
RETURNS INT
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
    total INT := 0;
BEGIN
    FOR i IN 1..10 LOOP
        total := total + i;
    END LOOP;

    RETURN total;
END;
$$;

SELECT sum_numbers();







CREATE OR REPLACE PROCEDURE multiplication_table(num INT)
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..10 LOOP
        RAISE NOTICE '% x % = %', num, i, num * i;
    END LOOP;
END;
$$;

CALL multiplication_table(5);








CREATE OR REPLACE FUNCTION factorial_num(num INT)
RETURNS INT
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
    fact INT := 1;
BEGIN
    FOR i IN 1..num LOOP
        fact := fact * i;
    END LOOP;

    RETURN fact;
END;
$$;

SELECT factorial_num(5);










CREATE OR REPLACE PROCEDURE even_numbers()
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..20 LOOP
        IF i % 2 = 0 THEN
            RAISE NOTICE '%', i;
        END IF;
    END LOOP;
END;
$$;

CALL even_numbers();









CREATE OR REPLACE PROCEDURE odd_numbers()
LANGUAGE plpgsql AS $$
DECLARE
    i INT;
BEGIN
    FOR i IN 1..20 LOOP
        IF i % 2 <> 0 THEN
            RAISE NOTICE '%', i;
        END IF;
    END LOOP;
END;
$$;

CALL odd_numbers();