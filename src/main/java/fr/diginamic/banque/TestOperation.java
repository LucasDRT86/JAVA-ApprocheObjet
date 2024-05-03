package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Debit deb1 = new Debit("01022024",200);
		Debit deb2 = new Debit("01022024",100);
		Credit cred1 = new Credit("01022024",400);
		Credit cred2 = new Credit("01022024",50);
		
		Operation[] tabOp = {deb1,deb2,cred1,cred2};

		for(int i = 0; i < tabOp.length; i++) {
			System.out.println(tabOp[i]);
		}
		
		deb1.calcul(0);
	}

}
