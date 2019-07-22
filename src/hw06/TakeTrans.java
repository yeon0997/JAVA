package CH06;

public class TakeTrans {

	public static void main(String[] args) {

		Student studentjames = new Student("james", 5000);
		Student studenttomas = new Student("tomas", 10000);
		Student studentedward = new Student("edward", 10000);
		
		Bus bus100 = new Bus(100);
		studentjames.takeonbus(bus100);
		studentjames.showinfo();
		bus100.showinfo();
		
		studenttomas.takeonbus(bus100);
		studentjames.showinfo();
		bus100.showinfo();
		
		studentjames.takeoffbus(bus100);
		studenttomas.showinfo();
		bus100.showinfo();
		
		
		Subway subwaygreen = new Subway("2�샇�꽑");
		studentjames.takesubway(subwaygreen);
		studentjames.showinfo();
		subwaygreen.showinfo();
		
		Taxi taxi1 = new Taxi(1);
		studentedward.taketaxi(taxi1);
		
	}

}
