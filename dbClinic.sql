-- phpMyAdmin SQL Dump -- version 4.8.3 -- https://www.phpmyadmin.net/ -- -- Host: localhost:8889 -- Generation Time: Jan 31, 2019 at 07:07 AM -- Server 
version: 5.7.23 -- PHP Version: 7.2.10 SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; SET time_zone = "+00:00"; -- -- Database: `dbClinic` -- -- 
-------------------------------------------------------- -- -- Table structure for table `tbDoctor` -- CREATE TABLE `tbDoctor` (
  `treatment_id` int(11) NOT NULL,
  `treatment_date` datetime NOT NULL,
  `patient_firstName` varchar(50) NOT NULL,
  `patient_lastName` varchar(50) NOT NULL,
  `blood_type` varchar(5) NOT NULL,
  `patient_symptom_id` varchar(5) NOT NULL,
  `doctor_id` varchar(10) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbDoctor` -- INSERT INTO `tbDoctor` (`treatment_id`, 
`treatment_date`, `patient_firstName`, `patient_lastName`, `blood_type`, `patient_symptom_id`, `doctor_id`) VALUES (2, '2019-01-21 12:54:12', 'Santi', 
'Mixay', 'O', 'T04', 'EM005'), (3, '2019-01-22 00:49:41', 'Vanxay', 'Norasing', 'A', 'T06', 'EM002'), (4, '2019-01-22 14:34:02', 'Phoumin', 'GN', 'O', 'T05', 
'EM005'), (5, '2019-01-25 10:44:43', 'ສັນຕິ', 'ວົງຄຳເຮືອງ', 'B', 'T04', 'EM002'); -- -------------------------------------------------------- -- -- Table 
structure for table `tbDoctorType` -- CREATE TABLE `tbDoctorType` (
  `type_id` varchar(5) NOT NULL,
  `type_name` varchar(100) NOT NULL,
  `type_price` int(11) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbDoctorType` -- INSERT INTO `tbDoctorType` (`type_id`, 
`type_name`, `type_price`) VALUES ('T01', 'ກວດເລືອດ', 50000), ('T02', 'ທາງເດືອນອາຫານ', 75000), ('T03', 'ທານເດີນຫາຍໃຈ', 75000), ('T04', 'ລະບົບຫົວໃຈ', 100000), 
('T05', 'ລະບົບປະສາດ', 125000), ('T06', 'ຈັກຂຸ (ຕາ)', 75000), ('T07', 'ທັນຕະ (ແຂ້ວ)', 60000), ('T08', 'ໂສຕະ (ຫູ)', 60000), ('T09', 'ພາຍໃນຍິງ', 100000); -- 
-------------------------------------------------------- -- -- Table structure for table `tbEmployee` -- CREATE TABLE `tbEmployee` (
  `em_id` varchar(10) NOT NULL,
  `em_firstName` varchar(50) NOT NULL,
  `em_lastName` varchar(50) NOT NULL,
  `em_dateOfBirth` date NOT NULL,
  `em_position` varchar(50) NOT NULL,
  `em_address` varchar(100) NOT NULL,
  `em_telephone` varchar(20) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbEmployee` -- INSERT INTO `tbEmployee` (`em_id`, 
`em_firstName`, `em_lastName`, `em_dateOfBirth`, `em_position`, `em_address`, `em_telephone`) VALUES ('EM001', 'Phetsarath', 'Rattanavongsa', '1991-12-25', 
'ບໍລິຫານ', 'Vientiane', '+8562055544432'), ('EM002', 'Ouane', 'Norsavanh', '1992-05-07', 'ທ່ານໝໍ', 'Vientiane', '+8562077788891'), ('EM003', 'Sengchaleun', 
'Vongvichit', '1996-06-06', 'ບໍລິການ', 'Vientiane', '+8562022233345'), ('EM004', 'Manilay', 'Vongsavang', '1995-04-14', 'ພະຍາບານ', 'Vientiane', 
'+8652054544567'), ('EM005', 'Sila', 'Athan', '1991-10-12', 'ທ່ານໝໍ', 'Vientiane', '+8562055544810'), ('EM006', 'ນະເດດ', 'ຄູກິມິຢະ', '1992-08-12', 'ທ່ານໝໍ', 
'Vientiane', '+8562055558888'); -- -------------------------------------------------------- -- -- Table structure for table `tbMedicSale` -- CREATE TABLE 
`tbMedicSale` (
  `bill_id` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `med_id` varchar(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total_price` int(11) NOT NULL,
  `bill_date` datetime NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbMedicSale` -- INSERT INTO `tbMedicSale` (`bill_id`, 
`customer_name`, `med_id`, `quantity`, `total_price`, `bill_date`) VALUES (1, 'Somsy', 'MED001', 2, 20000, '2019-01-17 10:58:05'), (2, 'Frank', 'MED003', 3, 
15000, '2019-01-25 09:54:44'), (3, 'ມີໄຊ', 'MED009', 1, 50000, '2019-01-25 10:41:04'); -- -- Triggers `tbMedicSale` -- DELIMITER $$ CREATE TRIGGER `medicSold` 
AFTER INSERT ON `tbMedicSale` FOR EACH ROW BEGIN DECLARE amount int DEFAULT 0; SELECT tbMedicSale.quantity INTO amount FROM tbMedicSale WHERE 
tbMedicSale.med_id = new.med_id; UPDATE tbMedicStorage SET tbMedicStorage.med_quantity = tbMedicStorage.med_quantity - amount WHERE tbMedicStorage.med_id = 
new.med_id; END $$ DELIMITER ; -- -------------------------------------------------------- -- -- Table structure for table `tbMedicStorage` -- CREATE TABLE 
`tbMedicStorage` (
  `med_id` varchar(10) NOT NULL,
  `med_name` varchar(50) DEFAULT NULL,
  `med_price` int(11) DEFAULT NULL,
  `med_type` varchar(20) DEFAULT NULL,
  `med_quantity` int(11) DEFAULT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbMedicStorage` -- INSERT INTO `tbMedicStorage` 
(`med_id`, `med_name`, `med_price`, `med_type`, `med_quantity`) VALUES ('MED001', 'Paracetamol 500', 10000, 'ຢາສາມັນປະຈຳບ້ານ', 20), ('MED002', 'Strepsils 
Original', 5000, 'ຢາສາມັນປະຈຳບ້ານ', 20), ('MED003', 'Strepsils Honey', 5000, 'ຢາສາມັນປະຈຳບ້ານ', 17), ('MED004', 'Potion of Despair', 500000, 'ຢາອັນຕະລາຍ', 
10), ('MED005', 'Durex Strawberry', 10000, 'ອຸປະກອນການແພດ', 20), ('MED006', 'T-Virus', 1000000, 'ຢາອັນຕະລາຍ', 5), ('MED007', 'Cannibis', 50000, 'ຢາແພດສັ່ງ', 
5), ('MED008', 'Pepto Bismol: Stomach Reliever', 25000, 'ຢາສາມັນປະຈຳບ້ານ', 5), ('MED009', 'First Aid Kit', 50000, 'ຢາສາມັນປະຈຳບ້ານ', 4), ('MED010', 'Sleeping 
Pills', 15000, 'ຢາສາມັນປະຈຳບ້ານ', 0), ('MED011', 'Syringe', 5000, 'ອຸປະກອນການແພດ', 0), ('MED012', 'ເຄືອເຂົາຮໍ', 5000, 'ຢາສາມັນປະຈຳບ້ານ', 10); -- 
-------------------------------------------------------- -- -- Table structure for table `tbResult` -- CREATE TABLE `tbResult` (
  `result_id` int(11) NOT NULL,
  `result_date` datetime NOT NULL,
  `treatment_id` int(11) NOT NULL,
  `result` varchar(50) NOT NULL,
  `result_comment` varchar(255) NOT NULL,
  `result_price` int(11) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8; -- -- Dumping data for table `tbResult` -- INSERT INTO `tbResult` (`result_id`, 
`result_date`, `treatment_id`, `result`, `result_comment`, `result_price`) VALUES (1, '2019-01-22 00:43:15', 2, 'ປົກກະຕິ', 'ສຸຂະພາບດີ', 100000), (2, 
'2019-01-22 00:55:18', 3, 'ມີບັນຫາເລັກນ້ອຍ', 'ທ່ານຄວນໃສ່ແວ່ນຕາ', 75000), (3, '2019-01-25 09:59:42', 4, 'ມີບັນຫາປານກາງ', 'ທ່ານຄວນໄດ້ຮັບການຮັກສາຢ່າງຮີບດ່ວນ', 
125000), (4, '2019-01-25 10:47:11', 5, 'ມີບັນຫາເລັກນ້ອຍ', 'ທ່ານຄວນງົດກິນອາຫານທີ່ມີໄຂມັນຫຼາຍ', 100000); -- -- Indexes for dumped tables -- -- -- Indexes for 
table `tbDoctor` -- ALTER TABLE `tbDoctor`
  ADD PRIMARY KEY (`treatment_id`),
  ADD KEY `doctor_id` (`doctor_id`),
  ADD KEY `patient_symptom_id` (`patient_symptom_id`); -- -- Indexes for table `tbDoctorType` -- ALTER TABLE `tbDoctorType`
  ADD PRIMARY KEY (`type_id`); -- -- Indexes for table `tbEmployee` -- ALTER TABLE `tbEmployee`
  ADD PRIMARY KEY (`em_id`); -- -- Indexes for table `tbMedicSale` -- ALTER TABLE `tbMedicSale`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `med_id` (`med_id`); -- -- Indexes for table `tbMedicStorage` -- ALTER TABLE `tbMedicStorage`
  ADD PRIMARY KEY (`med_id`); -- -- Indexes for table `tbResult` -- ALTER TABLE `tbResult`
  ADD PRIMARY KEY (`result_id`),
  ADD KEY `treatment_id` (`treatment_id`); -- -- AUTO_INCREMENT for dumped tables -- -- -- AUTO_INCREMENT for table `tbDoctor` -- ALTER TABLE `tbDoctor`
  MODIFY `treatment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6; -- -- AUTO_INCREMENT for table `tbMedicSale` -- ALTER TABLE `tbMedicSale`
  MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4; -- -- AUTO_INCREMENT for table `tbResult` -- ALTER TABLE `tbResult`
  MODIFY `result_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5; -- -- Constraints for dumped tables -- -- -- Constraints for table `tbDoctor` -- ALTER 
TABLE `tbDoctor`
  ADD CONSTRAINT `tbdoctor_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `tbEmployee` (`em_id`),
  ADD CONSTRAINT `tbdoctor_ibfk_2` FOREIGN KEY (`patient_symptom_id`) REFERENCES `tbDoctorType` (`type_id`); -- -- Constraints for table `tbMedicSale` -- 
ALTER TABLE `tbMedicSale`
  ADD CONSTRAINT `tbmedicsale_ibfk_1` FOREIGN KEY (`med_id`) REFERENCES `tbMedicStorage` (`med_id`); -- -- Constraints for table `tbResult` -- ALTER TABLE 
`tbResult`
  ADD CONSTRAINT `tbresult_ibfk_1` FOREIGN KEY (`treatment_id`) REFERENCES `tbDoctor` (`treatment_id`);
