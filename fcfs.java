import java.util.Scanner;

//siddhant
class fcfs{
	static void  Waittime(int wT[],int bT[],int P){
		wT[0]=0;
		
		for(int i=1;i<P;i++){ 
			wT[i] = wT[i-1] + bT[i-1];
		}
	}
	static void TurnAroundTime(int tAT[],int wT[],int bT[],int P){
		for(int i=0;i<P;i++){
			tAT[i] = wT[i] + bT[i];
		}
	}
	public static void main(String args[]){		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of processes:");
			int P = sc.nextInt();
			int pID[] = new int[P];
			int bT[] = new int[P];
			int wT[] = new int[P];
			int tAT[] = new int[P];
			for(int i= 0;i<P;i++){
				System.out.println("Enter the Process ID:");
				pID[i] = sc.nextInt();
				System.out.println("Enter the  Burst time:");
				bT[i] = sc.nextInt();
			}
			Waittime(wT,bT,P);
			TurnAroundTime(tAT,wT,bT,P);
			System.out.println("Process\tBurstTime\tWaitingTime\tTurnAroundTime");
		for(int i =0;i<P;i++){
			System.out.println(pID[i]+"\t"+bT[i]+"\t\t"+wT[i]+"\t\t"+tAT[i]);
		}
	}
	
}
