-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT 
	TITLE
FROM
	collection as c
	JOIN movie as m ON c.collection_id = m.collection_id
	JOIN person as p ON p.person_id = m.director_id
where
	person_name <> 'George Lucas' AND 
	collection_name like 'Star Wars%';





