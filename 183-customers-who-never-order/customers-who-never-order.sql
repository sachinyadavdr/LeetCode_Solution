# Write your MySQL query statement below
select c.name as Customers
from  Customers c
where NOT Exists (
                 select *
                 from Orders o
                 where o.customerId=c.id
)

