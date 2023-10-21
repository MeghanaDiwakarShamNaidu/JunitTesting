package SEF;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class addArtistTest {

	@Test
	public void testAddArtist_testCase1() {
		//Test Case 1: Check the function with valid inputs
		
		//Test Case 1_Test Data 1
        Artist artistTestCase1Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase1Data1.addArtist();
	        assertEquals(true,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid which satisfies all conditions*/  
	   
	        
	      
		  
	      //Test Case 1_Test Data 2
	        Artist artistTestCase1Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year","1995, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase1Data2.addArtist();
		        assertEquals(true,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid which satisfies all conditions*/
		        
		        
		        
		      //Test Case 1_Test Data 3
		        Artist artistTestCase1Data3 = new Artist("595LOLYS_%","Tarun","chennai|tamilnadu|India","12-12-2012","Tarun is known for his contributions in music industry mainly pop music",new ArrayList<>(Arrays.asList("Singer")),new ArrayList<>(Arrays.asList("blues","classical")),new ArrayList<>(Arrays.asList("2002, Best Music singer of the year")));

//		        assigning the boolean output from add artist function to a boolean variable
		        boolean result3 = artistTestCase1Data3.addArtist();
			        assertEquals(true,result3); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid which satisfies all conditions*/
			        
			      //Test Case 1_Test Data 4
			        Artist artistTestCase1Data4 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//			        assigning the boolean output from add artist function to a boolean variable
			        boolean result4 = artistTestCase1Data4.addArtist();
				        assertEquals(true,result4); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid which satisfies all conditions*/
	}
	
	
	@Test
	public void testAddArtist_testCase2() {
		//Test Case 2: Check the function with invalid inputs
		
		//Test Case 2_Test Data 1
        Artist artistTestCase2Data1 = new Artist("ABSVMPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase2Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist ID is invalid and does not meet condition(the first three characters should be numbers between 5 to 9, the characters 4th to 8th should be upper case letters (A - Z) and the last two characters should be a special character)*/  
	   
	        
	      
		  
	      //Test Case 2_Test Data 2
	        Artist artistTestCase2Data2 = new Artist("12485MOLYS_%","Kiran","Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase2Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal-> here assertEquals is false since the artist ID is invalid and the address format is invalid and does not meet condition(the first three characters should be numbers between 5 to 9, the characters 4th to 8th should be upper case letters (A - Z) and the last two characters should be a special character)*/
	}
	
	
	@Test
	public void testAddArtist_testCase3() {
		//Test Case 3: Check the function with invalid birth date inputs
		
		//Test Case 3_Test Data 1
        Artist artistTestCase3Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","01/02/1854","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase3Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist birth date format is invalid and does not meet condition (DD-MM-YYYY)*/  
	   
	        
	      
		  
	      //Test Case 3_Test Data 2
	        Artist artistTestCase3Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","2005-04-03","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase3Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist birth date format is invalid and does not meet condition(DD-MM-YYYY)*/
	}
	
	
	@Test
	public void testAddArtist_testCase4() {
		//Test Case 4: Check the function with invalid address inputs
		
		//Test Case 4_Test Data 1
        Artist artistTestCase4Data1 = new Artist("589MPTYS_%","Meghana","Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase4Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist address format is invalid and does not meet condition [City|State|Country]*/  
	   
	        
	      
		  
	      //Test Case 4_Test Data 2
	        Artist artistTestCase4Data2 = new Artist("575MOLYS_%","Kiran","India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase4Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist address format is invalid and does not meet condition [City|State|Country]*/
	}
	
	@Test
	public void testAddArtist_testCase5() {
		//Test Case 5: Check the function with invalid bio inputs
		
		//Test Case 5_Test Data 1
        Artist artistTestCase5Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase5Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist bio is invalid and is too short and does not meet condition(between 10 to 30 words) */  
	   
	        
	      
		  
	      //Test Case 5_Test Data 2
	        Artist artistTestCase5Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music and he has many other contributions in editing music videos also which have been featured in Times Now magazine",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase5Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist bio is invalid and is too long and does not meet condition(between 10 to 30 words)*/
	}
	
	@Test
	public void testAddArtist_testCase6() {
		//Test Case 6: Check the function with invalid occupation inputs
		
		//Test Case 6_Test Data 1
        Artist artistTestCase6Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter","Composer","Editor","Manager","Lyricist")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase6Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist occupation is invalid and is too long and does not meet condition(at least one occupation or a maximum of five)*/  
	   
	        
	      
		  
	      //Test Case 6_Test Data 2
	        Artist artistTestCase6Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList()),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase6Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist occupation is invalid and is empty and does not meet condition(at least one occupation or a maximum of five)*/
	}
	
	@Test
	public void testAddArtist_testCase7() {
		//Test Case 7: Check the function with invalid awards inputs
		
		//Test Case 7_Test Data 1
        Artist artistTestCase7Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures","2012,Best Song Written for Sun Pictures","2014, Best Song Written for Musical comedy","2022,Best Song Written for the movie adaptation" )));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase7Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal-> here assertEquals is false since the artist awards is invalid and is too long and does not meet condition( zero to a maximum of three awards)*/  
	   
	        
	      
		  
	      //Test Case 7_Test Data 2
	        Artist artistTestCase7Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase7Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist awards is invalid and title is too short and does not meet condition(The Title should be between 4 to 10 words)*/
	}
	
	
	@Test
	public void testAddArtist_testCase8() {
		//Test Case 8: Check the function with invalid genres inputs
		
		//Test Case 8_Test Data 1
        Artist artistTestCase8Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase8Data1.addArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist genres is invalid and is too short and does not meet condition(active in at least two music genres and a maximum of five genres)*/  
	   
	        
	      
		  
	      //Test Case 8_Test Data 2
	        Artist artistTestCase8Data2 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","22-02-2002","Kiran is known for his contributions in music industry mainly Rock music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal","pop")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase8Data2.addArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist genres is invalid and is too short and does not meet condition (Artists cannot be active in 'pop' and 'rock' genres at the same time)*/
	}

}
