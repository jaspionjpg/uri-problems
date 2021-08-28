SELECT c.name, sum(p.amount)
FROM products p
inner join categories c on c.id = p.id_categories
group by c.name