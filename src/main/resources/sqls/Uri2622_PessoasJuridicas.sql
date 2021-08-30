SELECT c.name
FROM customers c
inner join legal_person l on l.id_customers = c.id