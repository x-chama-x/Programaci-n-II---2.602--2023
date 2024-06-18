PARCIAL 2022 JAVA

![ej](https://github.com/x-chama-x/Parcial2022-EfectoInvernadero/assets/67705754/eb0cbc5c-719a-441a-b4f9-e4219cfd13ce)

Diagrama UML:

![Untitled](https://github.com/x-chama-x/Parcial2022-EfectoInvernadero/assets/67705754/51c31b6c-8aa0-4d21-b87f-58c8bdc59cf0)

UML FINAL:

![Untitled](https://github.com/x-chama-x/Parcial2022-EfectoInvernadero/assets/67705754/a87651a8-0e89-4bc6-a4a1-f3115721adfa)

### La clase `Area` la estoy definiendo como abstracta por las siguientes razones:

1. **No se espera instanciar objetos de la clase Area directamente**: `Area` representa un concepto genérico de área, pero en el problema siempre vamos a necesitar áreas de un tipo específico (gélida, tundra, etc.). Entonces no tiene sentido crear instancias de `Area`, solo de sus subclases concretas.
2. **Define comportamiento común a través de la interfaz AreaEnPeligro**: Al implementar la interfaz `AreaEnPeligro`, se establece que todas las clases de áreas ahora deben definir el método `enPeligro()`. Esto permite definir una "plantilla" de comportamiento común (determinar si el área está en peligro), donde cada subclase implementa la lógica particular.
3. **Permite trabajar polimórficamente con las subclases**: Al tener una referencia de tipo `Area` se pueden manejar en forma conjunta instancias de `AreaGelida`, `AreaTundra`, etc. Esto simplifica el código que las utiliza.
4. **Favorece el principio de sustitución de Liskov**: las subclases son siempre un "tipo de" la superclase. Cualquier subclase puede sustituir a una instancia de `Area` sin afectar el funcionamiento del sistema.

### Ventaja de usar una interface para el método abstracto

- Se aplica el principio de programación a interfaces, se desacopla la interfaz de la implementación y se permite polimorfismo.
- La ventaja es que si en un futuro se necesitan clases que no hereden de `Area` pero si necesiten implementar `enPeligro()`, se puede hacer implementando la interface `AreaEnPeligro`.
