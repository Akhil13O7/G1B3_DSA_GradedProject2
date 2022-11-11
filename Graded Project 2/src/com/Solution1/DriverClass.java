package com.Solution1;

import java.util.*;

public class DriverClass {
	public static void main(String[] args) {

		List<Integer> floors = new LinkedList<>();

		Skyscraper skyscraper = new Skyscraper();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of floors in the building");
		int floorCount = sc.nextInt();

		for (int i = 0; i < floorCount; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors.add(sc.nextInt());
		}

		skyscraper.AssembleFloor(floors);

		sc.close();
	}

}
