-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 04, 2025 at 02:47 AM
-- Server version: 8.0.30
-- PHP Version: 8.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `konser_aul`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_konser`
--

CREATE TABLE `data_konser` (
  `id` int NOT NULL,
  `nama_event` varchar(255) NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `waktu` varchar(255) NOT NULL,
  `harga` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `data_konser`
--

INSERT INTO `data_konser` (`id`, `nama_event`, `lokasi`, `waktu`, `harga`) VALUES
(1, 'Soul Intimate Concert 4.0', 'Jakarta', 'Besok', 1000000),
(2, 'Taeyeon: The TENSE in JAKARTA', 'JAKARTA', '12 mei', 1000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_konser`
--
ALTER TABLE `data_konser`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_konser`
--
ALTER TABLE `data_konser`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
