import java.util.Scanner;
class Music
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("spotify welcomes you");
		System.out.println("select your favirot singer :");
		System.out.println("1.A.R.Rahman");
		System.out.println("2.Anirudh");
		System.out.println("3.Harish Jeyaraj");
		System.out.println("4.Illaiyaraja");
		System.out.println("5.UI");
		byte singer=obj.nextByte();
		if(singer==1)
		{
			System.out.println("welcome to A.R.Rahman playlist ");
			System.out.println("select your option : ");
			System.out.println("1.melody");
			System.out.println("2.kuthu");
			System.out.println("3.motivational");
			System.out.println("4.sad");
			byte option=obj.nextByte();
			if(option==1)
			{
				System.out.println("available melody songs are :");
				System.out.println("1.Netru illadha matram");
				System.out.println("2.Enna solla pogirai");
				System.out.println("3.Ennavale adi ennavale ");
				System.out.println("4.Malargale malargale ");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Netru illadha matram");
				}
				else if(music==2)
				{
					System.out.println("Enna solla pogirai");
				}
				else if(music==3)
				{
					System.out.println("Ennavale adi ennavale ");
				}
				else if(music==4)
				{
					System.out.println("Malargale malargale ");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("1.Thaiya Thaiya");
				System.out.println("2.Mukkala Mukkala");
				System.out.println("3.Urvashi Urvashi");
				System.out.println("4.Aathichudi");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Thaiya Thaiya");
				}
				else if(music==2)
				{
					System.out.println("Mukkala Mukkala");
				}
				else if(music==3)
				{
					System.out.println("Urvashi Urvashi");
				}
				else if(music==4)
				{
					System.out.println("Aathichudi");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("1.Vande Mataram");
				System.out.println("2.Oruvan Oruvan Mudhalli");
				System.out.println("3.Shakthi Kodu");
				System.out.println("4.Kappal Yeari poyachu");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Vande Mataram");
				}
				else if(music==2)
				{
					System.out.println("Oruvan Oruvan Mudhalli");
				}
				else if(music==3)
				{
					System.out.println("Shakthi Kodu");
				}
				else if(music==4)
				{
					System.out.println("Kappal Yeari poyachu");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("1.Poongatrile");
				System.out.println("2.Marudaaani");
				System.out.println("3.Minnalea En Vazhvin");
				System.out.println("4.Rasathi");
				System.out.println("5.Oru poiyavathu sol");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Poongatrile");
				}
				else if(music==2)
				{
					System.out.println("Marudaaani");
				}
				else if(music==3)
				{
					System.out.println("Minnalea En Vazhvin");
				}
				else if(music==4)
				{
					System.out.println("Rasathi");
				}
				else if(music==5)
				{
					System.out.println("Oru poiyavathu sol");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else
			{
				System.out.println("your option is not available");
			}
		}
		else if(singer==2)
		{
			System.out.println("welcome to Anirudh playlist ");
			System.out.println("select your option : ");
			System.out.println("1.melody");
			System.out.println("2.kuthu");
			System.out.println("3.motivational");
			System.out.println("4.sad");
			byte option=obj.nextByte();
			if(option==1)
			{
				System.out.println("available melody songs are :");
				System.out.println("1.Neeyum Nanum Anbe");
				System.out.println("2.Velicha poove");
				System.out.println("3.Po indru neeyaga ");
				System.out.println("4.Nee partha vizhigal ");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Neeyum Nanum Anbe");
				}
				else if(music==2)
				{
					System.out.println("Velicha poove");
				}
				else if(music==3)
				{
					System.out.println("Po indru neeyaga");
				}
				else if(music==4)
				{
					System.out.println("Nee partha vizhigal");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("1.Vaathi Raid");
				System.out.println("2.Naa Ready");
				System.out.println("3.Badass");
				System.out.println("4.Vandha Edam");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Vaathi Raid");
				}
				else if(music==2)
				{
					System.out.println("Naa Ready");
				}
				else if(music==3)
				{
					System.out.println("Badass");
				}
				else if(music==4)
				{
					System.out.println("Vandha Edam");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("1.Velai illa pattathari");
				System.out.println("2.Boomi Enna Suthudhe");
				System.out.println("3.Ethir Neechal");
				System.out.println("4.Surviva");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Velai illa pattathari");
				}
				else if(music==2)
				{
					System.out.println("Boomi Enna Suthudhe");
				}
				else if(music==3)
				{
					System.out.println("Ethir Neechal");
				}
				else if(music==4)
				{
					System.out.println("Surviva");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("1.Porkanda Singam");
				System.out.println("2.Kanave Kanave");
				System.out.println("3.Kannaana kanne");
				System.out.println("4.Jodi Nilava");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Porkanda Singam");
				}
				else if(music==2)
				{
					System.out.println("Kanave Kanave");
				}
				else if(music==3)
				{
					System.out.println("Kannaana kanne");
				}
				else if(music==4)
				{
					System.out.println("Jodi Nilava");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else
			{
				System.out.println("your option is not available");
			}
		}
		else if(singer==3)
		{
			System.out.println("welcome to Harish Jeyaraj playlist ");
			System.out.println("select your option : ");
			System.out.println("1.melody");
			System.out.println("2.kuthu");
			System.out.println("3.sad");
			byte option=obj.nextByte();
			if(option==1)
			{
				System.out.println("available melody songs are :");
				System.out.println("1.Unnale");
				System.out.println("2.Annul Maele");
				System.out.println("3.Yedho Ondru");
				System.out.println("4.Vaseegara ");
				System.out.println("5.Paartha Mudhal ");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Unnale");
				}
				else if(music==2)
				{
					System.out.println("Annul Maele");
				}
				else if(music==3)
				{
					System.out.println("Yedho Ondru");
				}
				else if(music==4)
				{
					System.out.println("Vaseegara");
				}
				else if(music==5)
				{
					System.out.println("Paartha Mudhal ");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("1.Tirunelveli Halwa Da");
				System.out.println("2.Aradi Katre");
				System.out.println("3.Soda Bottle");
				System.out.println("4.Aruva Meesai");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Tirunelveli Halwa Da");
				}
				else if(music==2)
				{
					System.out.println("Aradi Katre");
				}
				else if(music==3)
				{
					System.out.println("Soda Bottle");
				}
				else if(music==4)
				{
					System.out.println("Aruva Meesai");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			
			else if(option==3)
			{
				System.out.println("available sad songs are :");
				System.out.println("1.Venmathiye");
				System.out.println("2.Oh maname");
				System.out.println("3.Yamma Yamma");
				System.out.println("4.Othayile");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Venmathiye");
				}
				else if(music==2)
				{
					System.out.println("Oh maname");
				}
				else if(music==3)
				{
					System.out.println("Yamma Yamma");
				}
				else if(music==4)
				{
					System.out.println("Othayile");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else
			{
				System.out.println("your option is not available");
			}
		}
		else if(singer==4)
		{
			System.out.println("welcome to Illaiyaraja playlist ");
			System.out.println("select your option : ");
			System.out.println("1.melody");
			System.out.println("2.kuthu");
			System.out.println("3.sad");
			byte option=obj.nextByte();
			if(option==1)
			{
				System.out.println("available melody songs are :");
				System.out.println("1.Oru kili uruguthu");
				System.out.println("2.Kuzhaloodhum kannanukku");
				System.out.println("3.Ennai thottu");
				System.out.println("4.Raja Raja cholan ");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Oru kili uruguthu");
				}
				else if(music==2)
				{
					System.out.println("Kuzhaloodhum kannanukku");
				}
				else if(music==3)
				{
					System.out.println("Ennai thottu");
				}
				else if(music==4)
				{
					System.out.println("Raja Raja cholan");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("1.Ooruvittu ooruvanthu");
				System.out.println("2.Nooru varusham");
				System.out.println("3.Aasai Nooruvagai");
				System.out.println("4.Aasai Athigam Vachu");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Ooruvittu ooruvanthu");
				}
				else if(music==2)
				{
					System.out.println("Nooru varusham");
				}
				else if(music==3)
				{
					System.out.println("Aasai Nooruvagai");
				}
				else if(music==4)
				{
					System.out.println("Aasai Athigam Vachu");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			
			else if(option==3)
			{
				System.out.println("available sad songs are :");
				System.out.println("1.Kanne kalaimane");
				System.out.println("2.Thene thenpaandi neeye");
				System.out.println("3.Paadi parantha killi");
				System.out.println("4.Nilave Vaa");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Kanne kalaimane");
				}
				else if(music==2)
				{
					System.out.println("Thene thenpaandi neeye");
				}
				else if(music==3)
				{
					System.out.println("Paadi parantha killi");
				}
				else if(music==4)
				{
					System.out.println("Nilave Vaa");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else
			{
				System.out.println("your option is not available");
			}
		}
		else if(singer==5)
		{
			System.out.println("welcome to UI playlist ");
			System.out.println("select your option : ");
			System.out.println("1.melody");
			System.out.println("2.kuthu");
			System.out.println("3.motivational");
			System.out.println("4.sad");
			byte option=obj.nextByte();
			if(option==1)
			{
				System.out.println("available melody songs are :");
				System.out.println("1.Aathadi manasudhan");
				System.out.println("2.Chinna sirisu");
				System.out.println("3.Venmeggam ");
				System.out.println("4.Iayyayyo ");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Aathadi manasudhan");
				}
				else if(music==2)
				{
					System.out.println("Chinna sirisu");
				}
				else if(music==3)
				{
					System.out.println("Venmeggam");
				}
				else if(music==4)
				{
					System.out.println("Iayyayyo");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("1.Machi open the bottle");
				System.out.println("2.Saroja saman nikalo");
				System.out.println("3.No money no honey");
				System.out.println("4.Villaiyadu mankatha");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Machi open the bottle");
				}
				else if(music==2)
				{
					System.out.println("Saroja saman nikalo");
				}
				else if(music==3)
				{
					System.out.println("No money no honey");
				}
				else if(music==4)
				{
					System.out.println("Villaiyadu mankatha");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("1.Edhirthu nill");
				System.out.println("2.oru nalil");
				System.out.println("3.Nimirnthu nil");
				System.out.println("4.Ungakkule mirugam");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Edhirthu nill");
				}
				else if(music==2)
				{
					System.out.println("oru nalil");
				}
				else if(music==3)
				{
					System.out.println("Nimirnthu nil");
				}
				else if(music==4)
				{
					System.out.println("Ungakkule mirugam");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("1.Kadhal valarthen");
				System.out.println("2.Yedho ondru ennai");
				System.out.println("3.Pogadhe");
				System.out.println("4.Ninaithu ninaithu");
				System.out.print("Enter your favirot music :");
				byte music=obj.nextByte();
				if(music==1)
				{
					System.out.println("Kadhal valarthen");
				}
				else if(music==2)
				{
					System.out.println("Yedho ondru ennai");
				}
				else if(music==3)
				{
					System.out.println("Pogadhe");
				}
				else if(music==4)
				{
					System.out.println("Ninaithu ninaithu");
				}
				else
				{
					System.out.println("sorry! your choice is not available ");
				}
			}
			else
			{
				System.out.println("your option is not available");
			}
		}
		else
		{
			System.out.println("Invalid singer selection");
		}
		
	}
}