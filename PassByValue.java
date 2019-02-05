package All.Programs.List;

public class PassByValue {
	public static void main(String args[]) {
		Food a = new Food("Hyderabadi Biryani");

		System.out.println("Before 2000: " + a);
		modify(a);
		System.out.println("After 2000: " + a);
	}

	public static void modify(Food food) {
		food.setName("Biryani");
	}

}

class Food {
	String name;

	public Food(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
