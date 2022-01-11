# Дисциплина: Технологии разработки программного обеспечения
## Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных
- Разработчик: Инюткина А.С.
- Группа: МБД 2131
- Цель лаб.работы: Знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).
### Гайд, как и что сделать, чтобы сделать сборку запуск приложения
1. Клонирование проекта с гита
`git clone https://github.com/AlpheccaV/simpleapi/`

#### Запуск приложения (команды вводить в командной строке)
2.1 Сборка приложения
`mvn package`

2.2 Сборка Docker образа
`docker build . -t simpleapi:latest`

2.3 Запуск Docker контейнеров и заполнение базы данных
`docker run -e POSTGRES_PASSWORD=postgres -p 5432:5432 postgres`
Выполнить скрипт, расположенный по адресу ./src/main/resources/table.sql
`docker run -p 8080:8080 simpleapi:latest`

#### curl для обращения к ендпоинту, возвращающему hostname

- Проверка статуса работы
`GET` `http://localhost:8080/api/v1/status`

#### curl для обращения к ендпоинтам приложения
- Получение строк из базы данных
`GET` `http://localhost:8080/api/v1/product`
`GET` `http://localhost:8080/api/v1/product/*insert id*`

- Запись в базу данных
`POST` `http://localhost:8080/api/v1/product/`
JSON для отправки: `	{
"name": "Мицелярка",
"brand": "Avene",
"type": "Cleansing",
"price": 2000
}`

- Удаление записи из базы данных по известному id
`DELETE` `http://localhost:8080/api/v1/product/*insert id*`

- Изменение данных в базе данных
`PUT` `http://localhost:8080/api/v1/product/*insert id*`
JSON для отправки: `	{
  "name": "Мицелярка",
  "brand": "Avene",
  "type": "Cleansing",
  "price": 2000
  }`