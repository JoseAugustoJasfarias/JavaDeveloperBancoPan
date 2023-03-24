package one.digitalInnovation;

public class No {

    private  int dado;
    private  No refNo = null;

    public No getRefNo() {
        return refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No() {
    }


}


