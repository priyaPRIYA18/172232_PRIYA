package stream.com;

import stream1.com.Trader;


public class Transaction {
	Integer year;
	Integer value;
	Trader trader;
	public Transaction(Integer year, Integer value, Trader trader) {
		super();
		this.year = year;
		this.value = value;
		this.trader = trader;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	
	@Override
	public String toString() {
		return "Transaction [year=" + year + ", value=" + value + ", trader=" + trader + "]";
	}
}
