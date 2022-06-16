-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result around 110-120)

SELECT 
	AVG(length_minutes) AS average_length
FROM 
	genre AS g
	JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
	JOIN movie AS m ON m.movie_id = mg.movie_id
WHERE 
	genre_name = 'Science Fiction';