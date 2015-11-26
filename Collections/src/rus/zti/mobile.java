package rus.zti;



public class mobile {
	private int number;
	private String name;
	private String chif;
		
	public mobile(int number, String name, String chif){
		this.number = number;
		this.name = name;
		this.chif = chif;
	
	}
	
		public int getNumber() {
			return number;
	}
		public void setNumber(int number) {
			this.number = number;
	}
		public String getName() {
			return name;
	}
		public void setName(String name) {
			this.name = name;
	}

		public String getChif() {
			return chif;
	}

		public void setChif(String chif) {
			this.chif = chif;
	}

	}

