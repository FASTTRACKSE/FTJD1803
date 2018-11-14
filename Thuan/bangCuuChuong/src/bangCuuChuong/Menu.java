package bangCuuChuong;

import java.util.Scanner;

public class Menu {
				public static void main(String arg[]) {
					Scanner in=new Scanner(System.in);
				    System.out.print("Nhập số phần tử n: ");
				    int n=in.nextInt();
					int menu ;
					do
				    {
				      System.out.println("1. giai phuong trinh bac 2");
				      System.out.println("2. bang cuu chuong ");
				      System.out.println("3. tinh tien dien");
				      System.out.println("4. ket thuc");
				      menu=in.nextInt();
				    
					switch(menu) {
					     case 1:
					    	    float a;
								float b;
								float c;
								Scanner sc = new Scanner(System.in);
								System.out.print("Nhap a = ");
								a = Integer.parseInt(sc.nextLine());
								System.out.print("Nhap b = ");
								b = Integer.parseInt(sc.nextLine());
								System.out.print("Nhap c = ");
								c = Integer.parseInt(sc.nextLine());
								if (a == 0) {
						            if (b == 0) {
						                System.out.println("Phương trinh vô nghiệm!");
						            } else {
						                System.out.println("Phương trình có một nghiệm: "
						                        + "x = " + (-c / b));
						            }
						            return;
						        }
						        
						        float delta = b*b - 4*a*c;
						        float x1;
						        float x2;
						        
						        if (delta > 0) {
						            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
						            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
						            System.out.println("Phương trình có 2 nghiệm là: "
						                    + "x1 = " + x1 + " và x2 = " + x2);
						        } else if (delta == 0) {
						            x1 = (-b / (2 * a));
						            System.out.println("Phương trình có nghiệm kép: "
						                    + "x1 = x2 = " + x1);
						        } else {
						            System.out.println("Phương trình vô nghiệm!");
						        }

							break;

					    	 
					     case 2:
					    	 for ( int i = 1 ; i <= 10 ; i ++){
						            for ( int j = 2; j<= 9 ; j ++) {
						            	
						                System.out.print(j + " x " + i + " = " + i * j+ "\t" );
						            }
						           

						            System.out.print("\n");
							}
							break;

					    	 
					     case 3:
					    	 int soDien;
								float tien = 0;
						
								Scanner tt = new Scanner(System.in);
								System.out.print("Nhap So dien = ");
								soDien = Integer.parseInt(tt.nextLine());
								if(soDien < 50) {
									tien = soDien * 1000;
								}
								else {
									tien = 50 * 1000 + (soDien - 50) * 1200;
								}
								System.out.printf("%.2f",tien);
						   break;
					     case 4:
					    	 System.out.println("Ðã thoát!");
				             System.exit(0);
					    	 
					
					}
				
				    }while(menu!=0);
				}
}

