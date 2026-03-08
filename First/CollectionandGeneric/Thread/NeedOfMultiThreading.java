package Thread;

public class NeedOfMultiThreading {

	public static void main(String[] args) {
		long starttime =System.currentTimeMillis();
		
//		//first task
//		for(int i=1;i<=1000;i++) {
//			System.out.printf("%d* ",i);
//		}
//		System.out.println("\n * task complete");
//		
//		//second task
//		for(int i=1;i<=1000;i++) {
//			System.out.printf("%d$ \n",i);
//		}
//		System.out.println("\n $ task complete");
//		
//		//third task
//		for(int i=1;i<=1000;i++) {
//			System.out.printf("%d# ",i);
//		}
//		System.out.println("\n # task complete");
		
		FirstTest T1=new FirstTest();
		SecondTest T2=new SecondTest();
		ThirdTest T3=new ThirdTest();
		 
		System.out.println("\n First Thread");
		T1.start();
		System.out.println("\n Second Thread");
		T2.start();
		System.out.println("\n Third Thread");
		T3.start();
//		
		long endTime=System.currentTimeMillis();
		System.out.printf("Total Time Taken: %s %d",
				Thread.currentThread().getName(),
				(endTime-starttime));
	}

}
