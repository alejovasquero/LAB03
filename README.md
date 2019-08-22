# LAB03
LABORATORIO 3 - PRUEBAS
# Nombres
- David Vasquez
- Daniel Walteros

## Solución documento calculoTarifa(...)
1) Excepciones
~~~
/**
calcular la tarifa de cada billete según el trayecto, la antelación
en la que se obtiene el billete y la edad del pasajero, de acuerdo
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos [La tarifa no puede ser negativa, los dias no pueden ser negativos, La edad no puede ser negativa]
**/
public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
~~~
2) Clases de equivalencia

| Número  | Clase de equivalencia (en lenguaje natural o matemático) |   Resultado correcto /incorrecto. |   
| --- | --- |---|
| 1  | Parámetros Inválidos |   Resultado incorrecto. |   
| 2  | Parámetros Correctos y descuento por antelación|   Resultado correcto |   
| 3  | Parámetros Correctos y descuento por menor de edad|   Resultado correcto |   
| 4  | Parámetros Correctos y descuento por mayoría de edad|   Resultado correcto |   
| 5  | Parámetros Correctos, descuento por antelación y menor de edad|   Resultado correcto |   
| 6  | Parámetros Correctos, descuto por antelación y mayoría de edad|   Resultado correcto |   
