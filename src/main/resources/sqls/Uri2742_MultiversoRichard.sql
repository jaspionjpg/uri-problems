SELECT  l.name,  round((l.omega * 1.618), 3) as "Fator N"
FROM life_registry l
inner join dimensions d on d.id = l.dimensions_id
where (d.name = 'C875' or d.name = 'C774')
AND l.name LIKE 'Richard%'
order by l.omega

URI Online Judge SQL | 2742
O Multiverso de Richard
Marcos Lima BR Brasil

Timelimit: 1
Richard é um cientista muito famoso por suas teorias do multiverso, onde ele descreve que todo o conjunto hipotético de universos paralelos podem ser representados por meio de tabelas em um banco de dados. E graças a essa teoria você tem um emprego.

A sua primeira tarefa é selecionar todos os possíveis Richards das dimensões C875 e C774, junto a sua probabilidade de existência (o fator N) com a precisão de 3 casas decimais.

Lembre-se que (o fator N) é calculado multiplicando o valor omega por 1,618. Os dados devem ser ordenados pelo menor valor do campo omega.

Esquema
dimensions
Coluna	Tipo
id (PK)	integer
name	varchar
life_registry
Coluna	Tipo
id (PK)	integer
name	varchar
omega	numeric
dimensions_id (FK)	integer
Tabelas
dimensions
id	name
1	C774
2	C784
3	C794
4	C824
5	C875
life_registry
id	name	omega	dimensions_id
1	Richard Postman	5.6	2
2	Simple Jelly	1.4	1
3	Richard Gran Master	2.5	1
4	Richard Turing	6.4	4
5	Richard Strall	1.0	3
Exemplo de saída
name	Fator N
Richard Gran Master	4.045