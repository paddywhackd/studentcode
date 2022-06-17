-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'

SELECT
	person_name, 
	COUNT(title) AS num_of_movies
FROM 
	person AS p
LEFT OUTER JOIN movie_actor AS movact ON p.person_id = movact.actor_id
LEFT OUTER JOIN movie AS mov ON movact.movie_id = mov.movie_id
WHERE 
	person_name LIKE 'George %'
GROUP BY person_id
ORDER BY person_name;