/*
Weather Observation Station Problem Series 6-12
https://www.hackerrank.com/challenges/weather-observation-station-6/problem
https://www.hackerrank.com/challenges/weather-observation-station-7/problem
https://www.hackerrank.com/challenges/weather-observation-station-8/problem
https://www.hackerrank.com/challenges/weather-observation-station-9/problem
https://www.hackerrank.com/challenges/weather-observation-station-10/problem
https://www.hackerrank.com/challenges/weather-observation-station-11/problem
https://www.hackerrank.com/challenges/weather-observation-station-12/problem
*/

-- Problem Six Solution
select distinct city
from station
where city like 'a%' or city like 'e%' or city like 'i%' or city like 'o%' or city like 'u%';

-- Problem Seven Solution
select distinct city
from station
where city like '%a' or city like '%e' or city like '%i' or city like '%o' or city like '%u';

-- Problem Eight Solution
select distinct city
from station
where city like 'a%a' or city like 'a%e' or city like 'a%i' or city like 'a%o' or city like 'a%u' or 
city like 'e%a' or city like 'e%e' or city like 'e%i' or city like 'e%o' or city like 'e%u' or 
city like 'i%a' or city like 'i%e' or city like 'i%i' or city like 'i%o' or city like 'i%u' or 
city like 'o%a' or city like 'o%e' or city like 'o%i' or city like 'o%o' or city like 'o%u' or 
city like 'u%a' or city like 'u%e' or city like 'u%i' or city like 'u%o' or city like 'u%u';

-- Problem Nine Solution
select distinct city
from station
where city not like 'a%' and city not like 'e%' and city not like 'i%' and city not like 'o%' and city not like 'u%';

-- Problem Ten Solution
select distinct city
from station
where city not like '%a' and city not like '%e' and city not like '%i' and city not like '%o' and city not like '%u';

-- Problem Eleven Solution
select distinct city
from station
where city not like 'a%a' and city not like 'a%e' and city not like 'a%i' and city not like 'a%o' and city not like 'a%u' and 
city not like 'e%a' and city not like 'e%e' and city not like 'e%i' and city not like 'e%o' and city not like 'e%u' and 
city not like 'i%a' and city not like 'i%e' and city not like 'i%i' and city not like 'i%o' and city not like 'i%u' and 
city not like 'o%a' and city not like 'o%e' and city not like 'o%i' and city not like 'o%o' and city not like 'o%u' and 
city not like 'u%a' and city not like 'u%e' and city not like 'u%i' and city not like 'u%o' and city not like 'u%u';

-- Problem Twelve Solution
select distinct city
from station
where city not like 'a%' and city not like 'e%' and city not like 'i%' and city not like 'o%' and city not like 'u%' and 
city not like '%a' and city not like '%e' and city not like '%i' and city not like '%o' and city not like '%u';