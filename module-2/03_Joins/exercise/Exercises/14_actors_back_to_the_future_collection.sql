-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

SELECT 
	Distinct person_name
FROM
	person as p
	JOIN movie_actor as ma ON p.person_id = ma.actor_id
	JOIN movie as m ON ma.movie_id = m.movie_id
	join collection as c on m.collection_id = c.collection_id
where
	collection_name = 'Back to the Future Collection';