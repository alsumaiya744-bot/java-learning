CREATE OR REPLACE FUNCTION Calculate_Mark( mark1 int,mark2 int,mark3 int)
RETURNS int AS $$
DECLARE 
	result int;
BEGIN
  result:=mark1+mark2+mark3;
  RETURN result;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE PROCEDURE Student_Result(mark1 int,mark2 int,mark3 int)
LANGUAGE plpgsql
AS $$
DECLARE
	result int;
BEGIN
	result:=Calculate_Mark( mark1,mark2,mark3);
	RAISE NOTICE 'Total Mark : %',result;

	IF result>=150 AND result<=300 THEN
		RAISE NOTICE 'Result : Pass';
	ELSE
		RAISE NOTICE 'Result : Fail';
	END IF;
END;
$$

CALL Student_Result(80,90,95);


CREATE OR REPLACE FUNCTION calculate_si(p DECIMAL(10,2),r DECIMAL(10,2),t DECIMAL(10,2))
RETURNS DECIMAL(10,2) AS $$
DECLARE 
	simple_interest DECIMAL(10,2);
BEGIN 
	simple_interest:=p*r*t/100;
	RETURN simple_interest;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE PROCEDURE simple_interest_details(p DECIMAL(10,2),r DECIMAL(10,2),t DECIMAL(10,2))
LANGUAGE plpgsql
AS $$
DECLARE
	simple_interest DECIMAL(10,2);
BEGIN 
	simple_interest:=calculate_si(p,r,t);

	RAISE NOTICE 'Principle Amount : %',p;
	RAISE NOTICE 'Rate of Interest : %',r;
	RAISE NOTICE 'Time : %',t;
	RAISE NOTICE 'Simple Interest : %',simple_interest;
END;
$$

CALL simple_interest_details(10000,100,2);