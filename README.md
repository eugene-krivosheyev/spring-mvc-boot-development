Разработка REST API на Spring MVC + Boot
========================================
18 ак. ч., 6 дней.

Prerequisites
-------------
- [ ] Installed JDK8
- [ ] Installed IntelliJ IDEA Community of Ultimate (preferred)
- [ ] Installed Tomcat


Современный гибкий и тестопригодный дизайн
==========================================
- [ ] Пример процедурного legacy-кода и вопросы сопровождаемости
- [ ] Внутренняя модель качества
- [ ] OOAD как ответ на запрос бизнеса
- [ ] Инкапсуляция
- [ ] Слои
- [ ] Полиморфизм и абстракции
- [ ] Зависимости компонентов: порождающие шаблоны
- [ ] Spring-ready архитектура


Ключевые концепции [Spring Core](https://docs.spring.io/spring-framework/docs/current/reference/html)
================================
- [ ] [Понятие фреймворка](https://www.programcreek.com/2011/09/what-is-the-difference-between-a-java-library-and-a-framework/) и [контейнера](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-basics)
- [ ] Разрешение зависимостей компонентов через [DI](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-collaborators)
- [ ] Понятие [конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-metadata) и [контекста](https://spring.io/understanding/application-context)
- [ ] Spring Core как [AOP](https://en.wikipedia.org/wiki/Aspect-oriented_programming) framework [implementation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-introduction-defn)
- [ ] Обзор [модулей Spring](https://docs.spring.io/spring-framework/docs/5.0.0.RC3/spring-framework-reference/overview.html#overview-modules)


Practice Iteration
==================
Given
-----
- [ ] Demo application
- [ ] Обзор maven-[зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.html#dependency-management)
- [ ] Настроен максимальный уровень журналирования

When
----
- [ ] Консольным Spring Core приложением реализованы требования
- `Я, как анонимный банковский сотрудник, хочу создать банковский счет, чтобы он сохранился в системе для дальнейших операций`
- `Я, как анонимный банковский сотрудник, хочу узнать состояние банковского счета по его id, чтобы сообщить клиенту`
- `Я, как анонимный банковский сотрудник, хочу просмотреть все сохраненные счета, чтобы узнать нужный id для дальнейших операций`
- [ ] Проведены полная очистка проекта и сборка в maven

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


Конфигурация Spring-приложения
==============================
- [ ] Структура конфигурации:
- [XML-based configuration](https://docs.spring.io/spring-framework/docs/4.3.x/spring-framework-reference/html/xsd-configuration.html)
- [Groovy](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#groovy-bean-definition-dsl) 
- [Annotation-based configuration](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-annotation-config) including JSR 330 and JSR 250 annotations 
- [Java-based configuration](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java) и [комбинация с xml](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java-combining)

- [ ] Декларация компонентов 
- в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-definition)
- в [annotation-based](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-classpath-scanning)
- в [java-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java-bean-annotation)

- [ ] Инстациирование компонентов в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-class)

- [ ] Управление жизненным циклом компонентов: магия 
- [scoped proxies](https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html) 
- [lazy-resolution proxy](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html)

- [ ] Управление жизненным циклом компонентов: scope
- в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes) 
- в [annotation-based](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-scanning-scope-resolver) и [расширенные scopes](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes-other)
- в [java-конфигурации](https://www.baeldung.com/spring-bean-scopes)

- [ ] Управление жизненным циклом компонентов: laziness
- в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lazy-init)
- в [annotation-based](https://www.baeldung.com/spring-lazy-annotation#2-with-autowired)
- в [java-конфигурации](https://www.baeldung.com/spring-lazy-annotation)

- [ ] [Внедрение зависимостей](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-dependencies)
- в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-some-examples), включая [xml autowiring](http://websystique.com/spring/spring-beans-auto-wiring-example-using-xml-configuration/)
- в [annotation-based](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-required-annotation)
- в [java-конфигурации](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java-dependencies)  

- [ ] [Внедрение значений](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-value-annotations) 
- в [xml-конфигурации](https://docs.spring.io/spring-framework/docs/4.0.x/spring-framework-reference/html/xsd-config.html)
- в [annotation-based](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-value-annotations)
- в [java-конфигурации](https://zetcode.com/spring/propertysource/)

- [ ] Вычисления при инициализации контекста на [SpEL](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-beandef)
- [ ] [Профили](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-definition-profiles) конфигурации
- [ ] Расширения модели annotation-based configuration 
- Аннотации [JSR 330](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-standard-annotations)
- Аннотации [JSR 250](https://docs.spring.io/spring-framework/docs/3.0.0.RC3/spring-framework-reference/html/ch03s09.html): [ресурсы](https://www.baeldung.com/spring-annotations-resource-inject-autowire) и [обработчики @PostConstruct и @PreDestroy](https://www.baeldung.com/spring-postconstruct-predestroy)

- [ ] [Событийная модель](https://www.baeldung.com/spring-events) в Spring и [встроенные события](https://www.baeldung.com/spring-context-events)
- [ ] [Обзор AOP](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop) и Spring [proxies](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-proxying)
- Управление безопасностью
- Управление транзакциями
- Управление повторами операций (ретраинг)
- Управление асинхронностью
- Управление кешированием
  
<details>
<summary>Reference: Corner Cases for Bean declaration and initialization</summary>

Type Switching anti-pattern
---------------------------
- [ ] [@Primary](https://www.baeldung.com/spring-primary)
- [ ] [@Qualifier("id")](https://www.baeldung.com/spring-qualifier-annotation)

Declaration
-----------
- [ ] Два бина с одинаковым id в одной секции beans: ошибка инициалиазации контекста
- [ ] Два бина с одинаковым id в разных секциях beans (два xml или профили в одном xml): последний заданный overrides первый
- [ ] Бин, заданный в xml без id, ищется только по типу
- [ ] Бин, заданный в xml без id, не инъектируется через @Autowired. Надо ref в xml
- [ ] Бин, заданный как @Component, автоматом получает id. @Component("newId") overrides дефолтный id
- [ ] Бин с дублирующимся id, определенный в xml, overrides бин, заданный как @Component
- [ ] Бин с дублирующимся id, определенный в @Configuration, overrides бин, заданный как @Component
- [ ] Бин с дублирующимся id, определенный в @Configuration и xml: берется из xml, skipping определение из @Configuration
- [ ] Бин с дублирующимся id, определенный в @Configuration, xml и как @Component: берется из xml, skipping определение из @Configuration

Initialization
--------------
- [ ] Eager service1 depending on eager service2
```
23:25:10.331 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:25:10.346 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
```

- [ ] Lazy service1 depending on eager service2
```
23:26:00.941 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
23:26:00.966 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
Got service1
Result of service1's operation call: 84
```

- [ ] Eager service1 depending on lazy service2
```
23:26:51.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:26:51.524 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
```

- [ ] Lazy service1 depending on lazy service2
```
......context loaded and prepared......
Getting service1
23:27:41.133 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:27:41.146 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
Got service1
Result of service1's operation call: 84
```

Scopes
------
- [ ] Singleton service1 depending on singleton service2
```
23:45:54.740 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
S1 object constructor
23:45:54.773 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
S2 object constructor
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```

- [ ] Singleton service1 depending on prototype service2
```
S1 object constructor
S2 object constructor
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```

- [ ] Prototype service1 depending on singleton service2
```
23:47:43.826 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
S2 object constructor
......context loaded and prepared......
Getting service1
S1 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
S1 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```

- [ ] Prototype service1 depending on Prototype service2
```
......context loaded and prepared......
Getting service1
S1 object constructor
S2 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
S1 object constructor
S2 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```

</details>


Practice Iteration
==================
Given
-----
- [ ] Demo application
- [ ] Консольное Spring-приложение

When
----
- [ ] Консольным Spring Core приложением реализованы требования
- `Я, как администратор, хочу вынести в конфигурацию размер страницы вывода`
- `Я, как анонимный банковский сотрудник, хочу просмотреть все сохраненные счета c первой страницы вывода, чтобы узнать нужный id`
- `Я, как анонимный банковский сотрудник, хочу видеть в консольном журнале все события создания счетов`
- `Я, как анонимный банковский сотрудник, хочу видеть в консольном журнале все события запроса счетов`
- `Я, как администратор, хочу видеть порядок создания компонентов`
- `Я, как администратор, хочу видеть конкретное имя класса всех управляемых компонентов в журнале`

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


Введение в протокол HTTP и JavaEE/JakartaEE web-приложения
==========================================================
[HTTP](https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)
------
- [ ] [Протокол HTTP](https://httpbin.org)
- Методы запросов
- Параметры и аргументы запросов
- Заголовки
- Статусы ответов
- Cookies

JavaEE/JakartaEE
----------------
- [ ] Web/Servlet-контейнеры
- [ ] Компоненты веб-приложения
- [ ] Управляемые объекты
- [ ] Структура JavaEE web-приложений

Spring MVC
----------
- [ ] Архитектура [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc) и ее редукция для REST API
- [ ] [Конфигурация](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-config)
- [ ] [Контроллеры](ttps://spring.io/guides/gs/rest-service)
- Меппинги на URL
- Параметры в URL
- [ ] JSON де/сериализация объектов
- [JSON Mapper](https://www.baeldung.com/jackson)
- [Basic mapping annotations](https://www.baeldung.com/jackson-annotations)
- [ ] [Обработка и афиширование ошибок](https://www.baeldung.com/exception-handling-for-rest-with-spring)


Practice Iteration
==================
Given
-----
- [ ] Демо протокола HTTP
- [ ] Демо web-контейнера Tomcat
- [ ] Сборка и развертывание демо-приложения на web-контейнере
- [ ] Отладка HTTP-запросов и ответов в REST-клиенте в IDEA 

When
----
- [ ] Реализован HTTP API к существующим операциям
- [ ] Приложение собрано как war 
- [ ] Приложение вручную развернуто на Tomcat 
- [ ] HTTP API протестирован в REST-клиенте IDEA

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


Концепция REST API и Spring RESTful Services
============================================
- [ ] Сравнение RPC и REST
- [ ] [Принципы проектирования REST API](https://stackoverflow.blog/2020/03/02/best-practices-for-rest-api-design/)
- [ ] [Идемпотентность и безопасность операций HTTP](https://www.mscharhag.com/api-design/http-idempotent-safe)
- [ ] [API Design Patterns](https://www.mscharhag.com/p/rest-api-design)
- [ ] Ограничения REST API и [GraphQL](https://graphql.org)


Practice Iteration
==================
Given
-----
- [ ] Реализованный HTTP API

When
----
- [ ] Произведен рефакторинг API в соответствии с архитектурой REST
- [ ] Реализованы требования
- `Я, как администратор, хочу легко переключать профили конфигурации приложения`
- [ ] REST API протестирован в REST-клиенте IDEA

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


[Spring Boot](https://spring.io/projects/spring-boot)
=============
- [ ] [Задачи Boot](http://spring-projects.ru/projects/spring-boot/)
- авто-конфигурация типовых компонентов
- вывод конфигурационных данных в простой конфиг
- авто-конфигурация подключаемых повторно используемых модулей (starters) с кодом и конфигурацией
- транзитивные зависимости модулей 
- CLI для разработки и тестирования

CLI Boot Applications
---------------------
- [ ] [Подключение Boot в проект](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started.first-application.dependencies) и [настройка сборщика](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started.first-application.executable-jar)
- [ ] [Модули и их подключение](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using.build-systems.starters)
- [ ] [Структура приложения и точка входа](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using.structuring-your-code.locating-the-main-class)
- [ ] [Запуск boot-приложения](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using.using-the-springbootapplication-annotation)
- [ ] [Конфигурация Boot-приложения](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#features.external-config)
- [ ] [Конфигурационные профили](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#features.profiles)
- [пример с настройкой компонентов](https://www.baeldung.com/spring-boot-lazy-initialization#enable-lazy-initialization)
- [ ] Поддержка в IDEA

MVC Boot Applications
---------------------
- [ ] [Необходимые зависимости](https://spring.io/guides/gs/rest-service/)
- [ ] [Main class](https://spring.io/guides/tutorials/rest/)
- [ ] [Конфигурация](https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration) 


Practice Iteration
==================
Given
-----
- [ ] [Конструктор заготовок Spring Boot приложений](https://start.spring.io)
- [ ] Демо плагина анализа конфигурации в IDEA 
- [ ] Demo application
- [ ] Реализованный REST API

When
----
- [ ] Произведен рефакторинг миграции приложения на платформу Spring Boot
- [ ] Конфигурация проанализирована в специализированном плагине IDEA
- [ ] REST API протестирован в REST-клиенте IDEA

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


Доступ к данным
===============
- [ ] Понятие Connection Pool
- Подключение библиотеки
- Конфигурация
- [ ] Тестовые и production профили конфигурации источников данных
- [ ] Уровни работы с РСУБД
- Pure JDBC
- Spring JDBC Template
- JPA
- Spring Data JPA codegen
- [ ] Обзор JPA: core Entities annotations
- [ ] Версионирование и провиженинг схемы БД при изменениях структур данных при развитии приложения
- Подключение библиотеки
- Конфигурация


Practice Iteration
==================
Given
-----
- [ ] REST API
- [ ] Demo application
- [ ] Конфигурация Embedded Derby with file persistence
- [ ] Конфигурация Connection pool
- [ ] Конфигурация Provisioning library

When
----
- [ ] Произведен рефакторинг приложения на РСУБД для хранения данных  
- [ ] Реализовано версионирование схемы БД

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы


Production-ready REST API
=========================
- [ ] [Версионирование REST API](https://www.springboottutorial.com/spring-boot-versioning-for-rest-services)
- [ ] [Безопасность](https://spring.io/guides/topicals/spring-security-architecture/)
- [CORS](https://spring.io/guides/gs/rest-service-cors/)
- [CSRF](https://www.baeldung.com/spring-security-csrf)
- [Аутентификация](https://spring.io/guides/tutorials/spring-security-and-angular-js/) и провайдеры
- [Авторизация](https://www.marcobehler.com/guides/spring-security)
- [ ] [Документация на Swagger](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)
- [ ] [Валидация данных модели](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#validation-beanvalidation-overview)


Practice Iteration
==================
Given
-----
- [ ] Demo application
- [ ] REST API

When
----
- [ ] Произведен рефакторинг приложения до уровня production-ready
- [ ] API задокументирован на Swagger
- [ ] API протестирован в Swagger UI

Then
----
- [ ] Разобраны вопросы и трудности
- [ ] Проведен public code review
- [ ] Участники отвечают на вопросы
