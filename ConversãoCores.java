import java.util.Scanner;

public class ConversãoCores {

	public static void main(String[] args) {
		float r, g, b,  w, c, m, y, k;
		Scanner a = new Scanner(System.in);
		System.out.println("Digite o valor de R: ");
		r = a.nextInt();
		System.out.println("Digite o valor de G: ");
		g = a.nextInt();
		System.out.println("Digite o valor de B: ");
		b = a.nextInt();
		if(r==g&&g==b&&b==0) {
			c = 0;
			m = 0;
			y = 0;
			k = 1;
			
		}else {
			w = Math.max(r/255,Math.max(g/255,b/255));
			c = (w-(r/255))/w;
			m = (w-(g/255))/w;
			y = (w-(b/255))/w;
			k = 1-w;
		}
		System.out.println((int)(c*100));
		System.out.println((int)(m*100));
		System.out.println((int)(y*100));
		System.out.println((int)(k*100));
	}

}
