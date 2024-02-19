/* Write your PL/SQL query statement below */
SELECT firstName,lastName,city,state
FROM Person
LEFT JOIN Address
USING(personID)