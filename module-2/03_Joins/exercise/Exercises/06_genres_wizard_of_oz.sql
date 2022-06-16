-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT 
	genre_name
FROM
	genre as g
	JOIN movie_genre as mg ON g.genre_id = mg.genre_id
	JOIN movie as m on mg.movie_id = m.movie_id
where title = 'The Wizard of Oz';






