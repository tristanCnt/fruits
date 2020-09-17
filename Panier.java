import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum de fruits que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
<<<<<<< HEAD
<<<<<<< HEAD
		
=======
	
>>>>>>> d30568f8abb7ef41904eb100e13bfa06b62a5226
=======
	this.contenanceMax = contenanceMax;
	fruits = new ArrayList<Fruit>();

>>>>>>> d1f278924fd973da3fcede0a50f6a87c744b0d8d
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
	String s = "";
	for(int i=0;i<getTaillePanier();i++)
	{
		s+= fruits.get(i).toString() + " - ";
	}
        return s;
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return null;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return 0;
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return 0;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return null;
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)

    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	return false;
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return false;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
<<<<<<< HEAD
<<<<<<< HEAD
	if (!estPlein()){
		fruits.add(o);
	}
=======

>>>>>>> d1f278924fd973da3fcede0a50f6a87c744b0d8d
=======
       
>>>>>>> d30568f8abb7ef41904eb100e13bfa06b62a5226
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
<<<<<<< HEAD
	if(this.fruits.size() == 0)
		throw new PanierVideException();
	else
		this.fruits.remove(this.fruits.size() - 1);
=======
     
>>>>>>> d30568f8abb7ef41904eb100e13bfa06b62a5226
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	double prix = 0;
	for(int i = 0 ; i < this.fruits.size(); i++)
		 prix = prix + this.fruits.get(i).getPrix();

	return prix;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
<<<<<<< HEAD
		for (int i = 0 ;i<fruits.size();i++){
			if (fruits.get(i).getOrigine().equals(origine) ){
				fruits.remove(fruits.get(i));
			}
		}
    }

    //groupe 8
=======
	
    }  
        
    //groupe 8    
>>>>>>> 0804172655978ad91a82df8eee9e11b2de769680
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
    
    //tests
    public static void main (String[] args){
<<<<<<< HEAD
    	ArrayList fruits= new ArrayList();
	Poire p1 = new Poire();
	Orange o1 = new Orange(0.6, "Brésil");
          fruits.add(p1);
          fruits.add(o1);
	Panier p = new Panier(fruits, 10);
	System.out.println(p1.toString());
	System.out.println(o1.toString());
	System.out.println(p.getPrix());
=======
    	//Ecrire ici vos tests
	System.out.println("premier test Panier");
	Panier p = new Panier(9);
	System.out.println(p.toString());
    Panier p = new Panier(5);
    System.out.println("getFruits : "+ p.getFruits());
    System.out.println("get taille panier : "+ p.getTaillePanier());
    System.out.println("get contenace max : "+ p.getContenanceMax());
>>>>>>> d1f278924fd973da3fcede0a50f6a87c744b0d8d
    }

}


