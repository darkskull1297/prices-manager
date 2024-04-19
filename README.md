
# Price Manager

Este microservicio sera utilizado para la gestion de precios de productos y sus diversas tarifas dependiendo de la fecha y hora de aplicacion.

Se utilizó Java 17, Spring Boot 3, JPA, H2, JUnit 5, Cucumber y Gherkins para la creación de un API con 1 Endpoint descritos en la seccion API Reference.
Ademas fue utilizado Arquitectura hexagonal para la organización del micro servicio contando de la capa de applicacion, encargada de alojar lo referente a services y casos de uso, en definicitva lo que a logica de negocio se refiere. Continuada por la capa Domain, encargada de contener todas las interfaces llamadas puertos de entrada y salida, ademas de los modelos.
Para finalizar con la capa de infraestructura encargada de contener los repositorios, las entities, mappers y controladores, ademas de algun adapatador o todo lo referente a conexiones fuera del micro, es por ello que esta es la capa mas externa de esta Arquitectura.



## Running Tests

# ![check-code-coverage](https://img.shields.io/badge/code--coverage-11%25-brightgreen)

Los test unitarios se encuentran en la carpeta Test del proyecto, hay 5 que se encargan de probar de principio a fin la funcionalidad del endpoint solicitado en la prueba, los realice de esa manera para poder testear todo el recorrido desde la llamada a nuestro controller en la capa de infraestrutura y todo su recorrido por el pri¡oyecto hasta la cadap domian que es la mas interna. En la revision realice otros 2 test mas pequeños para probar solamente una funcion especifica del servicio con cada test. En total son 7 tests:

JUnit- getPriceByParametersResultListId1() :  petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA).
getPriceByParametersResultListId2(): petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
getPriceByParametersResultListId3(): petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
getPriceByParametersResultListId4(): petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
getPriceByParametersResultListId5(): petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
getPriceByParametersFail_EntityNotFoundException(): Se encarga de testear el proceso de solicitar un registro especifico de la BBDD, pero que no existe y deberia devolver una exception.

Test de CUCUMBER.- GetPriceByDateTest(): Se encarga de ejecutar un escenario de ejecucion con 5 ejemplos de datos de entrada.

Feature: Get price by Date, Product Id and Brand Id
In order to get a Price from the data base
Loading previously the data base using data on file: src/test/resources/import.sql

Scenario Outline: Send a request to get a price by Date, Product Id and Brand Id
When I send a request to get a Price by "<date>", Product Id 35455 and Brand Id 1
Then I verify the Price "<Id>" received
Examples:
| date                 | Id |
| 2020-06-14T10:00:00Z | 1  |
| 2020-06-14T16:00:00Z | 2  |
| 2020-06-14T21:00:00Z | 1  |
| 2020-06-15T10:00:00Z | 3  |
| 2020-06-16T21:00:00Z | 4  |

El test de integración esta en la carpeta Test del proyecto, en dicho test, se ejecutan basicamante 5 ejemplos escritos arriba. Fue elaborado con Gherkins y cucumber ya que a mi parecer puede ser muy util para los QA poder crear "Escenarios" de prueba que permitan seguir paso a paso la funcionalidad entera de un proceso que deba ejecutar nuestro microservicio.

To run tests, run the following command

```bash
  mvn test
```


## API Reference

#### Get album by ID
Se puede proceder a solicitar la información de los album por id, la cual se obtendra a traves de una llamada a una API externa.

```http
  GET http://localhost:8080/api/price?productId={productId}&brandId={brandId}&date={Date}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
|`productId`| `int`    | **Required**. Id of product to request. EJ: 35455 |
|`brandId`  | `int`    | **Required**. Id of brand of product. EJ: 1 |
|`Date`     | `String` | **Required**. Date and time what we want. EJ: 2020-06-16T21:00:00Z |

#### Swagger

```http
  GET http://localhost:8080/swagger-ui/index.html
```

#### Compilation

Para iniciar el proyecto es enecesario descargar el proyecto del repositorio especificado abajo, luego ejecutar el comando de abajo y ejecutar desde el IDE es suficiente para poder utilizar el endpoint.


GIT Repository:

https://github.com/darkskull1297/prices-manager.git


```bash
  mvn clean install
```
