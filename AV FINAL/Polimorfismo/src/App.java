import Entities.AreaTriangulo;
import Entities.AreaQuaERe;
import Entities.Area;

public class App {
    public static void main(String[] args) throws Exception {

        Area area1 = new AreaTriangulo(10, 10); // Area do Triângulo
        System.out.println(area1); // O triângulo tem área de: 50.0
        Area area2 = new AreaQuaERe(10, 10); // Area do Quadrado
        System.out.println(area2); // O Retângulo tem a area de: 100.0
        Area area3 = new AreaQuaERe(15, 10); // Area do Retângulo
        System.out.println(area3); // O Quadrado tem a area de: 150.0
    }
}

// A Classe AreaQuaERe e AreaTriangulo herdaram a classe Area
// A Classe AreaQuaERe e AreaTriangulo possui um método calcularArea que é herdado da classe Area
// O Polimorfismo é a capacidade de um objeto de assumir várias formas
// Com o Polimorfismo, podemos criar uma variável do tipo da superclasse e atribuir a ela um objeto de uma subclasse
// A variável da superclasse pode ser usada para chamar o método da subclasse
// O Polimorfismo é uma forma de reaproveitamento de código