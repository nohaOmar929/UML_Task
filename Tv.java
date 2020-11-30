
public class Tv {


	private int channel;
	private int volumeLevel;
	boolean on=true;
	
	public Tv(){}//default constructor || empty constructor || no argument constructor
	
	public void turnOn(){
		
		
	}
	
	public void trunOff(){
		
		
	}
	
	public int setChannel(int newChannel){
		if(on && newChannel>=1 && newChannel <=20){
			channel= newChannel;
		}//end if
				
		
		else 
			System.out.println("Channel does not exsist");
	return channel;
	}//end method
	
	public int setVolume (int newVolume){
		
		if(on && newVolume>=1 && newVolume<7){
			volumeLevel=newVolume;
		}
	return volumeLevel;
	}
	
	public void channelUp(){
		
		if(on && channel<120)
			channel++;
	}
	
	public void channelDown(){
		
		if (on&& channel>1)
			channel --;
		
	}
	
	public void volumeUp(){
		if(on && volumeLevel<7)
			volumeLevel++;
		
	}
	
	public void volumeDown(){
		if(on && volumeLevel>1)
			volumeLevel--;
		
	}
	public void isOn(){
		
		System.out.println("Home TV is on ");
	}
	


}
