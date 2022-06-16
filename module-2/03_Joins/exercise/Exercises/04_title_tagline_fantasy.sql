-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
select
	title, tagline
FROM
	movie as m
	JOIN movie_genre as mg on m.movie_id = mg.movie_id
	JOIN genre as g on g.genre_id = mg.genre_id
where
	genre_name = 'Fantasy'
ORDER BY
	title;




