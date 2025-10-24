package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entites.CarRental;
import model.entites.Vehicle;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		
		
		sc.close();
	}

}
