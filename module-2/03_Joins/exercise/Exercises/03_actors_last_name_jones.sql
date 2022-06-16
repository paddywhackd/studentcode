-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT
	person_name, title
FROM 
	movie as m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
WHERE 
	person_name like '% Jones'

order by 
	person_name;

