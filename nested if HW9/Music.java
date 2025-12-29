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
				System.out.println("-> Netru illadha matram");
				System.out.println("->Enna solla pogirai");
				System.out.println("->Ennavale adi ennavale ");
				System.out.println("->Malargale malargale ");
				
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("->Thaiya Thaiya");
				System.out.println("->Mukkala Mukkala");
				System.out.println("->Urvashi Urvashi");
				System.out.println("->Aathichudi");
				
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("->Vande Mataram");
				System.out.println("->Oruvan Oruvan Mudhalli");
				System.out.println("->Shakthi Kodu");
				System.out.println("->Kappal Yeari poyachu");
				
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("->Poongatrile");
				System.out.println("->Marudaaani");
				System.out.println("->Minnalea En Vazhvin");
				System.out.println("->Rasathi");
				System.out.println("->Oru poiyavathu sol");
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
				System.out.println("->Neeyum Nanum Anbe");
				System.out.println("->Velicha poove");
				System.out.println("->Po indru neeyaga ");
				System.out.println("->Nee partha vizhigal ");
				
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("->Vaathi Raid");
				System.out.println("->Naa Ready");
				System.out.println("->Badass");
				System.out.println("->Vandha Edam");
				
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("->Velai illa pattathari");
				System.out.println("->Boomi Enna Suthudhe");
				System.out.println("->Ethir Neechal");
				System.out.println("->Surviva");
				
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("->Porkanda Singam");
				System.out.println("->Kanave Kanave");
				System.out.println("->Kannaana kanne");
				System.out.println("->Jodi Nilava");
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
				System.out.println("->Unnale");
				System.out.println("->Annul Maele");
				System.out.println("->Yedho Ondru");
				System.out.println("->Vaseegara ");
				System.out.println("->Paartha Mudhal ");
				
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("->Tirunelveli Halwa Da");
				System.out.println("->Aradi Katre");
				System.out.println("->Soda Bottle");
				System.out.println("->Aruva Meesai");
				
			}
			
			else if(option==3)
			{
				System.out.println("available sad songs are :");
				System.out.println("->Venmathiye");
				System.out.println("->Oh maname");
				System.out.println("->Yamma Yamma");
				System.out.println("->Othayile");
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
				System.out.println("->Oru kili uruguthu");
				System.out.println("->Kuzhaloodhum kannanukku");
				System.out.println("->Ennai thottu");
				System.out.println("->Raja Raja cholan ");
				
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("->Ooruvittu ooruvanthu");
				System.out.println("->Nooru varusham");
				System.out.println("->Aasai Nooruvagai");
				System.out.println("->Aasai Athigam Vachu");
			}
			
			else if(option==3)
			{
				System.out.println("available sad songs are :");
				System.out.println("->Kanne kalaimane");
				System.out.println("->Thene thenpaandi neeye");
				System.out.println("->Paadi parantha killi");
				System.out.println("->Nilave Vaa");
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
				System.out.println("->Aathadi manasudhan");
				System.out.println("->Chinna sirisu");
				System.out.println("->Venmeggam ");
				System.out.println("->Iayyayyo ");
				
			}
			else if(option==2)
			{
				System.out.println("available kuthu songs are :");
				System.out.println("->Machi open the bottle");
				System.out.println("->Saroja saman nikalo");
				System.out.println("->No money no honey");
				System.out.println("->Villaiyadu mankatha");
				
			}
			else if(option==3)
			{
				System.out.println("available Motivational songs are :");
				System.out.println("->Edhirthu nill");
				System.out.println("->oru nalil");
				System.out.println("->Nimirnthu nil");
				System.out.println("->Ungakkule mirugam");
				
			}
			else if(option==4)
			{
				System.out.println("available sad songs are :");
				System.out.println("->Kadhal valarthen");
				System.out.println("->Yedho ondru ennai");
				System.out.println("->Pogadhe");
				System.out.println("->Ninaithu ninaithu");
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