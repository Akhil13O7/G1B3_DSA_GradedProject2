package com.Solution1;

import java.util.*;

public class Skyscraper {
	Stack<Integer> building = new Stack<>();
	Stack<Integer> tempStack = new Stack<>();
	static int count;

	public void AssembleFloor(List<Integer> floorsList) {
		List<Integer> sortedList = new ArrayList<Integer>();

		for (int i = 0; i < floorsList.size(); i++) {
			sortedList.add(floorsList.get(i));
		}

		sortedList.sort(null);

		for (int i : sortedList) {
			building.push(i);
		}

		System.out.println("\nOrder of construction is as follows\n");

		for (int floor : floorsList) {
			System.out.println("Day: " + (++count));

			if (floor != building.peek()) {
				tempStack.push(floor);
				tempStack.sort(null);
			} else {
				System.out.print(building.pop() + " ");

				while (!tempStack.isEmpty() && tempStack.peek().equals(building.peek())) {
					tempStack.pop();
					System.out.print(building.pop() + " ");

				}
			}

			System.out.println();
		}
	}

}
