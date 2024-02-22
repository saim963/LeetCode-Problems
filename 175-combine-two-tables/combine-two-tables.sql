# Write your MySQL query statement below
SELECT FirstName, LastName, City, State
FROM Person as p left join Address as a on p.personId = a.personId