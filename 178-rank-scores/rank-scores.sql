# Write your MySQL query statement below
SELECT score, DENSE_Rank() over (order by score desc ) as "ranK"
 FROM Scores  


