-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-09-2018 a las 07:35:56
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `periodicodb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `publicaciones`
--

CREATE TABLE `publicaciones` (
  `id` int(11) NOT NULL COMMENT 'id unico de la publicacion',
  `titulo` varchar(255) COLLATE utf8_spanish_ci NOT NULL COMMENT 'Titulo de la publicacion',
  `contenido` text COLLATE utf8_spanish_ci NOT NULL COMMENT 'Contiene el texto completo de la publicacion',
  `link_imagen` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL COMMENT 'imagen para el background de la publicacion',
  `fecha_publicacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha de publicacion',
  `link` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL COMMENT 'Link para mas informacion (si existe)',
  `precio` float DEFAULT NULL COMMENT 'En caso de ser evento es posible que tenga precio',
  `tipo_publicacion` int(11) NOT NULL COMMENT 'FK al tipo de publicacion'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `publicaciones`
--

INSERT INTO `publicaciones` (`id`, `titulo`, `contenido`, `link_imagen`, `fecha_publicacion`, `link`, `precio`, `tipo_publicacion`) VALUES
(2, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry', 'editad 33', 'https://www.jqueryscript.net/images/Universal-Placeholder-Text-Lorem-Ipsum-Generator-getlorem.jpg', '2018-09-18 05:00:00', '', NULL, 1),
(4, 'Lorem Ipsum is simply dummy text of tesetting industry', 'sdsdsdsd 33', 'https://www.jqueryscript.net/images/Universal-Placeholder-Text-Lorem-Ipsum-Generator-getlorem.jpg', '2018-09-18 05:00:00', '', NULL, 1),
(5, 'Lorem Ipsum is simply dummy text of tesetting industry', 'sdsdsd dsdsdsdsdsdsd', 'https://www.jqueryscript.net/images/Universal-Placeholder-Text-Lorem-Ipsum-Generator-getlorem.jpg', '2018-09-18 05:00:00', 'ssssssssss', NULL, 1),
(6, 'dasd', 'das', 'dasd', '2018-09-19 05:00:00', 'dasd', 23, 2),
(7, 'sad', 'dasd', 'sad', '2018-09-19 05:00:00', 'asdas', 33, 2),
(8, 'dsdsdsd', 'dsds', 'dsdsd', '2018-09-19 05:00:00', 'dsds', 3323, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_publicacion`
--

CREATE TABLE `tipo_publicacion` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_publicacion`
--

INSERT INTO `tipo_publicacion` (`id`, `descripcion`) VALUES
(1, 'Noticia'),
(2, 'Evento'),
(3, 'Publicidad');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `publicaciones`
--
ALTER TABLE `publicaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_publicacion`
--
ALTER TABLE `tipo_publicacion`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `publicaciones`
--
ALTER TABLE `publicaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id unico de la publicacion', AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tipo_publicacion`
--
ALTER TABLE `tipo_publicacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
