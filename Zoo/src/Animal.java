public class Animal {
    String family;
	String name;
	int age;
    boolean isMammal;
    public Animal(String family,String name, int age, boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void displayInfo(){
        System.out.println("Family :"+family);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Is Mammal :"+isMammal);
    }
}
