# Write your MySQL query statement below
SELECT max(E.salary) as SecondHighestsalary
FROM Employee E
where E.salary<(select max(E.salary)from  Employee E);