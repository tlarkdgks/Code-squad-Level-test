package LevelTest;
import java.util.*;
public class LevelTest2 {
	
	static int strike = 0; 
    static int ball = 0; 
    public static void main(String[] args) {
    	int 컴퓨터[] = new int[3];
    	int 사용자[] = new int[3];
    	Random RD = new Random();  
    	while(컴퓨터[0] == 0) { 컴퓨터[0] = RD.nextInt(10); 
    	}
    	while(컴퓨터[0] == 컴퓨터[1] || 컴퓨터[1] == 0) { 
    		컴퓨터[1] = RD.nextInt(10); 
    	}
    	while(컴퓨터[0] == 컴퓨터[2] || 컴퓨터[1] == 컴퓨터[2] || 컴퓨터[2] == 0) { 
    		컴퓨터[2] = RD.nextInt(10); 
    	}
    	Scanner	scan = new Scanner(System.in);
    	while(strike < 3) {
    		for(int i = 0; i < 사용자.length; i++) { 
    			System.out.println(i+1 + "번째 수 : ");
    			사용자[i] = scan.nextInt();
    			while (사용자[i] >= 10 || 사용자[i] == 0) { 
    				System.out.println(i+1 + "번째 수 : ");
    				사용자[i] = scan.nextInt();
    				}
    			}
    		for(int i = 0; i < 3; i++) {
    			for(int j = 0; j < 3; j++) {
    				if( 컴퓨터[i] == 사용자[j] ) {
    					if ( i == j ) { 
    						strike ++; 
    						} else { 
    							ball ++; 
    							} 
    					}
    			}
    			}
    		if (strike == 0 && ball == 0) { 
    			System.out.println("아웃!");
    			} else if(strike == 3) { 
    				System.out.println("홈런!");
    				} else {
    					System.out.println( strike + "S" + ", " + ball + "B");
    					strike = 0;
    					ball = 0;
    					}
    		}
    	}
    }