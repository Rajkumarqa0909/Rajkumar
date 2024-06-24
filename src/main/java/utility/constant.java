package utility;





public class constant 
{
	
	public static int waittime;
	public static long Page_load_TimeOut=120;
	public static long implicityl_wait=20;
    public static long explicitWait=30;
    public static String ScreenPath="C:\\Users\\user2\\eclipse-workspace\\com.e_NPS\\Screenshots";
    public static String excelpath="C:\\Users\\user2\\eclipse-workspace\\com.eNPS\\src\\test\\resources\\cra.xlsx";
    public static String desk_path="C:\\Users\\pegasus_rameshwarr\\Desktop\\cra.xlsx";
   

    
    public static String excel_modification="E:\\cra_ui_automation\\src\\test\\resources\\Modification.xlsx";


    public static String validationsheet="C:\\Users\\pegasus_rameshwarr\\Desktop\\Validationsheet.xlsx";
    
    public static String cancleCheque= "C:\\Users\\pegasus_rameshwarr\\Desktop\\Requried_Document - Copy\\CancelCheque.jpg";
    public static String pancard="C:\\Users\\pegasus_rameshwarr\\Desktop\\Requried_Document - Copy\\pan.jpg";
	public static String invalidDoc="C:\\Users\\pegasus_rameshwarr\\Desktop\\Requried_Document - Copy\\5MB.jpg"; 
	
	
	// Rajkumar Data Path
	 public static String withdrawl_excel="./src//test//resources//Withdrawal.xlsx";
     public static String withdrawal_form="C:\\Users\\pegasus_rajkumarg\\eclipse-workspace\\Chandrayan_4\\Documents_Snap\\Screenshot (10).png";
     public static String KYC_Other_Documents="C:\\Users\\pegasus_rajkumarg\\eclipse-workspace\\Chandrayan_4\\Documents_Snap\\Screenshot (10).png";
     public static String Bank_Proof="C:\\Users\\pegasus_rajkumarg\\eclipse-workspace\\Chandrayan_4\\Documents_Snap\\Screenshot (10).png";
	
	
	
	
	
	
	
	
	
	
	 public static void  pause(int time)
	 {
		 try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
	
	
	
	
	

	
}

