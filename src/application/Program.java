package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Digite o nome do departamento : ");
		String departamentName = sc.nextLine();
		
		System.out.print("Digite os dados do Trabalhador : ");
		System.out.print("nome : ");
		String workerName = sc.nextLine();
		System.out.print("Lever : ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario Base : ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		System.out.print("Qual o numero de contrato do trablhador : ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i <= n ; i++) {
			System.out.print("Digite os dados do contrato " +i +" : ");
			System.out.print("Digite a data DD/MM/YYYY : ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora : ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		System.out.println();
		System.out.print("Digite mes e ano para informações salariais (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
