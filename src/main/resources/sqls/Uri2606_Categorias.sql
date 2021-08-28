SELECT products.id, products.name
FROM products products
inner join categories categories on categories.id = products.id_categories
where categories.name like 'super%'