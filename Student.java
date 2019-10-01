package by.epam.les07.main;

public class Student {
	//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
	
	private String name;
    private int ngroup;
    private int[] point = new int[5];
 
    private Student(String _name, int _ngroup, int[] _point) {
        this.name = _name;
        this.ngroup = _ngroup;
        this.point = _point;
    }
		private static void showBest(Student[] listStudents) {
	        for (Student student : listStudents) {
	            int f = 0;
	            for (int a : student.point) {
	                if (a < 9) {
	                    f++;
	                }
	            }
	            if (f == 0)
	                System.out.println(student.name + "  " + student.ngroup);
	        }
	    }
	 
	    public static void main(String[] args) {
	        Student[] listStudent = {
	                new Student("Андреев А.В.", 101, new int[]{9, 8, 7, 5, 9}),
	                new Student("Борисевич П.И.", 102, new int[]{10, 10, 9, 9, 9}),
	                new Student("Воронов А.К.", 103, new int[]{3, 4, 5, 6, 10}),
	                new Student("Галкина Т.Г.", 103, new int[]{9, 10, 9, 9, 9}),
	                new Student("Дроздова Т.В.", 102, new int[]{8, 8, 9, 9, 9}),
	                new Student("Янович Я.Я", 101, new int[]{8, 6, 7, 7, 5}),
	                new Student("Ухов Ю.Ю.", 103, new int[]{7, 6, 5, 8, 7}),
	                new Student("Юнус Ю.С.", 101, new int[]{9, 8, 7, 9, 9}),
	                new Student("Сергеева А.В.", 104, new int[]{6, 7, 4, 8, 9}),
	                new Student("Тулупов И.П.", 104, new int[]{5, 10, 7, 8, 6}),
	                };
	        showBest(listStudent);
	    }

		
	
	

}
