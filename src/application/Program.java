package application;

import java.util.Date;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "Books");
		//System.out.println(obj);
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
 		
		//System.out.println(seller);

		System.out.println("===TEST 1: seller findById ====");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
