-- 14. The name and date established of the top 10 oldest national parks.
-- Order the results with the oldest park first.
-- (10 rows)
select park_name, min(date_established) as date_established from park group by date_established, park_name order by date_established asc limit 10;
