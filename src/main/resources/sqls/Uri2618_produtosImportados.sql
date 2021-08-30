SELECT  products.name,  providers.name, categories.name
FROM products products
inner join providers providers on providers.id = products.id_providers
inner join categories categories on categories.id = products.id_categories
where providers.name = 'Sansul SA'
and categories.name = 'Imported'