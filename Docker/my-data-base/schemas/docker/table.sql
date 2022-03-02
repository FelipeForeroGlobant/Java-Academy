CREATE TABLE `user` (
   `userName` varchar(45) NOT NULL,
   `firstName` varchar(45) DEFAULT NULL,
   `lastName` varchar(45) DEFAULT NULL,
   `identificationNumber` varchar(45) DEFAULT NULL,
   `adress` varchar(45) DEFAULT NULL,
   `postalCode` varchar(45) DEFAULT NULL,
   `city` varchar(45) DEFAULT NULL,
   `state` varchar(45) DEFAULT NULL,
   `country` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`userName`)

 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('sisco123', 'simon', 'cortez', '123456', 'street 30 a 22', '123', 'Ala', ' alabama', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('euler123', 'euler', 'campi', '321565', 'av 12 No. 123', '456', 'alaska', 'ancharoge', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('lucas123', 'lucas', 'tonight', '545665', 'av 154 ', '478', 'arizona', 'phoenix', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('mary123', 'mary', 'poins', '123455', 'av 78 street 1547', '546', 'california', 'sacramento', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('bruno123', 'bruno', 'mory', '154565', 'street 1234', '998', 'denver', 'colorado', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('daleware', 'dele', 'ware', '456783', 'street 789', '789', 'dover', 'deleware', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('flower123', 'flower', 'japlin', '456788', 'av 123 street 145', '875', 'pensacola', 'florida', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('edna123', 'edna', 'moda', '45687', 'av 144 street 45', '789', 'miami', 'florida', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('luly123', 'luly', 'bunny', '78987', 'av 12 street 145', '456', 'springfield', 'florida', 'eeuu');
INSERT INTO `database`.`user` (`userName`, `firstName`, `lastName`, `identificationNumber`, `adress`, `postalCode`, `city`, `state`, `country`) VALUES ('mary1', 'mary', 'maried', '45654', 'av 112 street 145', '872', 'indianapolis', 'indiana', 'eeuu');


