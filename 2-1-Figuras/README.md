# 1) Pensar cuáles son las relaciones entre Figura, Circulo, Cuadrado y Rectangulo. ¿Figura debe ser una clase, una clase abstracta o una interfaz?

Figura debe ser una clase abstracta, ya que no tiene sentido crear una instancia de Figura directamente, pero sí es útil tener una clase base que defina métodos comunes para las figuras geométricas. Las clases Circulo, Cuadrado y Rectangulo pueden heredar de Figura y proporcionar implementaciones específicas para los métodos definidos en la clase abstracta.d

Una clase abstracta es una clase que no se puede instanciar y que puede contener métodos abstractos (métodos sin implementación) que deben ser implementados por las clases derivadas. En este caso, Figura podría tener métodos abstractos como calcularArea() y calcularPerimetro(), que serían implementados por Circulo, Cuadrado y Rectangulo de acuerdo a sus características específicas.

# 2) ¿Dónde hay comportamiento polimórfico? ¿De qué tipo es?

El comportamiento polimórfico se encuentra en como las clases derivadas como Triángulo, Cuadrado y Rectángulo implementan los métodos definidos en la clase abstracta Figura. El tipo de polimorfismo que se está utilizando aquí es el polimorfismo de inclusión, donde una referencia de tipo Figura puede apuntar a objetos de tipo Circulo, Cuadrado o Rectangulo. Esto permite que se puedan llamar a los métodos calcularArea() y calcularPerimetro() en una referencia de tipo Figura, y la implementación específica del método se determinará en tiempo de ejecución según el tipo real del objeto al que se está apuntando.

# 3) Hacer el diagrama de clases UML para este ejercicio.

```plaintext
+------------------+
|     Figura       |
+------------------+
| - calcularArea() |
| - calcularPerimetro() |
+------------------+
            ^               
            |
+------------------+     +------------------+     +------------------+
|     Circulo      |     |    Cuadrado      |     |   Rectangulo     |
+------------------+     +------------------+     +------------------+
| - calcularArea() |     | - calcularArea() |     | - calcularArea() |
| - calcularPe..() |     | - calcularPe..() |     | - calcularPe..() |
+------------------+     +------------------+     +------------------

```

En este diagrama de clases UML, Figura es una clase abstracta que define los métodos calcularArea() y calcularPerimetro(). Las clases Circulo, Cuadrado y Rectangulo heredan de Figura e implementan estos métodos de acuerdo a sus características específicas.

# 4) Implementar el código en Java para este ejercicio.

```java
abstract class Figura {
    double area();
}

class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}

class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

```