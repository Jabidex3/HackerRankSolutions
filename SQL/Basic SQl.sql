/*
https://www.hackerrank.com/challenges/more-than-75-marks/problem
*/
select name
from students
where marks >75
order by substring(name,-3) asc, id asc;

/*
https://www.hackerrank.com/challenges/name-of-employees/problem
*/
select name
from employee
order by name;

/*
https://www.hackerrank.com/challenges/select-by-id/problem
*/
select *
from city
where id = 1661;

/*
https://www.hackerrank.com/challenges/salary-of-employees/problem
*/
select name
from employee
where salary > 2000 and months<10;