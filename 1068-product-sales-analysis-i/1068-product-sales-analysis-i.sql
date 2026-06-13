# Write your MySQL query statement below
select p.product_name,w1.year,w1.price
 from Sales w1 left join product p 
 on w1.product_id=p.product_id;