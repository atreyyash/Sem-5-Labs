Class oneDArray{
	public static void main(Strings args]){
		//int month_days[12];  //error
		
		int month_days[];
		month_days = new int[12];
		for(int i=0;i<12;i++){
			System.out.println("m1["+i+"] = "+ m1[i]);
		}
		
		int []m2 = new int[12];
		for(int i=0;i<12;i++)
			System.out.println("m2["+i+"] = "+ m2[i]");

		int []m3 = {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i=0;i<12;i++){
			System.out.println(m3["+i+"] = "+ m3[i]);
		}

		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 30;
		month_days[8] = 31;
		month_days[9] = 30;
		month_days[10] = 31;
		month_days[11] = 30;
		month_days[12] = 31;		