import java.util.ArrayList;

public class VectorClass {
    ArrayList<String> valors;
    /**
     * Inicis marcarà els punts d'inici que té el vector. Simplement en accés a vector restarem inici[d] i indexarem 0-fi
     */
    ArrayList<Integer> inicis;
    ArrayList<Integer> mides;
    int dimensions;
    char tipus;

    public VectorClass(char tipus) {
        this.valors = new ArrayList<String>();
        this.inicis = new ArrayList<Integer>();
        this.mides = new ArrayList<Integer>();
        this.dimensions = 0;
        this.tipus = tipus;
    }

    public void addDimensio(int mida) {
        this.mides.set(dimensions,mida);
        this.inicis.set(dimensions,0);
        dimensions++;
    }

    /**
     * Dim comença a 0;
     * @param dim
     * @param inici
     */
    public void addInici(int dim, int inici) {
        this.inicis.set(dim,inici);
    }

    public void afegir(int[] access, Object valor) {
        if(access.length>dimensions) {
            throw new ArrayIndexOutOfBoundsException("S'ha intentat accedir a una array de " + dimensions + " dimensions, amb " + access.length + " dimensions.");
        }
        int index = calcularIndex(access);
        this.valors.set(index,valor.toString());
    }

    public Object obtenir(int[] pos) {
        if(pos.length>dimensions) {
            throw new ArrayIndexOutOfBoundsException("S'ha intentat accedir a una array de " + dimensions + " dimensions, amb " + pos.length + " dimensions.");
        }
        int index = calcularIndex(pos);
        return this.valors.get(index);
    }

    public int calcularIndex(int[] ind) {
        int index = 0;
        int producte = 1;
        for (int i = this.mides.size() - 1; i >= 0; i--) {
            int pos = ind[i] - this.inicis.get(i);
            if(pos>= this.mides.get(i)) {
                throw new ArrayIndexOutOfBoundsException("S'ha intentat accedir a la posició " + pos + " a una array de mida " + this.inicis.get(i) + ".");
            }
            index += pos * producte;
            producte *= this.mides.get(i);
        }
        return index;
    }
}

