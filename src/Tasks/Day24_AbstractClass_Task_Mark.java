package Tasks;
    abstract class Marks {
	abstract int getPercentage();
    }
    class StudentA extends Marks {
	int biology;
	int math;
	int physics;
	StudentA(int biology, int math, int physics){
		this.biology = biology;
		this.math = math;
		this.physics = physics;
	}
	

	int getPercentage() {
	int Percentage = ((biology + math + physics) / 3);
    return Percentage;
	}
    }

    class StudentB extends Marks {
	int biology;
	int math;
	int physics;
	int chemistry;

	StudentB(int biology, int math, int physics, int chemistry) {
		this.biology = biology;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;

	}

	int getPercentage() {
	int Percentage = ((biology + math + physics + chemistry) / 4);
	return Percentage;
	}
    }
    public class Day24_AbstractClass_Task_Mark {

	public static void main(String[] args) {
	
		StudentA a = new StudentA(80, 90, 95);
		System.out.println(a.getPercentage() + "%");

		StudentB b = new StudentB(85, 93, 93, 94);
		System.out.println(b.getPercentage() + "%");

	}

}
