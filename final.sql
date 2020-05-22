-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Май 22 2020 г., 21:10
-- Версия сервера: 10.4.11-MariaDB
-- Версия PHP: 7.3.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `final`
--

-- --------------------------------------------------------

--
-- Структура таблицы `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `rating` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `rating`) VALUES
(1, 'Портрет Дориана Грея', 'Оскар Уайлд', 'хорошая книга'),
(2, 'Кладбище Домашних Животных', 'Стивен Кинг', 'ужасы'),
(3, 'Игра Престолов', 'Джордж Мартин', 'Фантастика'),
(4, 'Автостопом по Галактике', 'Дуглас Адамс', 'Фэнтези'),
(5, 'Хоббит', 'Толкин', 'Фантастика'),
(6, 'Таинственный Противник ', 'Агата Кристи', 'Детектив'),
(7, 'Продавец Обуви', 'Фил Найт', 'Биография'),
(8, 'Стальной Алхимик', 'Аракава', 'Манга'),
(9, 'Бэтмен', 'Дж Лоэб', 'Комикс'),
(10, 'Человек Паук Мировой уровень', 'Д Слотт', 'Комикс'),
(11, 'Флэш Книга 1', 'Ф Манапул', 'Комикс'),
(12, 'Джек Лондон', 'Мартин Иден', 'Роман'),
(13, 'Ночь в Лиссабоне ', 'Эрих Мария Ремарк', 'Роман'),
(14, 'Дневник Памяти', 'Николас Спаркс', 'Роман'),
(15, 'Атака Титанов', 'Исаяма', 'Манга'),
(16, 'Не Тупи', 'Д Синсеро', 'Психология'),
(17, 'Тонкое искусство Пофигизма ', 'Марк Мэнсон', 'Психология'),
(19, 'Злая книга', 'Магнус Мист', 'Детская Литература');

-- --------------------------------------------------------

--
-- Структура таблицы `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `login` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `clients`
--

INSERT INTO `clients` (`id`, `name`, `surname`, `login`, `password`, `email`) VALUES
(1, 'ars', 'ars', 'ars', 'ars', 'ars'),
(2, 'Arsen', 'Arsen', 'Arsennnn', '123123', 'arsen@gmail.com'),
(4, '4pop', '4pop', '4pop', '4pop', '4pop@gmail.com'),
(5, '5pop', '5pop', '5pop', '5pop', '5pop'),
(10, 'Arsen', 'Duisen', 'arsJava', '246810', 'arsen@gmail.com'),
(11, 'Amir', 'Slanbek', 'Avangar', '55555', 'amir@gmail.com'),
(12, 'Tony', 'Stark', 'JARVIS', 'kazakh', 'stark@gmail.com'),
(14, 'Гарри', 'Поттер', 'змея', 'кристраж', 'potter@gmail.com');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT для таблицы `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
