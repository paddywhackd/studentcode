-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)

select
	title, release_date
FROM
	movie as m
	JOIN movie_genre as mg on m.movie_id = mg.movie_id
	JOIN genre as g on g.genre_id = mg.genre_id
where
	genre_name = 'Comedy'
ORDER BY
	release_date;


