SELECT
    REGEXP_REPLACE (n.cpf,  '(\d{3})(\d{3})(\d{3})(\d{2})',  '\1.\2.\3-\4') AS CPF
FROM customers c
inner join natural_person n on n.id_customers = c.id