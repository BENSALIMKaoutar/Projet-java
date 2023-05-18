import java.util.*;
public class programme {
		public static void main(String[] args)
		{long num;
		String nom;
		String prenom;
		client c1=new client();
		client c2=new client();
		client c3=new client();
		client c4=new client();
		client c5=new client();
		List<client> T=Arrays.asList(c1,c2,c3,c4,c5);
		List<client> L = new ArrayList<>(T);
	    
		
	    Scanner s=new Scanner(System.in);
	    int i;
	    for (i=0;i<5;i++) {
	    	
		System.out.println("entrer le numero de compte du client");
		num=s.nextLong();
		Scanner f=new Scanner(System.in);
		System.out.println("entrer le nom du client");
		nom=f.nextLine();
		Scanner v=new Scanner(System.in);
		System.out.println("entrer le prenom du client");
		prenom=v.nextLine();
		 L.get(i).nom=nom;
		 L.get(i).num=num;
		 L.get(i).prenom=prenom;}
	    while(true) {
	     System.out.println("1. Ajouter un nouveau client\n2.Supprimer un client\n3.Modifier les informations d'un client\n!0.Quitter\n\nChoisissez le numero de l'operation voulue");
	     int choix;
	     Scanner m=new Scanner(System.in);
	     choix=m.nextInt();
	     if (choix==0)
	    	 break;
	     switch(choix)
	     {case 1 : try {
	    	       client c6=new client();
	               System.out.println("entrer le numero de compte du client que vous souhaitez ajoutez");
	 	           num=m.nextLong();
	 	           Scanner k=new Scanner(System.in);
	 	           System.out.println("entrer le nom du client");
		           nom=k.nextLine();
	 	           System.out.println("entrer le prenom du client");
	 	           prenom=k.nextLine();
	 	            c6.nom=nom;
	 	             c6.num=num;
	 	            c6.prenom=prenom;
	 	            L.add(c6);
	 	            }
	 	             catch(Exception exc) {
	 	        	  exc.printStackTrace();
	 	        	  }break;
	     case 2 :  try {
	    	       System.out.println("entrer le numero de compte du client que vous souhaitez supprimer");
	               Scanner p=new Scanner(System.in);
	               num=p.nextInt();
	               for (i=0;i<L.size();i++)
	               {if (L.get(i).num==num)
	               { L.remove(i);
	               }}} 
	               catch(Exception exc) {
	    	        exc.printStackTrace();}
	    	         break;
	     case 3: try {
	    	    System.out.println("entrer le numero de compte du client que vous souhaitez modifier");
	             Scanner h=new Scanner(System.in);
	             num=h.nextInt();
	             for (i=0;i<L.size();i++)
	                {if( L.get(i).num==num)  
	                {System.out.println("donner le nouveau numero de compte du client");
	                 num=h.nextInt();
	                 L.get(i).num=num;
	                 System.out.println("donner le nouveau nom du client");
	                 Scanner kh=new Scanner(System.in);
	                 nom=kh.nextLine();
	                 L.get(i).nom=nom;
	                 System.out.println("donner le nouveau prenom du client");
	                 Scanner y=new Scanner(System.in);
	                 prenom=y.nextLine();
	                 L.get(i).prenom=prenom;}}}
	                catch(Exception exc) {
	   	        	  exc.printStackTrace();}
	   	        	  
	                 break;
	                
	                }}
	     
	     
	     for (i=0;i<L.size();i++)
	     {System.out.println("le client numero "+i+": numero de compte: "+L.get(i).num+" nom du client: "+L.get(i).nom+" prenom du client: "+L.get(i).prenom);}
		}}
	     
	     


