package chapter08;

class Character {
	int hp;
	int power;
	
	public void attack(Object target) {
		System.out.println(target+"공격");
	}
	
}
class Warrior extends Character {
	int weapon;
	
	public void defence(Object target) {
		System.out.println(target+"방어");
	}
}
class Gladiator extends Character {
	int shield;
	
	public void powerattack(Object target) {
		System.out.println(target+"파워공격");
	}
}
class Wizzard extends Character {
	int heal;
	
	public void healing(Object target) {
		System.out.println(target+"치료마법");
	}
}

public class CharacterEx {
	
	public static void main(String[] args) {
		Warrior w = new Warrior();
		Gladiator g = new Gladiator();
		Wizzard z = new Wizzard();
		
		w.attack("총! ");
		w.defence("총! ");
		
		g.attack("파워 올려! ");
		g.powerattack("파워올려! ");
		z.attack("전체! ");
		z.healing("전체! ");	
	}

}