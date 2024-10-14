// Josep Suy abril 2007

//TODO: Fer canvis perquè funcionin bé vectors i tuples. Potser per accions i funcions també.
import java.util.*;

public class Registre  {

	String lexema;
	ArrayList<Character> tipus;
	int adreca;
	Object valor;


	public Registre() {
		lexema="";
		tipus = new ArrayList<>();
		tipus.add('I');
		adreca=0;
	}


	public Registre(String l) {
		lexema=l;
		tipus = new ArrayList<>();
		tipus.add('I');
		adreca=0;
	}

	public Registre(String l, ArrayList<Character> t) {
		lexema=l;
		tipus=t;
		adreca=0;
	}

	/*
public Registre(String l, ArrayList<char> t, int a) {
	lexema=l;
	tipus=t;
	adreca=a;
	}*/

	public Registre(String l, ArrayList<Character> t, int a) {
		lexema = l;
		tipus = t;
		adreca = a;
	}

	public Registre(String l, ArrayList<Character> t, Object v, int a) {
		lexema = l;
		tipus = t;
		adreca = a;
		valor = v;
	}

	public Object getValor() {
		return (valor);
	}
	public String getLexema() {
		return (lexema);
	}
	public ArrayList<Character> getTipus() {
		return (tipus);
	}
	public Integer getAdreca() {
		return (adreca);
	}

	public void putValor(Object v) {
		valor=v;
	}
	public void putLexema(String l) {
		lexema=l;
	}
	public void putTipus(ArrayList<Character> t) {
		tipus=t;
	}
	public void putAdreca(int a) {
		adreca=a;
	}

}
