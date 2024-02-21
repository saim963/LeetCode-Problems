# Write your MySQL query statement below
UPDATE salary
    SET sex = CASE
        WHEN sex = 'm' then 'f'
        else 'm'
    END