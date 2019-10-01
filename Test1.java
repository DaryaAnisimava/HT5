package by.epam.les07.main;


	
	public class Test1 {
		/*
		 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
		 */
		private int var;

	
		public Test1() {
			var = 1;
			
		}
		
		public Test1(int _var){
			var = _var;
			
		}
		public int getVar() {
			return var;
		}
		public void setVar(int _var) {
			var = _var;
			
		}
	
	
	public static void main(String[] args) {
		
		Test1 var1 = new Test1();
		Test1 var2 = new Test1();
		
		var1.setVar(1);
		var2.setVar(2);
		print(var1);
		print(var2);
		
		Test1 var3;
		var3 = sum(var1, var2);
		System.out.println("sum = " + var3.getVar());
		
		Test1 var4;
		var4 = findMax(var1, var2);
		System.out.println("max ="  + var4.getVar());
	}

	public static void print(Test1 var) {
	
		System.out.println(var.getVar());
		
	}

	public static Test1 findMax(Test1 var1, Test1 var2) {
		int max;
		int a = var1.getVar();
		int b = var2.getVar();
		max = Math.max(a, b);
		Test1 newMax= new Test1();
		newMax.setVar(max);
		return newMax;
	}

	public static Test1 sum(Test1 var1, Test1 var2) {
		int sum;
		sum = var1.getVar() + var2.getVar();
		Test1 newVar= new Test1();
		newVar.setVar(sum);
		return newVar;
	}

}

	
