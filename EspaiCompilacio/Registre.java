// Josep Suy abril 2007

//TODO: Fer canvis perquè funcionin bé vectors i tuples. Potser per accions i funcions també.
import java.util.*;

public class Registre  {

	String lexema;
	ArrayList<Character> tipus;
	Long adreca;
	// Only for Functions and Actions
	ArrayList<Boolean> isEntSor;

	// Només per els vectors
	ArrayList<Long> inicis;
	ArrayList<Long> mides;

	public Registre() {
		lexema="";
		tipus = new ArrayList<>();
		tipus.add('I');
		adreca=0L;
	}

	public Registre(String l) {
		lexema=l;
		tipus = new ArrayList<>();
		tipus.add('I');
		adreca=0L;
	}

	public Registre(String l, ArrayList<Character> t) {
		lexema=l;
		tipus=t;
		adreca=0L;
	}

	public Registre(String l, ArrayList<Character> t, Long a) {
		lexema = l;
		tipus = t;
		adreca = a;
	}

	public Registre(String l, ArrayList<Character> t, Long a, ArrayList<Boolean> es) {
		lexema = l;
		tipus = t;
		adreca = a;
		isEntSor = es;
	}

	public Registre(String l, ArrayList<Character> t, Long a, ArrayList<Long> i, ArrayList<Long> m) {
		lexema = l;
		tipus = t;
		adreca = a;
		inicis = i;
		mides = m;
	}

	public String getLexema() {
		return (lexema);
	}
	public ArrayList<Character> getTipus() {
		return (tipus);
	}
	public Long getAdreca() {
		return (adreca);
	}

	public void putLexema(String l) {
		lexema=l;
	}
	public void putTipus(ArrayList<Character> t) {
		tipus=t;
	}
	public void putAdreca(Long a) {
		adreca=a;
	}

}
