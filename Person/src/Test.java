
public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-000";
		taro.address="東京";
		taro.bloodtype="O";
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Robot aibo=new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo=new Robot();
		asimo.name="アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper=new Robot();
		pepper.name="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		Robot doraemon=new Robot();
		doraemon.name="ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
		
	}

}
