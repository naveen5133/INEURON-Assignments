package in.ineuron.main;

import java.util.Scanner;

class gussNumber{
	
	int GivenNum;
	
	int GivenGussNum(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Gusser give the number fron 1 - 20");
		GivenNum=sc.nextInt();
		return GivenNum;
		
	}
}

class Player{
	
	int playerNumber;
	
	public int playerGivenNum() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Guss the number");
		playerNumber=sc.nextInt();
		return playerNumber;
	}
}

class umpair{
	
	int gussGivennumber;
	int player1;
	int player2;
	int player3;
	int player4;
	int player5;
	int player6;
	
	
	public void CollectTheGussNum() {
		gussNumber a= new gussNumber();
		gussGivennumber=a.GivenGussNum();
		
		if(gussGivennumber>=21 || gussGivennumber<=0) {
			System.out.println("Sorry Please select num between 1-20");
			CollectTheGussNum();
		}
		
	}
	
	public void CollectNumFromPlayer() {
		
		Player p1=new Player();
		Player p2=new Player();		
		Player p3=new Player();
		Player p4=new Player();
		Player p5=new Player();		
		Player p6=new Player();
		
		player1 = p1.playerGivenNum();
		player2 = p2.playerGivenNum();
		player3 = p3.playerGivenNum();
		player4 = p4.playerGivenNum();
		player5 = p5.playerGivenNum();
		player6 = p6.playerGivenNum();
		
		
	}
	public void compare() {
		
		if(gussGivennumber==player1 && gussGivennumber==player2 && gussGivennumber==player6 &&
				gussGivennumber==player3 && gussGivennumber==player4 && gussGivennumber==player5) {
			System.out.println("All got the number");
		}
		
         if(gussGivennumber==player1 ) {
			if(player1==player2 && player1==player3 && player1==player4 && player1==player5 &&player1!=player6 ) {
				System.out.println("player1,player2,player3,player4 and player5 wins ");
			}
			else if(player1==player2 && player1==player3 && player1==player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player2,player3,player4 and player6 wins");
			}
			else if(player1==player2 && player1==player3 && player1!=player4 && player1==player5 && player1==player6) {
				System.out.println("player1,player2,player3,player5 and player6 wins");
			}
			else if(player1==player2 && player1!=player3 && player1==player4 && player1==player5 && player1==player6) {
				System.out.println("player1,player2,player4,player5 and player6 wins");
			}
			else if(player1!=player2 && player1==player3 && player1==player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player3,player4,player5 and player6 wins");
			}
			else if(player1==player2 && player1==player3 && player1==player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1,player2,player3 and player4 wins");
			}
			else if(player1==player2 && player1==player3 && player1!=player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player2,player3 and player6 wins");
			}
			else if(player1==player2 && player1!=player3 && player1!=player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player2,player5 and player6 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1==player4 && player1==player5 && player1==player6) {
				System.out.println("player1,player4,player5 and player6 wins");
			}
			else if(player1!=player2 && player1==player3 && player1==player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player3,player4 and player5 wins");
			}
			else if(player1==player2 && player1!=player3 && player1==player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player2,player4 and player5 wins");
			}
			else if(player1==player2 && player1==player3 && player1!=player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player2,player3 and player5 wins");
			}
			else if(player1!=player2 && player1==player3 && player1==player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player3,player4 and player6 wins");
			}
			else if(player1==player2 && player1!=player3 && player1==player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player2,player4 and player6 wins");
			}
			else if(player1!=player2 && player1==player3 && player1!=player4 && player1==player5 && player1==player6) {
				System.out.println("player1,player3,player5 and player6 wins");
			}
			else if(player1==player2 && player1==player3 && player1!=player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1,player2 and player3 wins");
			}
			else if(player1==player2 && player1!=player3 && player1!=player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player2 and player6 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1!=player4 && player1==player5 && player1==player6) {
				System.out.println("player1,player5 and player6 wins");
			}
			else if(player1!=player2 && player1==player3 && player1!=player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player3 and player5 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1==player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player4 and player6 wins");
			}
			else if(player1!=player2 && player1==player3 && player1!=player4 && player1!=player5 && player1==player6) {
				System.out.println("player1,player3 and player6 wins");
			}
			else if(player1==player2 && player1!=player3 && player1==player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1,player2 and player4 wins");
			}
			else if(player1!=player2 && player1==player3 && player1==player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1,player3 and player4 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1==player4 && player1==player5 && player1!=player6) {
				System.out.println("player1,player4 and player5 wins");
			}
			else if(player1==player2 && player1!=player3 && player1!=player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1 and player2 wins");
			}
			else if(player1!=player2 && player1==player3 && player1!=player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1 and player3 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1==player4 && player1!=player5 && player1!=player6) {
				System.out.println("player1 and player4 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1!=player4 && player1==player5 && player1!=player6) {
				System.out.println("player1 and player5 wins");
			}
			else if(player1!=player2 && player1!=player3 && player1!=player4 && player1!=player5 && player1==player6) {
				System.out.println("player1 and player6 wins");
			}
			else {
				System.out.println("player1 wins");
			}
		}
        
		else if(gussGivennumber==player2) {
			if(player2==player3 && player2==player4 && player2==player5 && player2==player6) {
				System.out.println("player2,player3,player4,player5 and player6 wins");
			}
			else if(player2==player3 && player2==player4 && player2==player5 && player2!=player6) {
				System.out.println("player2,player3,player4 and player5 wins");
			}
			else if(player2==player3 && player2==player4 && player2!=player5 && player2==player6) {
				System.out.println("player2,player3,player4 and player6 wins");
			}
			else if(player2==player3 && player2!=player4 && player2==player5 && player2==player6) {
				System.out.println("player2,player3,player5 and player6 wins");
			}
			else if(player2!=player3 && player2==player4 && player2==player5 && player2==player6) {
				System.out.println("player2,player4,player5 and player6 wins");
			}
			else if(player2==player3 && player2==player4 && player2!=player5 && player2!=player6) {
				System.out.println("player2,player3 and player4 wins");
			}
			else if(player2==player3 && player2!=player4 && player2!=player5 && player2==player6) {
				System.out.println("player2,player3 and player6 wins");
			}
			else if(player2!=player3 && player2!=player4 && player2==player5 && player2==player6) {
				System.out.println("player2,player5 and player6 wins");
			}
			else if(player2!=player3 && player2==player4 && player2==player5 && player2!=player6) {
				System.out.println("player2,player4 and player5 wins");
			}
			else if(player2!=player3 && player2==player4 && player2!=player5 && player2==player6) {
				System.out.println("player2,player4 and player6 wins");
			}
			else if(player2==player3 && player2!=player4 && player2==player5 && player2!=player6) {
				System.out.println("player2,player3 and player5 wins");
			}
			else if(player2==player3 && player2!=player4 && player2!=player5 && player2!=player6) {
				System.out.println("player2 and player3 wins");
			}
			else if(player2!=player3 && player2==player4 && player2!=player5 && player2!=player6) {
				System.out.println("player2 and player4 wins");
			}
			else if(player2!=player3 && player2!=player4 && player2==player5 && player2!=player6) {
				System.out.println("player2 and player5 wins");
			}
			else if(player2!=player3 && player2!=player4 && player2!=player5 && player2==player6) {
				System.out.println("player2 and player6 wins");
			}
			else {
				System.out.println("player2 wins");
			}
		}
		else if(gussGivennumber==player3) {
			if(player3==player4 && player3==player5 && player3==player6 ) {
				System.out.println("player3,player4,player5 and player6 wins");
			}
			else if(player3==player4 && player3==player5 && player3!=player6 ) {
				System.out.println("player3,player4 and player5 wins");
			}
			else if(player3==player4 && player3!=player5 && player3==player6 ) {
				System.out.println("player3,player4 and player6 wins");
			}
			else if(player3!=player4 && player3==player5 && player3==player6 ) {
				System.out.println("player3,player5 and player6 wins");
			}
			else if(player3==player4 && player3!=player5 && player3!=player6 ) {
				System.out.println("player3, and player4 wins");
			}
			else if(player3!=player4 && player3==player5 && player3!=player6 ) {
				System.out.println("player3, and player5 wins");
			}
			else if(player3!=player4 && player3!=player5 && player3!=player6 ) {
				System.out.println("player3, and player6 wins");
			}
			else {
				System.out.println("player3 wins");
			}
		}
		else if(gussGivennumber==player4) {
			if(player4==player5 && player4==player6) {
				System.out.println("player4,player5 and player6 wins");
			}
			else if(player4==player5 && player4!=player6) {
				System.out.println("player4 and player5 wins");
			}
			else if(player4!=player5 && player4==player6) {
				System.out.println("player4 and player6 wins");
			}
			else {
				System.out.println("player4 wins");
			}
		}
		else if(gussGivennumber==player5) {
			if(player5==player6) {
				System.out.println("player5 and player6 wins");
			}
			else {
				System.out.println("player6 wins");
			}
		}
		else if(gussGivennumber==player6) {
			System.out.println("player6 wins");
		}
		else {
			System.out.println("oops try again!");
		}
	}
	
	
}

public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		umpair b = new umpair();
		b.CollectTheGussNum();
		b.CollectNumFromPlayer();
		b.compare();
	}
}

