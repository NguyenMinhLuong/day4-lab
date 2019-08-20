package day4.vn;

interface withdraw
{

	void get();
}
interface deposit
{

	void get();
}
interface login
{

	void get();
}
interface logout
{

	void get();
}
interface queryBalance
{

	void get();
}
public class ATMImpl {
	private int idATM;
	private int accountid;

	public boolean withdraw(int id, double money) {
		return false;
	}

	public boolean deposit(int id, double money) {
		return false;
	}

	public boolean login(int id, double money) {
		return false;
	}

	public boolean logout(int id, double money) {
		return false;
	}

	public double queryBalance(int id) {
		return 0;
	}
}
