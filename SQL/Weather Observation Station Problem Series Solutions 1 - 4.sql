/*
Weather Observation Station Problem Series
https://www.hackerrank.com/challenges/weather-observation-station-1/problem
*/

-- Problem One Solution
select city,state
from station;

-- Problem Two Solution
select round(sum(lat_n),2), round(sum(long_w),2)
from station;

-- Problem Three Solution
select distinct city
from station
where id%2=0;

-- Problem Four Solution
select count(city)- count(distinct city)
from station;