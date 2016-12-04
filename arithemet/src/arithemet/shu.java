package arithemet;

public class shu {
	
	
	private int fenZi;
	private int fenMu;
	public shu()
	{
		this.setFenZi(0);
		this.setFenMu(1);
	}
	public shu(int fenzi,int fenmu)
	{
		this.setFenZi(fenzi );
		this.setFenMu(fenmu);
	}
	public int getFenZi() {
		return fenZi;
	}
	public void setFenZi(int fenZi) {
		this.fenZi = fenZi;
	}
	public int getFenMu() {
		return fenMu;
	}
	public void setFenMu(int fenMu) {
		this.fenMu = fenMu;
	}

	public boolean isEqual(shu other)
	{
		
		if(this.getFenZi()==other.getFenZi()&&this.getFenMu()==other.getFenMu())
		return true;
		else 
		return false;
	}
	
}
