package webforce3.poo.tele;
//our application main entry
public class AppTelevision {
	
public static void main(String[] args) {
		
		Television television1 = new Television(20,"Samsung","BA7845CR",new User("Pierre","pierre@gmail.com","monpass"));
		
		System.out.println("Taille: " + television1.getSize() +
				",Marque: " + television1.getBrand() + ",Numéro de série: "
				 + television1.getSerialNumber()+" "+"Utilisateur: "
				 +television1.getUser().getName() +""+ " " +television1.getUser().getMail());
	}

}
