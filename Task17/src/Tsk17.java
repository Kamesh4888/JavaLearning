
class player
	
		{ 
			
			String playername;
			int score;
			char ratting;
		}


		public class Tsk17 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				player ply1=new player();
				ply1.playername="Kamesh";
				ply1.score=10000;
				ply1.ratting='A';
				
				player ply2=new player();
				ply2.playername="Lakshmi";
				ply2.score=100;
				ply2.ratting='C';
				System.out.println(ply1.playername + "scores" + ply1.score + "iccrating:" +ply1.ratting);
				System.out.println(ply2.playername + "scores" + ply2.score + "iccrating:" +ply2.ratting);

	}

}

