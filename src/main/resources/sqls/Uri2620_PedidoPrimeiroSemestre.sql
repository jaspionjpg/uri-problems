SELECT  c.name,  o.id
FROM customers c
inner join orders o on o.id_customers = c.id
where o.orders_date >= '2016-01-01'
and o.orders_date < '2016-07-01'