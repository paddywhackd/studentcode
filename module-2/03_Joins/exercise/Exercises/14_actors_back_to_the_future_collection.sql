-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

SELECT 
	person_name
FROM
	collection as c
	JOIN movie as m ON c.collection_id = m.collection_id
	JOIN person as p ON p.person_id = m.director_id
where
	collection_name like 'Star Wars%'
order by 
	release_date desc;