-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: springjwt
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_token`
--

DROP TABLE IF EXISTS `t_token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `deleted` varchar(255) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  `token` varchar(1000) DEFAULT NULL,
  `token_exp_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_token`
--

LOCK TABLES `t_token` WRITE;
/*!40000 ALTER TABLE `t_token` DISABLE KEYS */;
INSERT INTO `t_token` VALUES (1,'2022-09-17 00:08:51',1,NULL,'2022-09-17 00:08:51',NULL,'eyJhbGciOiJIUzI1NiJ9.eyJ0aWVuIjp7InBhc3N3b3JkIjoiJDJhJDEwJEJVTTZBd05kS3ViMFNqYzRvbko3bU9SOU8xdDR4YXZycU1yRmNJaUdLMC5IUE1OUzdjcHJhIiwidXNlcklkIjoxLCJhdXRob3JpdGllcyI6W10sInVzZXJuYW1lIjoiaHVuZ2hoIn0sImV4cCI6MTY2NDIxMjEzMH0.P7uo9bIGeTxzJZNBtGIe23zeLcKNS8Qfzs-En6mssjc','2022-09-27 00:08:51'),(8,'2022-09-17 11:08:19',7,NULL,'2022-09-17 11:08:19',NULL,'eyJhbGciOiJIUzI1NiJ9.eyJ0aWVuIjp7InBhc3N3b3JkIjoiJDJhJDEwJEZsM2dmSENqdXNcL3dzQjJjREpodld1RWxSTmJtQ1NjRFFMeExmd3Eua0h0T0RMU1BBRnpZdSIsInVzZXJJZCI6NywiYXV0aG9yaXRpZXMiOltdLCJ1c2VybmFtZSI6bnVsbH0sImV4cCI6MTY2NDI1MTY5OX0.bYuA2N_K6ShlSKpyflKrYI3yH8HMnmxV9R6R3alnuzc','2022-09-27 11:08:19'),(9,'2022-09-17 11:41:34',8,NULL,'2022-09-17 11:41:34',NULL,'eyJhbGciOiJIUzI1NiJ9.eyJ0aWVuIjp7InBhc3N3b3JkIjoiJDJhJDEwJE5VSW9OS3BLQ29KSW5CUzZpdGEuRy50WkE1ekk3eEJkWDcwakFiYTFPdFFPbGQyVTZ6djltIiwidXNlcklkIjo4LCJhdXRob3JpdGllcyI6WyJBRE1JTiIsIlVTRVJfUkVBRCJdLCJ1c2VybmFtZSI6ImFuaHRodSJ9LCJleHAiOjE2NjQyNTM2OTN9.gzHVPjuZIxCGlqAqmYXcs7vWkJNOHugv-1HXQi3Wg1s','2022-09-27 11:41:34');
/*!40000 ALTER TABLE `t_token` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-17 12:01:15