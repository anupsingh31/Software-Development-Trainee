package com.techlab.player;


public class Player {

	private int id;
	private String name;
	private int age;
	//private int ELDER=0,MAXPLAYER=4;
	
	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
		System.out.println("Id "+this.id+" Name "+this.name+" Age "+this.age);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public Player whoISElder(Player p)
	{
		
		if(age<p.age)
		return p;
		else
		{
			p.age=age;
			p.name=name;
			p.id=id;
			return p;
		}
		
	}
/*	public void whoISElder(Player[] eld) {
		
		int temp=eld[0].getAge();
		for(int i=1;i<eld.length;i++)
		{
			//System.out.println(eld[i]);
			if(temp<eld[i].getAge())
				temp=eld[i].getAge();
		}
		System.out.println("elder is " + temp);
		
	}*/
}
