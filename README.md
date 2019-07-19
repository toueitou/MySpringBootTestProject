# MySpringBootTestProject

https://www.cnblogs.com/weiguo21/p/MySQL.html

my.ini
data
cd D:\tyt\mysql-8.0.16-winx64\bin

1、mysqld --initialize --console

PWD:
RcK60S;lIpNG

2、mysqld --install

3、NET start mysql

4、mysql -uroot -p
RcK60S;lIpNG
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '123';


create database test;
use test;
DROP TABLE IF EXISTS `Order`;
CREATE TABLE `Order` (
  `orderId` varchar(32) NOT NULL ,
`clientId` varchar(32) ,
`orderDate` datetime NULL DEFAULT CURRENT_TIMESTAMP,
`quantity` varchar(32) ,
`commont` varchar(255) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

https://baijiahao.baidu.com/s?id=1608301601154521261&wfr=spider&for=pc
https://blog.csdn.net/u014553029/article/details/80971878


http://127.0.0.1:8081/boy/hello
