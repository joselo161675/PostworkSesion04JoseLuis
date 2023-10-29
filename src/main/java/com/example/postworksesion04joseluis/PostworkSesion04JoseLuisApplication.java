package com.example.postworksesion04joseluis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.postworksesion04joseluis.Model.Persona;

import org.springframework.boot.CommandLineRunner;

import java.util.Scanner;

@SpringBootApplication
public class PostworkSesion04JoseLuisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PostworkSesion04JoseLuisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = reader.nextLine();

        System.out.println("Introduce el teléfono: ");
        String telefono = reader.nextLine();

        Persona persona = new Persona(nombre, telefono);

        System.out.println(persona);
    }
}






