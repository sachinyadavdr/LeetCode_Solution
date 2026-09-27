# Write your MySQL query statement below
select E.event_day as day ,E.emp_id,sum(out_time-in_time) as total_time
from Employees E
group by E.event_day,E.emp_id