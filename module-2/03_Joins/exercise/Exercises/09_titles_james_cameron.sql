-- 9. The titles of movies directed by James Cameron (6 rows)

SELECT 
	title
FROM
	movie AS mov
	JOIN person As p ON mov.director_id = p.person_id
Where 
	person_name = 'James Cameron';