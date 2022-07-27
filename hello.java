import java.util.ArrayList;

interface Voiceable{
	public void doVoice();
}

class Hello {
	public Zoo zoo;
	
	public static void main(String[] args){	
		System.out.println("Hello\n");
		Hello h = new Hello();
		h.zoo = new Zoo();
		h.zoo.pets.add(new Cat());
		h.zoo.pets.add(new Dog());
		h.zoo.pets.get(0).doVoice();	// It is a cat
		h.zoo.pets.get(1).doVoice();	// It is a dog
	}
}	

class Dog implements Voiceable {
	public void doVoice(){
		System.out.println("gav - gav");
	}
}

class Cat implements Voiceable {
	public void doVoice(){
		System.out.println("мяу - мяу");
	}
}

class Zoo {
	public ArrayList<Voiceable> pets;
	Zoo() {
		this.pets = new ArrayList<Voiceable>();
	}
}
