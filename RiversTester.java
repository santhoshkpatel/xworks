public class RiversTester {

	public static void main(String[] args) {
		Rivers.riversInfo("karanatak");
		Rivers.riversInfo(15);
	    String[]	nameOfRivers= {"kaveri","tunga","bhdra","krishna","kabin"};
		Rivers.riversInfo(nameOfRivers);
		Rivers.riversInfo("tunga", false);
		Rivers.riversInfo("kaveri", 805);
		Rivers.riversInfo(5, "Bijapur");
	}

}