-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT 
	DISTINCT genre_name
FROM
	genre as g 
	JOIN movie_genre as mg ON g.genre_id = mg.genre_id
	JOIN movie as m on mg.movie_id = m.movie_id
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
	
where
	person_name = 'Christopher Lloyd';



