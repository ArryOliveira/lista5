package q6;

public class Elevador {
	
		private int andar;
		private int totalAndar;
		private int capacidade;
		private int presentes;
		public void inicializa(int capacidade, int totalAndar) {
			this.andar=0;
			this.presentes=0;
			setCapacidade(capacidade);
			setTotalAndar(totalAndar);
		}
		public int entra() {
			if(presentes<=capacidade) {
				presentes++;
			}
			return presentes;
		}
		public int sai() {
			if(presentes>=1) {
				presentes--;
			}
			return presentes;
		}
		public int sobe() {
			if(andar!=totalAndar) {
				andar++;
			}
			return andar;
		}
		public int desce() {
			if(andar!=0) {
				andar--;
			}
			return andar;
		}
		public int getAndar() {
			return andar;
		}
		public void setAndar(int andar) {
			this.andar = andar;
		}
		public int getTotalAndar() {
			return totalAndar;
		}
		public void setTotalAndar(int totalAndar) {
			this.totalAndar = totalAndar;
		}
		public int getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		public int getPresentes() {
			return presentes;
		}
		public void setPresentes(int presentes) {
			this.presentes = presentes;
		}
		
	}


