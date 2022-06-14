-- SELECT
-- Use a SELECT statement to return a literal string
SELECT 'Hello World';

-- Use a SELECT statement to add two numbers together (and label the result "sum")
SELECT 5 + 3 AS sum;


-- SELECT ... FROM
-- Write queries to retrieve...

-- The names from all the records in the state table
SELECT state_name FROM state;

-- The names and populations of all cities
SELECT city_name, population FROM city;

-- All columns from the park table
SELECT * FROM park;


-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
SELECT city_name FROM city WHERE state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
SELECT city_name, state_abbreviation FROM city where state_abbreviation <> 'CA'; -- <> or != is not equal

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city_name, area from city where area < 25;

-- The names from all records in the state table that have no assigned census region
SELECT state_name from state WHERE census_region IS NULL;

-- The names and census regions from all records in the state table that have an assigned census region
SELECT state_name, census_region from state where census_region IS NOT NULL;


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
SELECT city_name, area, state_abbreviation, population FROM city WHERE area < 25 and population > 100000;

-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)
SELECT state_name, census_region from state where census_region <> 'Midwest' or census_region is NULL;

-- The names, areas, and populations of cities in California (CA) or Florida (FL)
select city_name, area, population from city where state_abbreviation = 'CA' or state_abbreviation = 'FL';

-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)
select city_name, state_abbreviation, area, population from city where state_abbreviation in ('CT', 'ME', 'MA', 'NH', 'RI', 'VT');


-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"
select park_name, area * 1000 * 1000 AS area_in_square_meters from park;


-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
select city_name, state_abbreviation from city; --contains duplicates

-- Do it again, but without the repeats (note the difference in row count)
select distinct city_name, state_abbreviation from city;--rid duplicates


-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
select city_name from city where city_name like 'A%';

-- The names of all cities that end with "Falls"
select city_name from city where city_name ilike '%Falls';
select city_name from city where city_name like 'C%n%';
-- The names of all cities that contain a space
select city_name from city where city_name like '% %';--not to get


-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
select park_name, area from park where area >= 100 and area <= 200;
select park_name, area from park where area between 100 and 200; --same as statement above

-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900
select park_name, date_established from park where date_established between '1890-01-01' and '1899-12-31';