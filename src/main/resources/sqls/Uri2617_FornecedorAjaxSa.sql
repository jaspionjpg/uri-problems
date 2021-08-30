SELECT  products.name,  providers.name
FROM products products
inner join providers providers on providers.id = products.id_providers
where providers.name = 'Ajax SA'