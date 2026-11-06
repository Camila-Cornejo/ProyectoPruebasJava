
Feature: Operaciones de calculadora
  Como usuario de la calculadora
  Quiero realizar operaciones matematicas basicas
  Para obtener resultados correctos

  Scenario: Sumar dos numeros
    Given que tengo una calculadora
    When sumo 5 y 3
    Then el resultado debe ser 8

  Scenario Outline: Restar dos numeros
    Given que tengo una calculadora
    When resto <numero1> y <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 5       | 3       | 2         |
      | 10      | 4       | 6         |
      | 5       | 8       | -3        |
      | 0       | 5       | -5        |
