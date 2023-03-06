/*
	/**Fusionne 2 sous tableaux deja tries de t
     * @param d indice de la premiere case du 1er sous tableau
     * @param m indice de la premiere case du 2e sous tableau
     * @param f indice de la derniere case du 2e sous tableau
     **
    private void fusion(int d, int m, int f){
	int[] tab = new int[f-d+ 1]; //tableau de sauvegarde temporaire du résultat
	int i = 0; //indice de la case en cours dans tab
	int i1 = d; //indice de la case en cours du 1er sous tableau
	int i2 = m; //indice de la case en cours du 2e sous tableau

	//parcours en panachant les 2 sous tableaux
	while ((i1 < m) && (i2 <= f)){
		if (t[i1] > t[i2]){
		    tab[i] = t[i2];
		    i2++;
		}
		else{
		    tab[i] = t[i1];
		    i1++;
		}
		i++;
	    }

	//si le 1er sous tableau a ete epuise
	if (i1 >= m){ //on recopie la fin du 2e sous tableau
	     while(i2 <= f){
		 tab[i] = t[i2];
		 i2++;
		 i++;
	    }
	}
	//sinon c'est le 2e sous tableau qui a ete epuise
	else{ //on recopie la fin du 1er sous tableau
	     while(i1 < m){
		 tab[i] = t[i1];
		 i1++;
		 i++;
	    }
	}
	//on recopie maintenant tab dans t (a partir de la case d)
	for(i=0;i <= (f-d); i++)
	    {
		t[i+d] = tab[i];
	    }
    }
*/
