package code11_15;

public class KyotoCleaningShop implements CleaningService{
	String ownerName;
	int price;
	
	public Shirt washShirt(Shirt s) {
		s.price=10;
		s.ownerName=ownerName;
		System.out.println(s.ownerName +"は" + s.price + "ドル払った");
	//ShirtクラスにownserNameフィールドが必要
		
		return s;
	}
	public Towl washTowl (Towl t) {
		t.ownerName=ownerName;
		t.price=price;
		return t;
	}
	public Coat washCoat(Coat c) {
		c.ownerName=ownerName;
		c.price=price;
		return c;
	}
}
