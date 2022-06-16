-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT
	person_name, birthday
FROM
	movie as m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
where title = 'The Fifth Element';



