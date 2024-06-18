PARCIAL 2022 JAVA

![image](https://github.com/x-chama-x/Programacion-II-2.602-2023/assets/67705754/4debc101-e2cd-4c78-9d11-4ad30153e8d9)


Diagrama UML:

![image](https://github.com/x-chama-x/Programacion-II-2.602-2023/assets/67705754/c99b3b84-8379-4a67-88af-4545c7f7b260)


UML FINAL:

![image](https://github.com/x-chama-x/Programacion-II-2.602-2023/assets/67705754/28d80218-7484-4568-b6e7-ce08eb86220d)


### La clase `Area` la estoy definiendo como abstracta por las siguientes razones:

1. **No se espera instanciar objetos de la clase Area directamente**: `Area` representa un concepto genérico de área, pero en el problema siempre vamos a necesitar áreas de un tipo específico (gélida, tundra, etc.). Entonces no tiene sentido crear instancias de `Area`, solo de sus subclases concretas.
2. **Define comportamiento común a través de la interfaz AreaEnPeligro**: Al implementar la interfaz `AreaEnPeligro`, se establece que todas las clases de áreas ahora deben definir el método `enPeligro()`. Esto permite definir una "plantilla" de comportamiento común (determinar si el área está en peligro), donde cada subclase implementa la lógica particular.
3. **Permite trabajar polimórficamente con las subclases**: Al tener una referencia de tipo `Area` se pueden manejar en forma conjunta instancias de `AreaGelida`, `AreaTundra`, etc. Esto simplifica el código que las utiliza.
4. **Favorece el principio de sustitución de Liskov**: las subclases son siempre un "tipo de" la superclase. Cualquier subclase puede sustituir a una instancia de `Area` sin afectar el funcionamiento del sistema.

### Ventaja de usar una interface para el método abstracto

- Se aplica el principio de programación a interfaces, se desacopla la interfaz de la implementación y se permite polimorfismo.
- La ventaja es que si en un futuro se necesitan clases que no hereden de `Area` pero si necesiten implementar `enPeligro()`, se puede hacer implementando la interface `AreaEnPeligro`.
