package cleancode;

public class Example_code_for_clean {
	
	String ApmNuter ="Les Misérables"; //nom de variable nom explicite
	char n = '1';
	char n2 ='5';
	char n3='9';	
	
	public String FindBY(String nom) {// fait une chercher par nom 
	if (nom=="Les Misérables") {return "ok c'est bon";}
	return null;}
	// commentaire qui precise, pas d'indentation, nom fonction pas explicite
	
	public void Find() {// appel une fonction de recherche
	String id="";
	String res= FindBY(id);
	System.out.println(res.toString());
	}// ne gère pas les erreurs

	
	//correction
	
	// String NomLivre = "Les Misérables";
	//char pageDébut = '1';
	//char pageMilieu ='5';
	//char pageFin='9';	
	
	//public String FindBYNom(String nom) {
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
	//		return FindByNom(id);
	//	}catch (Error ex){
	//		String messerror = "id null";
	//		return messerror;
	//	}
	//}

}
