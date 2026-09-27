# Write your MySQL query statement below
select  A.name As Employee 
from Employee E
join Employee A
on E.id=A.managerId
where A.salary>E.salary


 
 
 