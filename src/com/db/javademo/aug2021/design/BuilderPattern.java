package com.db.javademo.aug2021.design;

class Computer {
	// required parameters
	private int HDD;
	private int RAM;
	// optional parameters
	private String Processor;

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.Processor = builder.Processor;
	}

	public int getHDD() {
		return HDD;
	}

	public int getRAM() {
		return RAM;
	}

	public String getProcessor() {
		return Processor;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", Processor=" + Processor + "]";
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private int HDD;
		private int RAM;
		// optional parameters
		private String Processor;

		public ComputerBuilder() {

		}

		public ComputerBuilder(int hdd) {
			this.HDD = hdd;
		}

		public ComputerBuilder(int hdd, int ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setProcessor(String Processor) {
			this.Processor = Processor;
			return this;
		}

		public Computer getInstance() {
			return new Computer(this);
		}
	}
}

public class BuilderPattern {

	public static void main(String[] args) {

		Computer obj1 = new Computer.ComputerBuilder(1000, 8).setProcessor("AMD").getInstance();
		System.out.println(obj1);
		Computer obj2 = new Computer.ComputerBuilder(2000, 12).setProcessor("Intel").getInstance();
		System.out.println(obj2);
		Computer obj3 = new Computer.ComputerBuilder(500, 4).getInstance();
		System.out.println(obj3);
		
		Computer obj4 = new Computer.ComputerBuilder().getInstance();
		System.out.println(obj4);

//		Computer obj4 = new Computer.ComputerBuilder().getInstance();
//		System.out.println(obj4);

	}
}



