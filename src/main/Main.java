package main;

import classesobjects.Person;
import attributesmethods.Car;
import accessspecifiers.AccessSpecifierDemo;
import packagesdemo.PackageDemo;
import abstraction.Perro;
import encapsulation.EncapsulationDemo;
import interfacesdemo.Carro;
import overloading.OverloadingDemo;
import overriding.Hijo;
import enumsdemo.EnumsDemo;
import initializerblock.InitializerBlockDemo;
import passbyvalue.PassByValueDemo;
import exceptionhandling.ExceptionHandlingDemo;
import arrayvsarraylist.ArrayVsArrayListDemo;
import setdemo.SetDemo;
import typecasting.TypeCastingDemo;

public class Main {

    public static void main(String[] args) {

        // Classes and Objects
        System.out.println("===== Classes and Objects =====");
        Person person = new Person();
        person.name = "Karen";
        person.greet();

        // Attributes and Methods
        System.out.println("\n===== Attributes and Methods =====");
        Car car = new Car();
        car.displayBrand();

        // Access Specifiers
        System.out.println("\n===== Access Specifiers =====");
        AccessSpecifierDemo access = new AccessSpecifierDemo();
        System.out.println(access.publicField);
        access.displayPrivateField();

        // Packages
        System.out.println("\n===== Packages =====");
        PackageDemo packageDemo = new PackageDemo();
        packageDemo.showMessage();

        // Abstraction
        System.out.println("\n===== Abstraction =====");
        Perro perro = new Perro();
        perro.sonido();

        // Encapsulation
        System.out.println("\n===== Encapsulation =====");
        EncapsulationDemo encapsulation = new EncapsulationDemo();
        encapsulation.setNombre("Karen");
        System.out.println(encapsulation.getNombre());

        // Interfaces
        System.out.println("\n===== Interfaces =====");
        Carro carro = new Carro();
        carro.arrancar();

        // Method Overloading
        System.out.println("\n===== Method Overloading =====");
        OverloadingDemo overload = new OverloadingDemo();
        System.out.println(overload.sumar(5, 10));
        System.out.println(overload.sumar(5, 10, 15));

        // Method Overriding
        System.out.println("\n===== Method Overriding =====");
        Hijo hijo = new Hijo();
        hijo.mostrar();

        // Enums
        System.out.println("\n===== Enums =====");
        EnumsDemo enums = new EnumsDemo();
        enums.mostrar();

        // Initializer Block
        System.out.println("\n===== Initializer Block =====");
        new InitializerBlockDemo();

        // Las siguientes líneas pueden requerir ajuste
        // dependiendo de cómo hayas creado esas clases

        System.out.println("\n===== Pass By Value =====");
        PassByValueDemo pass = new PassByValueDemo();

        System.out.println("\n===== Exception Handling =====");
        ExceptionHandlingDemo exception = new ExceptionHandlingDemo();

        System.out.println("\n===== Array vs ArrayList =====");
        ArrayVsArrayListDemo arrayDemo = new ArrayVsArrayListDemo();

        System.out.println("\n===== Set =====");
        SetDemo setDemo = new SetDemo();

        System.out.println("\n===== Type Casting =====");
        TypeCastingDemo castingDemo = new TypeCastingDemo();
    }
}