import java.util.Scanner;

public class test {

	public static void main (String[] args){
		Tv tv= new Tv();
		
		
		
	
		
	tv.isOn();
		
		System.out.println("Enter required Volume");
		Scanner vol = new Scanner(System.in);
		int volume = vol.nextInt();
		
		System.out.println("Volume set to " + tv.setVolume(volume));

		System.out.println("Enter Channel number");
		Scanner chan = new Scanner(System.in);
		int channel=chan.nextInt();
		tv.setChannel(channel);
		chan.close();
		vol.close();
	
		
	}//end main
	
}//end class
