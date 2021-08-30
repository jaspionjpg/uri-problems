SELECT  products.name
FROM products products
inner join providers providers on providers.id = products.id_providers
where products.amount > 10 and products.amount < 20
and providers.name like 'P%'