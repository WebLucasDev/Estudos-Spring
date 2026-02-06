package com.devsuperior.exercicio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ExercicioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}
}
