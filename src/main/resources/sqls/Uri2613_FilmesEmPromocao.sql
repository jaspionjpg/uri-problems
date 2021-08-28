SELECT  m.id,  m.name
FROM movies m
inner join prices p on p.id = m.id_prices
where p.value < 2