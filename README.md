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
| 6  | Parámetros Correctos, descuento por antelación y mayoría de edad|   Resultado correcto |   
3) Casos de pruebas

| Número  | Clase de equivalencia  |   Prueba |  Resultado| 
| --- | --- |---|---|
| 1  | Parámetros Inválidos |   (-1546666666666666666666666666666666666,2,-1) |   ExcepcionParametrosInvalidos   |
| 2  | Parámetros Correctos y descuento por antelación|   (666, 21, 30) |  566.1    |   
| 3  | Parámetros Correctos y descuento por menor de edad|   (1000, 12, 4) |  950|   
| 4  | Parámetros Correctos y descuento por mayoría de edad|   (10000, 13,69) |  9200 |    
| 5  | Parámetros Correctos, descuento por antelación y menor de edad|  (5000, 24, 10) |4000 |  
| 6  | Parámetros Correctos, descuento por antelación y mayoría de edad|  (2000, 25, 77) | 1540   |

4) Limites de equivalencia

| Número  | Clase de equivalencia |   Limites |
| --- | --- |---|
| 1  | Parámetros Inválidos |   ...(1,0,0) | 
| 2  | Parámetros Correctos y descuento por antelación|   (1,21,18)  (1,21,65) |  
| 3  | Parámetros Correctos y descuento por menor de edad|  (1,0,0)  (1,20,17) |  
| 4  | Parámetros Correctos y descuento por mayoría de edad|   (1,0,66)... |   
| 5  | Parámetros Correctos, descuento por antelación y menor de edad| (1,21,0)  (1,21,17)  |  
| 6  | Parámetros Correctos, descuento por antelación y mayoría de edad|  (1,21,66)...  |

5) Casos de prueba especificos

| Número  | Clase de equivalencia |   Limites |
| --- | --- |---|
| 1  | Parámetros Inválidos |   (1,0,0) (-1546666666666666666666666666666666666,2,-1)| 
| 2  | Parámetros Correctos y descuento por antelación|   (1,21,18)  (1,21,65)  (666, 21, 30)|  
| 3  | Parámetros Correctos y descuento por menor de edad|  (1,0,0)  (1,20,17)  (1000, 12, 4) |  
| 4  | Parámetros Correctos y descuento por mayoría de edad|   (1,0,66) (10000, 13,69) |   
| 5  | Parámetros Correctos, descuento por antelación y menor de edad| (1,21,0)  (1,21,17)  (5000, 24, 10) |  
| 6  | Parámetros Correctos, descuento por antelación y mayoría de edad|  (1,21,66) (2000, 25, 77) |

