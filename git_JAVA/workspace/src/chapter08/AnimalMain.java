package chapter08;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] aml = new Animal[4];
		Animal eagle = new Eagle("조류", "독수리");
		Animal tiger = new Tiger("포유류", "호랑이");
		Animal lion = new Lion("포유류", "사자");
		Animal shark = new Shark("어류", "상어");
		
		aml[0] = eagle;
		aml[1] = tiger;
		aml[2] = lion;
		aml[3] = shark;
		
		for (int i=0; i<aml.length;i++) {
			aml[i].sleep();
		}
	
	}

}
