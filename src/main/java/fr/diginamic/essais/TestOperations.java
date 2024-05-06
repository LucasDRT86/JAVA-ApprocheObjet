package fr.diginamic.essais;

import fr.diginamic.Operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		Operations op = new Operations();
		
		System.out.println("Opération \"+\":" + op.calc(3,4,'+')  );
		System.out.println("Opération \"-\":" + op.calc(3,4,'-')  );
		System.out.println("Opération \"+\":" + op.calc(8,6,'*')  );
		System.out.println("Opération \"+\":" + op.calc(8,2,'/')  );

	}

}
