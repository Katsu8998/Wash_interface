package code11_15;

public class Main {
	    public static void main(String[] args){  
	        System.out.println("京都店のシャツ洗濯時間");
	        KyotoCleaningShop V = new KyotoCleaningShop();
	        Shirt s = new Shirt();//クラス型をメゾット引数に用いる場合、mainクラスで希望のクラスからインスタンス化させる
	        V.ownerName ="tanaka";
	        V.washShirt(s);
	     
	    }
	} 
