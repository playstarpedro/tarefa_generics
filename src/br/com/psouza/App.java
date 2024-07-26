package br.com.psouza;

import java.util.ArrayList;
import java.util.List;

public class App {

//    Criar uma lista de classes de carros;
//    Deverá receber qualquer tipo de carro dessa lista (classe abstrata e concreta);
//    "tarefa-generics"

    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<Car>();

        Toyota car1 = new Toyota("silver", 150l);
        Toyota car2 = new Toyota("white", 150l);
        Honda car3 = new Honda("black", 170l);
        Honda car4 = new Honda("blue", 170l);


        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        printCars(carsList);
    }

    public static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
