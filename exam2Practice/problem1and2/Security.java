package problem1and2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Security {
	static String filename = "users.txt";
	public User[] users = new User[100];
	
	public void loadUsers() throws Exception {
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		
		// Skip header
		String currentLine = scanner.nextLine();
		String[] items;
		
		int index = 0;
		while (scanner.hasNext()) {
			currentLine = scanner.nextLine();
			items = currentLine.split(",");
			users[index] = new User(items[0], items[1], items[2]);
			index++;
		}
	}
	
	public void showUsers() {
		System.out.println("UserName   Password        EMail\n---------  -----------     ----");
		
		int index;
		for (index = 0; index < users.length; index++) {
			if (users[index] == null) break;
			User user = users[index];
			System.out.printf("%-10s %-15s %s\n", user.getUserName(), user.getPassword(), user.getEmail());
		}
	}
}