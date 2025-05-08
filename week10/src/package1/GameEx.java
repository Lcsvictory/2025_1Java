package package1;

import week10.Game;
import week10.LOL;
import week10.Tetris;
import week10.SuperMario;


public class GameEx {
	public static void main(String[] args) {
		LOL lol = new LOL("롤", "13.0");
		Tetris ts = new Tetris("테트리스", "12.5");
		SuperMario sm = new SuperMario("슈퍼마리오", "15.1");
		
		Game gameArr[] = {lol, ts, sm};
		
		for (Game g : gameArr) {
			System.out.println("제목 : " + g.getTitle());
			System.out.println("버전 : " + g.getVersion());
			g.start();
			if (g instanceof LOL) {
				LOL l = (LOL) g;
				System.out.println(l.lolDesc());
				
			}else if (g instanceof Tetris) {
				Tetris t = (Tetris) g;
				System.out.println(t.tetrisDesc());
			} else {
				SuperMario s = (SuperMario) sm;
				System.out.println(s.marioDesc()); 
			}
			System.out.println();
		}
		
	}
}
