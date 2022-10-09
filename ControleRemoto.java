package orientacao;

public class ControleRemoto {
	public int Volume;
	public int Canal;
	public ControleRemoto(int Volume,int Canal){
		this.Volume=Volume;
		this.Canal=Canal;
	}
    public int AumentaVolume() {
        Volume++;
        return Volume;
    }
    public int DiminuiVolume() {
    	Volume--;
    	return Volume;
    }
    public int MudaCanal(int NovoCanal) {
    	Canal=NovoCanal;
    	return Canal;
    }
    public int VaiCanal() {
        Canal++;
        return Canal;
    }
    public int VoltaCanal() {
    	Canal--;
    	return Canal;
    }
    public void MostraCanal() {
    	System.out.println(Canal);
    }
    public void MostraVolume() {
    	System.out.println(Volume);
    }
}
