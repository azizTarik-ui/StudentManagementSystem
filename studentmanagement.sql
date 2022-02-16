-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2020 at 10:47 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendencerecord`
--

CREATE TABLE `attendencerecord` (
  `Dept` varchar(40) NOT NULL,
  `Shift` varchar(40) NOT NULL,
  `Class` int(15) NOT NULL,
  `Section` varchar(40) NOT NULL,
  `Date` varchar(60) NOT NULL,
  `Present` int(15) NOT NULL,
  `Absent` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendencerecord`
--

INSERT INTO `attendencerecord` (`Dept`, `Shift`, `Class`, `Section`, `Date`, `Present`, `Absent`) VALUES
('Science', 'Morning', 11, '1', '18 September 2020', 3, 0),
('Humanities', 'Morning', 11, '1', '18 September 2020', 2, 0),
('Business Studies', 'Morning', 11, '1', 'null', 0, 0),
('Science', 'Morning', 12, 'C', 'null', 0, 0),
('Science', 'Day', 12, 'A', '19 September 2020', 0, 1),
('Humanities', 'Day', 11, 'A', '19 September 2020', 2, 0),
('Humanities', 'Day', 11, 'A', '19 September 2020', 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `businessstudiessubjects`
--

CREATE TABLE `businessstudiessubjects` (
  `id` int(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Class` int(255) NOT NULL,
  `Shift` varchar(40) NOT NULL,
  `Bangla1st` double NOT NULL,
  `B1CQ` double NOT NULL,
  `B1MCQ` double NOT NULL,
  `Bangla2nd` double NOT NULL,
  `B2CQ` double NOT NULL,
  `B2MCQ` double NOT NULL,
  `English1st` double NOT NULL,
  `English2nd` double NOT NULL,
  `ICT` double NOT NULL,
  `ICTCQ` double NOT NULL,
  `ICTMCQ` double NOT NULL,
  `ICTLab` double NOT NULL,
  `Accounting1st` double NOT NULL,
  `ACC1CQ` double NOT NULL,
  `ACC1MCQ` double NOT NULL,
  `Accounting2nd` double NOT NULL,
  `ACC2CQ` double NOT NULL,
  `ACC2MCQ` double NOT NULL,
  `Economics1st` double NOT NULL,
  `ECO1CQ` double NOT NULL,
  `ECO1MCQ` double NOT NULL,
  `Economics2nd` double NOT NULL,
  `ECO2CQ` double NOT NULL,
  `ECO2MCQ` double NOT NULL,
  `FinanceBankingandInsurance1st` double NOT NULL,
  `FBI1CQ` double NOT NULL,
  `FBI1MCQ` double NOT NULL,
  `FinanceBankingandInsurance2nd` double NOT NULL,
  `FBI2CQ` double NOT NULL,
  `FBI2MCQ` double NOT NULL,
  `BusinessOrgandManagement1st` double NOT NULL,
  `BOM1CQ` double NOT NULL,
  `BOM1MCQ` double NOT NULL,
  `BusinessOrgandManagement2nd` double NOT NULL,
  `BOM2CQ` double NOT NULL,
  `BOM2MCQ` double NOT NULL,
  `TotalMarks` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `businessstudiessubjects`
--

INSERT INTO `businessstudiessubjects` (`id`, `Name`, `Semester`, `Class`, `Shift`, `Bangla1st`, `B1CQ`, `B1MCQ`, `Bangla2nd`, `B2CQ`, `B2MCQ`, `English1st`, `English2nd`, `ICT`, `ICTCQ`, `ICTMCQ`, `ICTLab`, `Accounting1st`, `ACC1CQ`, `ACC1MCQ`, `Accounting2nd`, `ACC2CQ`, `ACC2MCQ`, `Economics1st`, `ECO1CQ`, `ECO1MCQ`, `Economics2nd`, `ECO2CQ`, `ECO2MCQ`, `FinanceBankingandInsurance1st`, `FBI1CQ`, `FBI1MCQ`, `FinanceBankingandInsurance2nd`, `FBI2CQ`, `FBI2MCQ`, `BusinessOrgandManagement1st`, `BOM1CQ`, `BOM1MCQ`, `BusinessOrgandManagement2nd`, `BOM2CQ`, `BOM2MCQ`, `TotalMarks`) VALUES
(14, 'Abul', '1', 11, 'Morning', 76, 51, 25, 76, 90, 0, 90, 80, 95, 45, 25, 0, 66, 45, 21, 65, 45, 20, 66, 45, 21, 66, 45, 21, 70, 45, 25, 66, 45, 21, 66, 45, 21, 82, 60, 22, 978);

-- --------------------------------------------------------

--
-- Table structure for table `humanitiessubjects`
--

CREATE TABLE `humanitiessubjects` (
  `id` int(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Class` int(255) NOT NULL,
  `Shift` varchar(40) NOT NULL,
  `Bangla1st` double NOT NULL,
  `B1CQ` double NOT NULL,
  `B1MCQ` double NOT NULL,
  `Bangla2nd` double NOT NULL,
  `B2CQ` double NOT NULL,
  `B2MCQ` double NOT NULL,
  `English1st` double NOT NULL,
  `E1CQ` double NOT NULL,
  `English2nd` double NOT NULL,
  `E2CQ` double NOT NULL,
  `ICT` double NOT NULL,
  `ICTCQ` double NOT NULL,
  `ICTMCQ` double NOT NULL,
  `ICTLab` double NOT NULL,
  `Sociology1st` double NOT NULL,
  `SOC1CQ` double NOT NULL,
  `SOC1MCQ` double NOT NULL,
  `Sociology2nd` double NOT NULL,
  `SOC2CQ` double NOT NULL,
  `SOC2MCQ` double NOT NULL,
  `Economics1st` double NOT NULL,
  `ECO1CQ` double NOT NULL,
  `ECO1MCQ` double NOT NULL,
  `Economics2nd` double NOT NULL,
  `ECO2CQ` double NOT NULL,
  `ECO2MCQ` double NOT NULL,
  `Geography1st` double NOT NULL,
  `GEO1CQ` double NOT NULL,
  `GEO1MCQ` double NOT NULL,
  `Geography2nd` double NOT NULL,
  `GEO2CQ` double NOT NULL,
  `GEO2MCQ` double NOT NULL,
  `Logic1st` double NOT NULL,
  `LOG1CQ` double NOT NULL,
  `LOG1MCQ` double NOT NULL,
  `Logic2nd` double NOT NULL,
  `LOG2CQ` double NOT NULL,
  `LOG2MCQ` double NOT NULL,
  `History1st` double NOT NULL,
  `HIS1CQ` double NOT NULL,
  `HIS1MCQ` double NOT NULL,
  `History2nd` double NOT NULL,
  `HIS2CQ` double NOT NULL,
  `HIS2MCQ` double NOT NULL,
  `SocialScience1st` double NOT NULL,
  `Ss1CQ` double NOT NULL,
  `Ss1MCQ` double NOT NULL,
  `SocialScience2nd` double NOT NULL,
  `Ss2CQ` double NOT NULL,
  `Ss2MCQ` double NOT NULL,
  `CivicandGoodGovernance1st` double NOT NULL,
  `CGG1CQ` double NOT NULL,
  `CGG1MCQ` double NOT NULL,
  `CivicandGoodGovernance2nd` double NOT NULL,
  `CGG2CQ` double NOT NULL,
  `CGG2MCQ` double NOT NULL,
  `IslamicHistoryandCulture1st` double NOT NULL,
  `IHC1CQ` double NOT NULL,
  `IHC1MCQ` double NOT NULL,
  `IslamicHistoryandCulture2nd` double NOT NULL,
  `IHC2CQ` double NOT NULL,
  `IHC2MCQ` double NOT NULL,
  `TotalMarks` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `humanitiessubjects`
--

INSERT INTO `humanitiessubjects` (`id`, `Name`, `Semester`, `Class`, `Shift`, `Bangla1st`, `B1CQ`, `B1MCQ`, `Bangla2nd`, `B2CQ`, `B2MCQ`, `English1st`, `E1CQ`, `English2nd`, `E2CQ`, `ICT`, `ICTCQ`, `ICTMCQ`, `ICTLab`, `Sociology1st`, `SOC1CQ`, `SOC1MCQ`, `Sociology2nd`, `SOC2CQ`, `SOC2MCQ`, `Economics1st`, `ECO1CQ`, `ECO1MCQ`, `Economics2nd`, `ECO2CQ`, `ECO2MCQ`, `Geography1st`, `GEO1CQ`, `GEO1MCQ`, `Geography2nd`, `GEO2CQ`, `GEO2MCQ`, `Logic1st`, `LOG1CQ`, `LOG1MCQ`, `Logic2nd`, `LOG2CQ`, `LOG2MCQ`, `History1st`, `HIS1CQ`, `HIS1MCQ`, `History2nd`, `HIS2CQ`, `HIS2MCQ`, `SocialScience1st`, `Ss1CQ`, `Ss1MCQ`, `SocialScience2nd`, `Ss2CQ`, `Ss2MCQ`, `CivicandGoodGovernance1st`, `CGG1CQ`, `CGG1MCQ`, `CivicandGoodGovernance2nd`, `CGG2CQ`, `CGG2MCQ`, `IslamicHistoryandCulture1st`, `IHC1CQ`, `IHC1MCQ`, `IslamicHistoryandCulture2nd`, `IHC2CQ`, `IHC2MCQ`, `TotalMarks`) VALUES
(14, 'st1', '1', 11, 'Morning', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(80, 'New1', '1', 11, 'Morning', 85, 60, 25, 85, 60, 25, 80, 80, 80, 80, 95, 45, 25, 25, 70, 45, 25, 70, 45, 45, 90, 65, 25, 90, 65, 25, 90, 65, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 1770),
(90, 'st1', '1', 11, 'Morning', 81, 56, 25, 81, 56, 25, 70, 70, 70, 70, 91, 45, 21, 25, 77, 56, 21, 80, 59, 59, 74, 50, 24, 74, 50, 24, 74, 50, 24, 72, 51, 21, 77, 56, 21, 73, 54, 19, 72, 54, 18, 67, 50, 17, 75, 50, 25, 74, 50, 24, 86, 61, 25, 74, 50, 24, 73, 50, 23, 70, 49, 21, 1585),
(113, 'Joffry', '1', 11, 'Morning', 81, 60, 21, 81, 60, 21, 80, 80, 70, 70, 87, 41, 21, 25, 65, 40, 25, 65, 40, 40, 84, 59, 25, 81, 60, 21, 81, 60, 21, 85, 60, 25, 75, 50, 25, 71, 51, 20, 77, 56, 21, 71, 51, 20, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 86, 65, 21, 75, 50, 25, 1655),
(124, 'Nameless Wonder ', '1', 11, 'Morning', 56, 56, 0, 79, 79, 0, 80, 80, 75, 75, 91, 45, 21, 25, 80, 60, 20, 81, 60, 60, 82, 60, 22, 83, 60, 23, 81, 60, 21, 82, 60, 22, 71, 50, 21, 71, 50, 21, 71, 50, 21, 72, 50, 22, 71, 50, 21, 76.3, 56.3, 20, 85, 60, 25, 85, 60, 25, 85, 60, 25, 85, 60, 25, 1642.3);

-- --------------------------------------------------------

--
-- Table structure for table `parfoemance`
--

CREATE TABLE `parfoemance` (
  `id` int(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Dept` varchar(255) NOT NULL,
  `Class` int(255) NOT NULL,
  `Shift` varchar(40) NOT NULL,
  `Section` varchar(255) NOT NULL,
  `TotalWorkDays` int(255) NOT NULL,
  `Present` int(255) NOT NULL,
  `Absent` int(255) NOT NULL,
  `Behavior` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parfoemance`
--

INSERT INTO `parfoemance` (`id`, `Name`, `Dept`, `Class`, `Shift`, `Section`, `TotalWorkDays`, `Present`, `Absent`, `Behavior`) VALUES
(113, 'Joffry', 'Humanities', 11, 'Morning', '1', 125, 10, 3, 'Good'),
(124, 'Nameless Wonder ', 'Humanities', 11, 'Morning', '1', 125, 8, 4, ''),
(300, 'New Name', 'Science', 11, 'Morning', '1', 120, 9, 1, 'Need Care'),
(700, 'New Comer', 'Science', 11, 'Morning', '1', 120, 7, 2, 'Satisfactory'),
(800, 'temp', 'Science', 11, 'Morning', '1', 120, 5, 2, 'Good'),
(1822, 'Random1', 'Science', 12, 'Day', 'A', 125, 0, 0, 'Good'),
(1827, 'Student1', 'Science', 12, 'Day', 'A', 125, 1, 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `remembercred`
--

CREATE TABLE `remembercred` (
  `SL` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `State` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `remembercred`
--

INSERT INTO `remembercred` (`SL`, `name`, `pass`, `State`) VALUES
(1, 'temp2', '111', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `routinescience`
--

CREATE TABLE `routinescience` (
  `Class` int(255) NOT NULL,
  `Day` varchar(255) NOT NULL,
  `8:00-8:50` varchar(255) NOT NULL,
  `8:50-9:40` varchar(255) NOT NULL,
  `9:40-10:30` varchar(255) NOT NULL,
  `10:30-11:10` varchar(255) NOT NULL,
  `11:10-12:00` varchar(255) NOT NULL,
  `12:00-12:50` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `routinescience`
--

INSERT INTO `routinescience` (`Class`, `Day`, `8:00-8:50`, `8:50-9:40`, `9:40-10:30`, `10:30-11:10`, `11:10-12:00`, `12:00-12:50`) VALUES
(11, 'Sunday', 'Bangla', 'English', 'Higher Math', '', 'Chemistry', 'ICT'),
(11, 'Monday', 'ICT', 'Bangla', 'Biology', '', 'Physics', 'Chemistry'),
(11, 'Tuesday', 'Higher Math', 'Physics', 'Biology', '', 'English', 'Chemistry'),
(11, 'Wednesday', 'Bangla', 'Higher Math', 'Chemistry', '', 'Physics', 'Biology'),
(11, 'Thursday', 'English', 'Higher Math', 'ICT', '', 'Physics', 'Biology'),
(11, 'Friday', '-', '-', '-', '', '-', '-'),
(11, 'Saturday', '-', '-', '-', '', '-', '-');

-- --------------------------------------------------------

--
-- Table structure for table `sciencesubjects`
--

CREATE TABLE `sciencesubjects` (
  `id` int(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Class` int(255) NOT NULL,
  `Shift` varchar(40) NOT NULL,
  `Bangla1st` double NOT NULL,
  `B1CQ` double NOT NULL,
  `B1MCQ` double NOT NULL,
  `Bangla2nd` double NOT NULL,
  `B2CQ` double NOT NULL,
  `B2MCQ` double NOT NULL,
  `English1st` double NOT NULL,
  `English2nd` double NOT NULL,
  `HigherMath1st` double NOT NULL,
  `HM1CQ` double NOT NULL,
  `HM1MCQ` double NOT NULL,
  `HM1Lab` double NOT NULL,
  `HigherMath2nd` double NOT NULL,
  `HM2CQ` double NOT NULL,
  `HM2MCQ` double NOT NULL,
  `HM2Lab` double NOT NULL,
  `Physics1st` double NOT NULL,
  `PHY1CQ` double NOT NULL,
  `PHY1MCQ` double NOT NULL,
  `PHY1Lab` double NOT NULL,
  `Physics2nd` double NOT NULL,
  `PHY2CQ` double NOT NULL,
  `PHY2MCQ` double NOT NULL,
  `PHY2Lab` double NOT NULL,
  `Chemistry1st` double NOT NULL,
  `CHE1CQ` double NOT NULL,
  `CHE1MCQ` double NOT NULL,
  `CHE1Lab` double NOT NULL,
  `Chemistry2nd` double NOT NULL,
  `CHE2CQ` double NOT NULL,
  `CHE2MCQ` double NOT NULL,
  `CHE2Lab` double NOT NULL,
  `Biology1st` double NOT NULL,
  `BIO1CQ` double NOT NULL,
  `BIO1MCQ` double NOT NULL,
  `BIO1Lab` double NOT NULL,
  `Biology2nd` double NOT NULL,
  `BIO2CQ` double NOT NULL,
  `BIO2MCQ` double NOT NULL,
  `BIO2Lab` double NOT NULL,
  `ICT` double NOT NULL,
  `ICTCQ` double NOT NULL,
  `ICTMCQ` double NOT NULL,
  `ICTLab` double NOT NULL,
  `TotalMarks` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sciencesubjects`
--

INSERT INTO `sciencesubjects` (`id`, `Name`, `Semester`, `Class`, `Shift`, `Bangla1st`, `B1CQ`, `B1MCQ`, `Bangla2nd`, `B2CQ`, `B2MCQ`, `English1st`, `English2nd`, `HigherMath1st`, `HM1CQ`, `HM1MCQ`, `HM1Lab`, `HigherMath2nd`, `HM2CQ`, `HM2MCQ`, `HM2Lab`, `Physics1st`, `PHY1CQ`, `PHY1MCQ`, `PHY1Lab`, `Physics2nd`, `PHY2CQ`, `PHY2MCQ`, `PHY2Lab`, `Chemistry1st`, `CHE1CQ`, `CHE1MCQ`, `CHE1Lab`, `Chemistry2nd`, `CHE2CQ`, `CHE2MCQ`, `CHE2Lab`, `Biology1st`, `BIO1CQ`, `BIO1MCQ`, `BIO1Lab`, `Biology2nd`, `BIO2CQ`, `BIO2MCQ`, `BIO2Lab`, `ICT`, `ICTCQ`, `ICTMCQ`, `ICTLab`, `TotalMarks`) VALUES
(21, 'New1', '1', 11, 'Morning', 70, 45, 25, 70, 45, 25, 70, 80, 95, 45, 25, 25, 95, 45, 25, 25, 95, 45, 25, 25, 86, 40, 21, 25, 86, 40, 21, 25, 86, 40, 21, 25, 75, 31, 19, 25, 75, 33, 19, 25, 76, 30, 21, 25, 1059),
(100, 'New1', '1', 11, 'Morning', 85, 60, 25, 85, 60, 25, 90, 100, 95, 45, 25, 25, 95, 45, 25, 25, 95, 45, 25, 25, 84, 40, 19, 25, 90, 45, 20, 25, 90, 45, 20, 25, 90, 45, 20, 25, 90, 45, 20, 25, 95, 45, 25, 25, 1184),
(300, 'New Name', '1', 11, 'Morning', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(700, 'New Comer', '1', 11, 'Morning', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(800, 'temp', '1', 11, 'Morning', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(1822, 'Random1', 'A', 12, 'Day', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(1827, 'Student1', 'A', 12, 'Day', 85, 60, 25, 90, 90, 0, 70, 80, 92, 45, 22, 25, 86, 40, 21, 25, 92, 46, 21, 25, 86, 40, 21, 25, 91, 45, 21, 25, 85, 40, 20, 25, 89, 40, 24, 25, 89, 49, 21, 25, 91, 45, 21, 25, 1126);

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `id` int(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `FatherName` varchar(255) NOT NULL,
  `MotherName` varchar(255) NOT NULL,
  `Dept` varchar(255) NOT NULL,
  `Age` int(15) NOT NULL,
  `BirthDate` varchar(40) NOT NULL,
  `BloodGroup` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Class` int(20) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `GurdianContact` varchar(20) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `CGPA` varchar(40) NOT NULL,
  `Shift` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`id`, `name`, `FatherName`, `MotherName`, `Dept`, `Age`, `BirthDate`, `BloodGroup`, `Gender`, `Class`, `Semester`, `Email`, `ContactNo`, `GurdianContact`, `Address`, `CGPA`, `Shift`) VALUES
(14, 'Abul', 'b', 'c', 'Business Studies', 21, '0/0/0', 'A+', 'Male', 11, '1', 'ab@gamil.com', '123', '123', 'abce', '4.58', 'Morning'),
(21, 'New1', 'New2', 'New3', 'Science', 21, '23/03/2000', 'O+', 'Male', 11, '1', 'abc@gmail.com', '123', '1235', 'asd', '4.33', 'Morning'),
(42, 'Noman', 'Fname', 'Mname', 'Science', 18, '27/11/1998', 'O+', 'Male', 12, '1', 'abc@gmail.com', '123', '1267', 'Dhaka', '5.00', 'Morning'),
(80, 'New1', 'abc', 'cde', 'Humanities', 17, '5/5/5', 'A+', 'Male', 11, '1', 'ads@gmail.com', '123', '123', 'asdfa', '5', 'Morning'),
(90, 'st1', 'Mnam', 'Fman', 'Humanities', 21, '0/0/0', 'A+', 'Male', 11, '1', 'abc@gamil.com', '123', '123', 'abe', '0.0', 'Morning'),
(100, 'New1', 'Fnamw', 'Manw', 'Science', 21, '5/5/2020', 'B+', 'Male', 11, '1', 'abc@gmail.com', '123', '123', 'adsa', '5', 'Morning'),
(113, 'Joffry', 'sdfh', 'dsf', 'Humanities', 17, '8/8/1996', 'A+', 'Male', 11, '1', 'asd@gmail.com', '123', '123', 'abc', '5', 'Morning'),
(124, 'Nameless Wonder ', 'AMAn', 'Moon', 'Humanities', 16, '9/3/1999', 'A+', 'Male', 11, '1', 'asd@gmail.com', '123', '123', 'asd', '5', 'Morning'),
(300, 'New Name', 'asd', 'asd', 'Science', 18, '0/0/0', 'O+', 'Male', 11, '1', 'abc@gmail.com', '123', '123', 'asd', '0.0', 'Morning'),
(700, 'New Comer', 'asd', 'asd', 'Science', 18, '07/09/20', 'A+', 'Male', 11, '1', 'abc@gmail.com', '123', '123', 'asdc', '0.0', 'Morning'),
(800, 'temp', 'asd', 'asd', 'Science', 18, '0/0/0', 'O+', 'Male', 11, '1', 'abc@gmail.com', '123', '123', 'sadsadaf', '0.0', 'Morning'),
(1822, 'Random1', 'Dominator', 'Pessimist', 'Science', 18, '21/09/2000', 'O+', 'Male', 12, 'A', 'abct@gmail.com', '01552698778', '01552698778', 'sdsdfdsf', '0.0', 'Day'),
(1827, 'Student1', 'RandomName', 'A NAme', 'Science', 17, '03/05/2020', 'A+', 'Male', 12, 'A', 'abc@yahoo.com', '0155235678', '0155235678', 'abce', '5', 'Day');

-- --------------------------------------------------------

--
-- Table structure for table `userlog`
--

CREATE TABLE `userlog` (
  `id` int(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `Dept` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `Class` int(11) NOT NULL,
  `Section` varchar(255) NOT NULL,
  `Designation` varchar(255) NOT NULL,
  `Shift` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userlog`
--

INSERT INTO `userlog` (`id`, `name`, `Dept`, `email`, `password`, `Class`, `Section`, `Designation`, `Shift`) VALUES
(13, 'Admin', 'Science', 'abc@gmail.com', '789', 11, '1', 'Lecturer ', 'Morning'),
(45, 'Admin2', 'Humanities', 'abc@gmail.com', '456', 11, '1', 'Lecturer ', 'Morning'),
(50, 'Admin3', 'Business Studies', 'abc@gmail.com', '333', 11, '1', 'Lecturer ', 'Morning'),
(100, 'Ahammed Tarik Aziz', 'Science', 'teach@yahoo.com', '999', 11, '1', 'Lecturer ', 'Morning'),
(109, 'temp1', 'Science', 'nmail@gmail.com', '111', 12, 'C', 'Lecturer', 'Morning'),
(900, 'temp2', 'Science', 'ab@gmail.com', '111', 12, 'A', 'Lecturer', 'Day'),
(1260, 'ttt3', 'Humanities', 'asda', '123', 11, 'A', 'Lecturer', 'Day');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `parfoemance`
--
ALTER TABLE `parfoemance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sciencesubjects`
--
ALTER TABLE `sciencesubjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userlog`
--
ALTER TABLE `userlog`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `userlog`
--
ALTER TABLE `userlog`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10001;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
