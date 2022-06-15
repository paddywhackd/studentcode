-- 15. The name and date established of the newest national park.
-- (1 row)

select park_name, max(date_established) as date_established from park group by date_established, park_name order by date_established desc limit 1;