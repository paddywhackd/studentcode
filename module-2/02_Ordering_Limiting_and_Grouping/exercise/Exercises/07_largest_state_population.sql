-- 7. The population of the state with the highest population. Name the column 'largest_state_population'.
-- Expected answer is around 39,500,000
-- (1 row)
select population as largest_state_population from state where state_abbreviation like 'CA';