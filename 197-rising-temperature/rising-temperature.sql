# Write your MySQL query statement below
select w1.id
from weather AS W1
JOIN Weather as w2
on DATEDIFF(W1.recordDate,w2.recordDate)=1
where W1.temperature>w2.temperature