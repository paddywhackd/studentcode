-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

SELECT 
	 Distinct person_name
FROM
	collection as c
	JOIN movie as m ON c.collection_id = m.collection_id
	JOIN person as p ON p.person_id = m.director_id
where
	collection_name like 'Harry Potter%'
	

	