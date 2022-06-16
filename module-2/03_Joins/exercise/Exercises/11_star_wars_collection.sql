-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)

SELECT 
	title
FROM
	collection as c
	JOIN movie as m ON c.collection_id = m.collection_id
	JOIN person as p ON p.person_id = m.director_id
where
	collection_name like 'Star Wars%'
order by 
	release_date desc;
	
	
	


