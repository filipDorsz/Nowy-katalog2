package bmt;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj imię: ");
    String name = scanner.nextLine();

    System.out.print("Podaj wiek: ");
    int age = scanner.nextInt();

    scanner.nextLine(); // Odczyt zbędnej nowej linii

    System.out.print("Podaj ulicę: ");
    String street = scanner.nextLine(); //komentarzkdk

    System.out.print("Podaj miasto: ");
    String city = scanner.nextLine();

    System.out.print("Podaj kod pocztowy: ");
    String postalCode = scanner.nextLine();

    Person person = new Person(name, age);
    Address address = new Address(street, city, postalCode);

    System.out.println("Dane osoby:");
    System.out.println("Imię: " + person.getName());
    System.out.println("Wiek: " + person.getAge());

    System.out.println("Adres:");
    System.out.println("Ulica: " + address.getStreet());
    System.out.println("Miasto: " + address.getCity());
    System.out.println("Kod pocztowy: " + address.getPostalCode());

    scanner.close();
  }
}