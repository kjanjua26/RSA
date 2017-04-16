/*
 * Security System: Sensors: Motion, Heat, Rain, Lights, Alarm, Motion Sensor. 
 * Properties: Working state, Sensor Number, Date of Installation, Location, Switch On/Off, Resetting. 
 * Detection state: 1. Smoke Sensor: Call Fire Brigade. Motion Detection: Lock Doors. Sound Detector: Calls the police based on sensing. 
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

class Sensors{
	private boolean state;
	private int number;
	private String dateInst;
	private String location;
	
	Sensors(){
		
	}
	
	Sensors(String location, boolean state, int number, String dateInst){
		this.location = location;
		this.state = state;
		this.number = number;
		this.dateInst = dateInst;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public boolean getState(){
		return state;
	}
	public void setState(boolean state){
		this.state = state;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public String getDateInst(){
		return dateInst;
	}
	public void setDateInst(String dateInst){
		this.dateInst = dateInst;
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
class SmokeSensor extends Sensors{
	private boolean detection;
	private boolean CallFireBdg;
	
	SmokeSensor(String location, boolean state, int number, String dateInst){
		super(location, state, number, dateInst);
		
	}
	Random ran = new Random();
	int n = ran.nextInt(10) + 0; 
	void detection(){
		if(getState() == true){
			System.out.println("The Smoke Sensor is on, detecting for unusual smoke.");
		}
		else{
			System.out.println("The smoke sensor is turned off.");
		}
	}
	void CallFireBdg(){
		if(getState() == true){
			if(n == 6){ //random detection phenonmenon, if the smoke sensor's value is 6, then it is unsually detecting smoke, so calls the Fire Brigade.
				CallFireBdg = true;
				System.out.println("The smoke is increasing, I'm calling the firestation!");
			}
			else{
				System.out.println("Everything normal.");
				CallFireBdg = false;
			}
		}
	}
	void reset(){
		if (getState() == false){
			System.out.println("Resetting...");
			setState(true);
		}
		else{
			System.out.println("Resetting...");
		}
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
class SoundSensor extends Sensors{
	private boolean detection;
	private boolean CallPoliceSt;
	
	SoundSensor(String location, boolean state, int number, String dateInst){
		super(location, state, number, dateInst);
	}
	
	Random ran = new Random();
	int n = ran.nextInt(10) + 0; 
	void detection(){
		if(getState() == true){
			System.out.println("The Sound Sensor is on, detecting for unusual sound.");
		}
		else{
			System.out.println("The sound sensor is turned off.");
		}
	}
	void CallPoliceSt(){
		if(getState() == true){
			if(n == 8){ //random detection phenonmenon, if the sound sensor's value is 8, then it is unsually detecting sound, so calls the police st.
				CallPoliceSt = true;
				System.out.println("The sound is increasing, I'm calling the policestation!");
			}
			else{
				System.out.println("Everything normal.");
				CallPoliceSt = false;
			}
		}
	}
	void reset(){
		if (getState() == false){
			System.out.println("Resetting...");
			setState(true);
		}
		else{
			System.out.println("Resetting...");
		}
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
class MotionSensor extends Sensors{
	private boolean detection;
	private boolean lockDoors;
	
	MotionSensor(String location, boolean state, int number, String dateInst){
		super(location, state, number, dateInst);
	}
	Random ran = new Random();
	int n = ran.nextInt(10) + 0; 
	void detection(){
		if(getState() == true){
			System.out.println("The Motion Sensor is on, detecting for unusual motion.");
		}
		else{
			System.out.println("The motion sensor is turned off.");
		}
	}
	void CallPoliceSt(){
		if(getState() == true){
			if(n == 5){ //random detection phenonmenon, if the value is 5, then the doors are locked because that means no one is at home. 
				lockDoors = true;
				System.out.println("No one at home, locking the doors.");
			}
			else{
				System.out.println("The front door is partially locked, people in home.");
				lockDoors = false;
			}
		}
	}
	void reset(){
		if (getState() == false){
			System.out.println("Resetting...");
			setState(true);
		}
		else{
			System.out.println("Resetting...");
		}
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
class LightSwitch extends Sensors{
	
	private boolean lightCondition;
	
	LightSwitch(String location, boolean state, int number, String dateInst){
		super(location, state, number, dateInst);
		
	}
	Random ran = new Random();
	int n = ran.nextInt(10) + 0; 
	void detection(){
		if(getState() == true){
			System.out.println("The lights are on.");
		}
		else{
			System.out.println("The lights are off.");
		}
	}
	void LightCondition(){
		if(getState() == true){
			if(n == 9){ //random detection phenonmenon, if the value is 9, then the lights are turned off, no one is in the room. 
				lightCondition = true;
				System.out.println("No one in the room, turning off the lights.");
			}
			else{
				System.out.println("Everything is normal, room occupied.");
				lightCondition = false;
			}
		}
	}
	void reset(){
		if (getState() == false){
			System.out.println("Resetting...");
			setState(true);
		}
		else{
			System.out.println("Resetting...");
		}
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
class WaterSensor extends Sensors{
	
	private boolean detection;
	private boolean StartDrain;
	
	WaterSensor(String location, boolean state, int number, String dateInst){
		super(location, state, number, dateInst);
		
	}
	
	Random ran = new Random();
	int n = ran.nextInt(10) + 0; 
	void detection(){
		if(getState() == true){
			System.out.println("The water sensor is on.");
		}
		else{
			System.out.println("The water sensor is off.");
		}
	}
	void DrainCondition(){
		if(getState() == true){
			if(n == 3){ //random detection phenonmenon, if the value is 3, water level is high, drain starts.
				StartDrain = true;
				System.out.println("It is raining.");
				System.out.println("The water level is high, draining is started.");
			}
			else{
				System.out.println("It is not raining.");
				System.out.println("The water level is fine.");
				StartDrain = false;
			}
		}
	}
	void reset(){
		if (getState() == false){
			System.out.println("Resetting...");
			setState(true);
		}
		else{
			System.out.println("Resetting...");
		}
	}
	public String toString(){
		return "The sensor is: " + getClass() + "\nThe location is: " + getLocation() + "\nIt was installed on: " + getDateInst() + "\nIt's number is: " + getNumber() + "\nIt's state is: " + getState();
	}
}
public class Design{
	public static void main(String[] args) throws InputMismatchException{
		boolean Smcondition, SCcondition, Mscondition, Lscondition, Wscondition;
		String DateInst;
		int number;
		int choice = 0;
		System.out.println("Welcome to Automated Home!");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to turn Smoke Sensor on/off?");
		Smcondition = in.nextBoolean();
		SmokeSensor s1 = new SmokeSensor("Kitchen", Smcondition, 23, "23 March, 2016");
		s1.detection();
		s1.CallFireBdg();
		if(s1.getState() == false){
			System.out.println("Do you want to reset the sensor? 1 to reset, 2 to not.");
			choice = in.nextInt();
		}
		switch(choice){
		case 1:
			s1.reset();
			break;
		case 2:
			System.out.println("It is turned off.");
		}
		System.out.println(s1.toString());
		System.out.println();
		System.out.println("Do you want to turn sound Sensor on/off?");
		SCcondition = in.nextBoolean();
		SoundSensor s2 = new SoundSensor("Lounge", SCcondition, 23, "23 March, 2016");
		s2.detection();
		s2.CallPoliceSt();
		if(s2.getState() == false){
			System.out.println("Do you want to reset the sensor? 1 to reset, 2 to not.");
			choice = in.nextInt();
		}
		switch(choice){
		case 1:
			s2.reset();
			break;
		case 2:
			System.out.println("It is turned off.");
		}
		System.out.println(s2.toString());
		System.out.println();
		System.out.println("Do you want to turn Motion Sensor on/off?");
		Mscondition = in.nextBoolean();
		MotionSensor s3 = new MotionSensor("Door", Mscondition, 23, "23 March, 2016");
		s3.detection();
		s3.CallPoliceSt();
		if(s3.getState() == false){
			System.out.println("Do you want to reset the sensor? 1 to reset, 2 to not.");
			choice = in.nextInt();
		}
		switch(choice){
		case 1:
			s3.reset();
			break;
		case 2:
			System.out.println("It is turned off.");
		}
		System.out.println(s3.toString());
		System.out.println();
		System.out.println("Do you want to turn Light Switch on/off?");
		Lscondition = in.nextBoolean();
		LightSwitch s4 = new LightSwitch("Rooms",Lscondition, 23, "23 March, 2016");
		s4.detection();
		s4.LightCondition();
		if(s4.getState() == false){
			System.out.println("Do you want to reset the sensor? 1 to reset, 2 to not.");
			choice = in.nextInt();
		}
		switch(choice){
		case 1:
			s4.reset();
			break;
		case 2:
			System.out.println("It is turned off.");
		}
		System.out.println(s4.toString());
		System.out.println();
		System.out.println("Do you want to turn Water Sensor on/off?");
		Wscondition = in.nextBoolean();
		WaterSensor s5 = new WaterSensor("Roof Top", Wscondition, 23, "23 March, 2016");
		s5.detection();
		s5.DrainCondition();
		if(s5.getState() == false){
			System.out.println("Do you want to reset the sensor? 1 to reset, 2 to not.");
			choice = in.nextInt();
		}
		switch(choice){
		case 1:
			s5.reset();
			break;
		case 2:
			System.out.println("It is turned off.");
		}
		System.out.println(s5.toString());
	}
}