package trabLPII;

public class Regiao {
    private int codR;


	public Regiao(int codR) {
        this.codR = codR;
    }

    public int getCodR() {
        return codR;
    }

    public void setCodR(int codR) {
        this.codR = codR;
    }

	@Override
	public String toString() {
		return this.codR+"\n";
	}
    
}
