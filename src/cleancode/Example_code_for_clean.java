package cleancode;

public class Example_code_for_clean {
	
	String ApmNuter ="Les Misérables";
	char n = '1';
	char n2 ='5';
	char n3='9';	
	
	public void FindBY(String nom) {// fait une chercher par nom et pas par id
	if (nom=="pierre") {System.out.println("ok c'est bon");}else {System.out.println("c'est pas bon");}
	}
	
	public String Find(String id) {// fait une chercher par id
	id = null;
	return id;
	}

	
	//correction
	
	// String NomLivre = "Les Misérables";
	//char pageDébut = '1';
	//char pageMilieu ='5';
	//char pageFin='9';	
	
	//public void FindBYNom(String nom) {
	//if (nom=="pierre") {
	//	System.out.println("ok c'est bon");
	//}
	//else{
	//	System.out.println("c'est pas bon");
	//}
	//}
	
	//public String FindById(String id) {
	//	try {
	//		id = null;
	//		return id;
	//	}catch (Error ex){
	//		String messerror = "id null";
	//		return messerror;
	//	}
	//}

}
