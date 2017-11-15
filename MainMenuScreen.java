import busreservation.*;

import java.io.*;
import java.util.*;
public class MainMenuScreen 
{
 public static void main(String[] args) throws IOException 
    {
    	String seat_num;
		String destination; 
		String time; 
		String departure_date; double price;
		String file_name ; 
		List currBooked; 
        boolean running = false;
		do
		{

            System.out.println("=================================");
            System.out.println("|       MENU SELECTION          |");
            System.out.println("=================================");
            System.out.println("|    1. Make Reservation        |");
            System.out.println("|    2. Check Availability      |");
            System.out.println("|    3. Close                   |");
            System.out.println("=================================");    
            System.out.print("Select option: ");
            GetUserInput aaa = new GetUserInput();
            Scanner booking = new Scanner(System.in);
            int choice = Integer.parseInt(booking.nextLine());
                //KeyIn.inInt("Select Option: ");
            
            switch(choice)
                {
                    case 1: 
                    {
			System.out.println("Make reservation");
                       
                        CheckSeat cseat1 = new CheckSeat(); 
                        cseat1.getInfo();
                        file_name= cseat1.getFileName(); 
                        //System.out.println(file_name);
                        Scanner s; 
                        try {
                            
								s = new Scanner(new BufferedReader(new FileReader(file_name)));
                          
								if(s.hasNext()==false)
									{
										cseat1.all_seats_available();
								  
									}
								else 
								{
									cseat1.available_seat(s);

								}
                       
							} catch (FileNotFoundException ex) 
								{
								   FileWriter fstream = new FileWriter(file_name);
								   BufferedWriter out = new BufferedWriter(fstream);
								  //  s = new Scanner(new BufferedReader(new FileReader(file_name)));

								   cseat1.all_seats_available();
												   
											  
											   
								   // Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
								}
                        
                        destination = cseat1.getDesti();
                        time = cseat1.getDepartureTime();
                        departure_date = cseat1.getDepartureDate();
                        currBooked = cseat1.getCurrBooked();
                        price = cseat1.getSeatPrice();

                        System.out.println("Make reservation");
                        MakeReservation reserve = new MakeReservation();
                        reserve.CustomerInfo(destination,time,departure_date,currBooked,price);
                        reserve.printFileDat();
                        reserve.printSeat();
                        reserve.printTicket(); 
                        reserve.print_ticket_consol();
                        
                            
                    // MainMenuScreen a = new MainMenuScreen(); 
                    // a.main(args);
                        break;
                    }
                        
                        
                        
                        
                        
                        
                 
                    case 2:
					{					
						System.out.println("Check availability seats");
             
						CheckSeat cseat1 = new CheckSeat(); 
                        cseat1.getInfo();
                        file_name= cseat1.getFileName(); 
                        //System.out.println(file_name);
                        Scanner s; 
                        try {
                            
								s = new Scanner(new BufferedReader(new FileReader(file_name)));
                          
								if(s.hasNext()==false)
								   {
									   cseat1.all_seats_available();
									  
									  
								   }
								else 
								{
									cseat1.available_seat(s);

								}
                       
							} catch (FileNotFoundException ex) 
								{
								   FileWriter fstream = new FileWriter(file_name);
								   BufferedWriter out = new BufferedWriter(fstream);
								  //  s = new Scanner(new BufferedReader(new FileReader(file_name)));

													   cseat1.all_seats_available();
												   
											  
											   
								   // Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
								}
									//MainMenuScreen a = new MainMenuScreen(); 
									// a.main(args);

                            break;
							}
                  
                  
                    
                    case 3: //System.out.println("Close menu");
                            System.exit(0);
							break;
                        
                  default : System.out.println("Invalid input");
                            break;
					}

					System.out.println("\nDo you want to redo Process? [YES/NO]");
					Scanner read_user = new Scanner(System.in);
					String read_iuser = read_user.nextLine();
					System.out.println(read_iuser);

					if (read_iuser.equals("YES"))
					{
					running = true;
					System.out.println(running);
					} 
					else
					{
					System.exit(0);
					}

				}
				while(running==true);
        }
}