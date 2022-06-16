-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT
	title, release_date
FROM
	movie AS m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
where person_name like 'Tom Hanks';
