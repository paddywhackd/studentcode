-- 16. The average area of national parks that have camping. Name the column 'average_park_area'.
-- Expected answer is around 3,900.
-- (1 row)

select avg(area) as average_park_area from park group by has_camping offset 1;
