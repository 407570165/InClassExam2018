package com.exam;

public class TicketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Result:
		 *  Taipei    Keelung  37   2  74
		 *  TaiChung  Taipei   285  1  285
		 * 
		 */
		
			Order order = new Order();
			//origin, destination, price, quantity
			Ticket ticket = new Ticket("Taipei", "Keelung", 37, 2);
			order.add(ticket);
			//ticket = new Ticket("TaiChung", "Taipei", 285, 1);
			//order.add(ticket);
			//order.print();
	}

}
