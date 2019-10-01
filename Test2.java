package by.epam.les07.main;

public class Test2 {
	//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
	
	public static class Variab {
		private int v;

		
		public Variab() {
			v = 1;
			
		}
		
		public Variab(int _v){
			v = _v;
			
		}

		public int getV() {
			return v;
		}

		public void setV(int v) {
			this.v = v;
		}
	}	
	public static void main(String[] args) {
	Variab v1 = new Variab(7);
	Variab v2 = new Variab(8);
	
	
	System.out.println(v1.getV());
	System.out.println(v2.getV());
	
	
	}	
	}

