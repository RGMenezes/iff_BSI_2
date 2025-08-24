package POO.Casa.Exercicio02.view;

import POO.Casa.Exercicio02.model.Bicicleta;
import POO.Casa.Exercicio02.model.Carro;
import POO.Casa.Exercicio02.model.Moto;

public class Main{
    public static void main(String[] args) {
        System.out.println("--- Teste da Classe Bicicleta ---");
        Bicicleta bicicleta = new Bicicleta(
            "Caloi", 
            2, 
            "MTB 21", 
            21, 
            true
        );
        System.out.println("Informações Iniciais da Bicicleta:");
        System.out.println(bicicleta.imprimirInformacoes());
        
        bicicleta.acelerar(10);
        System.out.println("\nBicicleta acelerou 10 km/h:");
        System.out.println(bicicleta.imprimirInformacoes());
        
        System.out.println("\n--- Teste da Classe Carro ---");
        Carro carro = new Carro(
            "Ford", 
            4, 
            "Fusion", 
            200.5, 
            4
        );
        System.out.println("Informações Iniciais do Carro:");
        System.out.println(carro.imprimirInformacoes());
        
        carro.acelerar(80);
        System.out.println("\nCarro acelerou 80 km/h:");
        System.out.println(carro.imprimirInformacoes());
        
        carro.desacelerar(20);
        System.out.println("\nCarro desacelerou 20 km/h:");
        System.out.println(carro.imprimirInformacoes());
        
        System.out.println("\n--- Teste da Classe Moto ---");
        Moto moto = new Moto(
            "Honda", 
            2, 
            "CB 500", 
            50.1, 
            true
        );
        System.out.println("Informações Iniciais da Moto:");
        System.out.println(moto.imprimirInformacoes());
        
        moto.acelerar(120);
        System.out.println("\nMoto acelerou 120 km/h:");
        System.out.println(moto.imprimirInformacoes());
        
        moto.desacelerar(50);
        System.out.println("\nMoto desacelerou 50 km/h:");
        System.out.println(moto.imprimirInformacoes());
    }
}