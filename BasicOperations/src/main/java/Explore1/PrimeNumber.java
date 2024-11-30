package Explore1;

import java.util.Arrays;
import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {
//for (int i = 0; i <=10; i++) {
//	 checkPrime(i);
//}
 String s=",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";
	        // Write your code here.
 s=s.replaceAll("[^a-zA-Z0-9]"," ");
 s=s.replaceAll(" ","%");
  while(s.contains("%%")) {
	  s=s.replaceAll("%%","%");
  }
  s=s.replaceAll("%", " ").trim();

 System.out.println(s);
	        String wordArray[]=s.split(" ");
	        
	         
	        
	        
	         if(wordArray.length==1 && wordArray[0].length()==0 ) {
	        	 
	        		 System.out.println(wordArray[0].length());
	        	 
	         }else {
	        	
	        	 System.out.println("else case"+wordArray.length);
	        	for(int i=0;i<wordArray.length;i++)
		         {
		        	 System.out.println(wordArray[i]);
		         }
		         
	         }
	         
	        

	}

	static void checkPrime(int inputNumber) {
		int i;

		for (i = 2; i < inputNumber; i++) {
			if (inputNumber % i == 0) {
				break;
			}
		}
		if (i == inputNumber) {
			System.out.printf("\n%d is a prime number..!", inputNumber);
		} else {
			System.out.printf("\n%d is NOT a prime number..!", inputNumber);

		}
	}
}
