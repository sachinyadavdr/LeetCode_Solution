# Write your MySQL query statement below
SELECT E.employee_id,E.name,count(E.employee_id) as reports_count,ROUND(avg(A.age)) AS average_age
FROM Employees as E
JOIN Employees as A
on A.reports_to=E.employee_id
group by E.employee_id
order by E.employee_id Asc

