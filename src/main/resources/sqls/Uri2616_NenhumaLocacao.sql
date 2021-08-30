select c.id, c.name
from customers c
where (
select count(l.id) from locations l
where l.id_customers = c.id
) = 0
order by c.id