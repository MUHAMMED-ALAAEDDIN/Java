class Modeller
{

    
    public void modelCiz(){
        System.out.println("Model olusturulacak");
        
    }
}

class cokluModel extends Modeller
{
    public int kenarsayisi;
    
    public void modelCiz(){
        System.out.println("CokluModel olustululacak");
    }
}

class ucgen extends cokluModel{
    ucgen(){
        kenarsayisi=3;
    }
    
    public void modelCiz(){
        System.out.println("Ucgen olustululacak");
    }
}
class dikdortgen extends cokluModel{
    dikdortgen(){
        kenarsayisi=4;
    }
    
    public void modelCiz(){
        System.out.println("Dikdortgen olusturulacak");
    }
}

class kare extends cokluModel{
    kare(){
        kenarsayisi=4;
    }
    
    public void modelCiz(){
        System.out.println("Kare olusturulacak");
    }
}

class besgen extends cokluModel{
    besgen(){
        kenarsayisi=5;
    }
    
    public void modelCiz(){
        System.out.println("Besgen olusturulacak");
    }
}

class altigen extends cokluModel{
    altigen(){
        kenarsayisi=6;
    }
    
    public void modelCiz(){
        System.out.println("Altigen olusturulacak");
    }
}

public class Main
{
	public static void main(String[] args) {
		Modeller model = new ucgen();
		model.modelCiz();
	}
}
