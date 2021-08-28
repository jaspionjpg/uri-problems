SELECT  m.id,  m.name
FROM movies m
inner join genres g on g.id = m.id_genres
where g.description = 'Action'