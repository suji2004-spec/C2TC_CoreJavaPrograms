package com.tnsif.oopsconcept;
//IPL Team - CSK, RCB, MI
public class EncapsulationDemo {
	
	//instance variable
		private String name;
		private int age;
		private int jersyNo;
		
		
		//getters and setters
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getJersyNo() {
			return jersyNo;
		}

		public void setJersyNo(int jersyNo) {
			this.jersyNo = jersyNo;
		}

		@Override
		public String toString() {
			return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + "]";
		}
		public static void main(String[] args) {

	        EncapsulationDemo obj = new EncapsulationDemo();

	        obj.setName("Dhoni");
	        obj.setAge(42);
	        obj.setJersyNo(7);

	        System.out.println(obj.getName());
	        System.out.println(obj.getAge());
	        System.out.println(obj.getJersyNo());

	        System.out.println(obj); // calls toString()
	    }
	}
		

		


