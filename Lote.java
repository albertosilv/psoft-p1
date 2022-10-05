package psoft;

import java.util.Date;

public class Lote {
		public Lote(Produto prod, int quant, Date datV) {
		super();
		this.prod = prod;
		this.quant = quant;
		this.datV = datV;
	}
		private Produto prod;
		private int quant;
		private Date datV;
		public Produto getProd() {
			return prod;
		}
		public void setProd(Produto prod) {
			this.prod = prod;
		}
		public int getQuant() {
			return quant;
		}
		public void setQuant(int quant) {
			this.quant = quant;
		}
		public Date getDatV() {
			return datV;
		}
		public void setDatV(Date datV) {
			this.datV = datV;
		}
}
