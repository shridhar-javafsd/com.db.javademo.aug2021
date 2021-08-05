package com.db.javademo.aug2021.bank;

public interface Rbi {

	public abstract void doKyc(); // what

}

interface RuralBanking extends Rbi {
	public abstract void provideAgriLoans(); // what

}

class TelanganaBank implements RuralBanking {

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideAgriLoans() {
		// TODO Auto-generated method stub
		
	}

}