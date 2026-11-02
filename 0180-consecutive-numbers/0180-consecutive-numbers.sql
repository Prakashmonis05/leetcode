# Write your MySQL query statement below
select distinct l.num as ConsecutiveNums from Logs l join Logs m on l.num=m.num join Logs n on m.num=n.num where l.id=m.id-1 and m.id=n.id-1;