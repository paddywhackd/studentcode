-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT
	 distinct genre_name
FROM genre AS g
	JOIN movie_genre as mg ON g.genre_id = mg.genre_id
	JOIN movie as m on mg.movie_id = m.movie_id
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
where 
	person_name = 'Robert De Niro' AND
	release_date > '2010-01-01';
	





