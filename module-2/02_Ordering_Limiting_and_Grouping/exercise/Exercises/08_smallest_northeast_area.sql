-- 8. The area of the smallest state in the "Northeast" census region. Name the column 'smallest_northeast_area'.
-- Expected answer is around 4,000
-- (1 row)
select min(area) as smallest_northeast_area from state where census_region like 'Northeast'; 
