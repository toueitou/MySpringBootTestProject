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