package jUnitTesting;

public class SalesPerson {
	
	private String name;
	private int yearsOfService;
	private int numLocksSold;
	private int numStocksSold;
	private int numBarrelsSold;
	private final static int LOCK_PRICE = 45;
	private final static int STOCK_PRICE = 30;
	private final static int BARREL_PRICE = 25;
	
	public SalesPerson (String name, int yearsOfService, int numLocksSold, 
			int numStocksSold, int numBarrelsSold) {
		this.name = name;
		this.yearsOfService = yearsOfService;
		this.numLocksSold = numLocksSold;
		this.numStocksSold = numStocksSold;
		this.numBarrelsSold = numBarrelsSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	
	public int getTotalSales() {
		int totalSales = 0;
		totalSales = numLocksSold*LOCK_PRICE + numStocksSold*STOCK_PRICE + numBarrelsSold*BARREL_PRICE;
		return totalSales;
		
	}
	
	public double getComissionOnSales() {
		int totalSales = numLocksSold*LOCK_PRICE + numStocksSold*STOCK_PRICE + numBarrelsSold*BARREL_PRICE;
		double comission=0;
		if (totalSales <= 1000 ) {
			comission = totalSales*0.1;
		} else {
			comission = 100 + (totalSales - 1000)*0.15;
		}
		return comission;
	}
	
	public boolean shouldbeDismissed() {
		boolean dismissed = false;
		if (numLocksSold == 0 || numStocksSold == 0 || numBarrelsSold == 0) {
			dismissed = true;
		}
		return dismissed;
	} 
	
	public boolean shouldGetBonus() {
		boolean bonus = false;
		if(yearsOfService < 5 && numLocksSold > 50) {
			bonus = true;
		}
		return bonus;
	}
	

}
