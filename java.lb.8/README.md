# Лабораторна робота 8

## Опис проекту

Програма використовує відкрите API для прогнозу погоди, конкретно - Open-Meteo API. Для виконання аналізу температури та об'єму опадів були реалізовані дві окремі компоненти - класи TemperatureAnalysis та PrecipitationAnalysis. Кожен з цих класів взаємодіє з API через HTTP-запити


### Клас Temperature

Цей додаток на Java використовує Open-Meteo API для аналізу історичних даних опадів для конкретного місця. Клас PrecipitationAnalysis, реалізований як Runnable, витягує дані з API і обробляє їх для виявлення закономірностей, пов'язаних з послідовними дощовими днями.
Особливості
Витягує історичні дані опадів з Open-Meteo API.
Визначає та виводить інформацію про послідовні дощові дні.
Показує топ-10 днів з найвищими опадами.
Використання
Щоб скористатися цим додатком, слід виконати наступні кроки:
Переконайтеся, що на вашій системі встановлено Java.
Запустіть клас PrecipitationAnalysis, який отримає та обробить дані опадів.
Перегляньте результати аналізу, включаючи інформацію про послідовні дощові дні та топ-10 днів з найвищими опадами.
### Клас Weather
Цей Java додаток розроблено для виконання аналізу температурних показників, використовуючи потоки для паралельного виконання завдань. Головний клас WeatherAnalysis створює та запускає потік для аналізу температури, представлений класом TemperatureAnalysis. Усі дані про температуру зберігаються та порівнюються за допомогою класу DataEntry.
Використання
Для запуску аналізу температури виконайте наступні кроки:

Запустіть клас WeatherAnalysis з вашого додатку Java.
Програма автоматично створить та запустить потік для аналізу температурних даних.
Очікуйте завершення аналізу.

### Клас Precipitation
Цей Java додаток призначено для аналізу історичних даних опадів за допомогою Open-Meteo API. Клас PrecipitationAnalysis, що реалізує інтерфейс Runnable, використовує HTTP-запити для отримання та обробки інформації про опади, яка подається у вигляді JSON. Результати аналізу виводяться у зручному форматі.
Використання
Для використання додатку виконайте наступні кроки:

Запустіть клас PrecipitationAnalysis.
Програма автоматично виконає HTTP-запит до Open-Meteo API та обробить отримані дані.




## Тестування
Для запуску тестів використовуйте інструкцію в розділі "Тести" у README.

## Висновки 
У цьому репозитарії представлено три різнобічних додатки для аналізу погоди, які можна використовувати як відмінні вихідні точки для вивчення Open-Meteo API та аналізу метеорологічних даних. Кожен із додатків спроектовано для різноманітних завдань та може бути адаптований під індивідуальні потреби користувача.

