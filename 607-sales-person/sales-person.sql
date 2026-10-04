# Write your MySQL query statement below
select DISTINCT p.name
from SalesPerson p,Orders o
where p.sales_id NOT IN (select distinct o.sales_id
from Company c,SalesPerson p,Orders o
where c.name="RED" and c.com_id=o.com_id )
