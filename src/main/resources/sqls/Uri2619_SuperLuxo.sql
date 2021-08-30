SELECT  products.name,  providers.name, products.price
FROM products products
inner join providers providers on providers.id = products.id_providers
inner join categories categories on categories.id = products.id_categories
where products.price > 1000
and categories.name = 'Super Luxury'