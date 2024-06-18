# EmpresaTransporte-parcial

### ENUNCIADO IA

Una empresa de transporte de carga y pasajeros nos ha solicitado el diseño e implementación de un prototipo de sistema para el manejo de sus operaciones.

La empresa cuenta con diferentes tipos de vehículos, los cuales se dividen en dos categorías principales: vehículos de carga y vehículos de pasajeros.

De los vehículos de carga se conoce su placa, capacidad de carga en toneladas, marca y modelo. Estos vehículos pueden transportar diferentes tipos de mercancía, de las cuales se conoce su descripción, peso en toneladas y si es considerada peligrosa o no.

Por otro lado, los vehículos de pasajeros tienen placa, cantidad de asientos, marca y modelo. Estos vehículos transportan pasajeros, de los cuales se conoce su nombre, DNI y si son o no menores de edad.

Todos los vehículos deben poder informar su manifiesto, el cual contiene la placa del vehículo, la cantidad de unidades transportadas (ya sea de mercancía o pasajeros) y el peso total transportado.

Adicionalmente, la empresa requiere las siguientes funcionalidades:

1. Implementar un método que permita asignar una mercancía o un pasajero a un vehículo, validando que el vehículo cuente con la capacidad suficiente para transportarlo.
2. Implementar un método que permita obtener un listado de todos los vehículos que han transportado mercancía peligrosa.
3. Implementar un método que permita obtener un informe con la cantidad total de pasajeros transportados y la cantidad total de toneladas de mercancía transportada.

UML

![image](https://github.com/x-chama-x/Programacion-II-2.602-2023/assets/67705754/624e973e-9436-489f-b3c6-775ee020f023)


Anotaciones:
Realicé 2 interfaces ya que manejan distintos tipos datos en cada clase Hija de Vehiculo como en DeCarga que  maneja double y Mercancia.

Tuve que hacer que las clases hijas de la clase abstracta Vehiculo implementen directamente las interfaces genéricas para poder especificar el tipo concreto que reemplazará a T , sino tenía inconvenientes en la clase abstracta Vehiculo sin poder especificar el tipo.
