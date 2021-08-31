select name, length(name) as length
from people
group by name
order by length desc