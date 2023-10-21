package SEF;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class updateArtistTest {

	@Test
	public void testUpdateArtist_testCase1() {
		//Test Case 1: update the function with valid inputs
		
		//Test Case 1_Test Data 1
        Artist artistTestCase1Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-2006","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Composer")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2003, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase1Data1.updateArtist();
	        assertEquals(true,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid like updating occupation which satisfies all conditions*/  
	   
	        
	      
		  
	      //Test Case 1_Test Data 2
	        Artist artistTestCase1Data2 = new Artist("595LOLYS_%","Tarun","chennai|tamilnadu|India","12-12-2012","Tarun is known for his contributions in music industry mainly pop music",new ArrayList<>(Arrays.asList("Director")),new ArrayList<>(Arrays.asList("blues","classical")),new ArrayList<>(Arrays.asList("2002, Best Music composer of the decade")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase1Data2.updateArtist();
		        assertEquals(true,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is true since all the inputs for artist is valid like updating the occupation and award title which satisfies all conditions*/
	}
	
	
	@Test
	public void testUpdateArtist_testCase2() {
		//Test Case 2: update the function with invalid occupation input for artist born before 2000
		
		//Test Case 2_Test Data 1
        Artist artistTestCase2Data1 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase2Data1.updateArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist birth year is before 2000 and it is trying to update the artist's occupation. hence does not meet condition (artist born before 2000, their occupation cannot be changed)*/  
	   
	        
	      
		  
	      //Test Case 2_Test Data 2
	        Artist artistTestCase2Data2 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Singer")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase2Data2.updateArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal -> here assertEquals is false since the artist birth year is before 2000 and it is trying to update the artist's occupation. hence does not meet condition (artist born before 2000, their occupation cannot be changed)*/
	}    		        		    
	
	@Test
	public void testUpdateArtist_testCase3() {
		//Test Case 3: updating the function with awards input and invalid date of birth
		
		//Test Case 3_Test Data 1
        Artist artistTestCase3Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28/01/1998","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop","indie")),new ArrayList<>(Arrays.asList("2003, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase3Data1.updateArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because even though we are updating the award year with valid input but since the format of birth date is not valid the expected result is false. */  
	   
	        
	      
		  
	      //Test Case 3_Test Data 2
	        Artist artistTestCase3Data2 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","1996-05-04","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase3Data2.updateArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because even though we are updating the award year with valid input but since the format of birth date is not valid the expected result is false.*/
	}
	
	@Test
	public void testUpdateArtist_testCase4() {
		//Test Case 4: updating the function with combination of invalid inputs for all fields
		
		//Test Case 4_Test Data 1
        Artist artistTestCase4Data1 = new Artist("575MOLYS_%","Kiran","Mysore|Karnataka|India","789/02/4589","Kiran is known for his contributions in music industry mainly Rock music and there are so many other contributions that it will take a lot more space to list it out here but that was the jist of it",new ArrayList<>(Arrays.asList("Composer")),new ArrayList<>(Arrays.asList("rock","metal")),new ArrayList<>(Arrays.asList("2002, Best Music Composer of the year","1995, Best Music director of the year")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase4Data1.updateArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because the artist bio length is too long and birth date is in wrong format and both these do not follow the given condition.*/  
	   
	        
	      
		  
	      //Test Case 4_Test Data 2
	        Artist artistTestCase4Data2 = new Artist("565POLYS_%","Niru","Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList("jazz")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase4Data2.updateArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because the artist address is in wrong format and artist genre is just one and both these do not follow the given condition*/
	}
	
	
	@Test
	public void testUpdateArtist_testCase5() {
		//Test Case 5: updating the function with invalid year for award given before 2000
		
		//Test Case 5_Test Data 1
        Artist artistTestCase5Data1 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music composer of the year")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase5Data1.updateArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because the artist has an award given in year which is before 2000 and when trying to update the award year it will return update as false as expected. this is as per the given condition(Awards that were given to an artist before 2000 can not be changed (neither their year's nor their title)*/  
	   
	        
	      
		  
	      //Test Case 5_Test Data 2
	        Artist artistTestCase5Data2 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList("jazz","classical")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1997, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase5Data2.updateArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because the artist has an award given in year which is before 2000 and when trying to update the award year and title it will return update as false as expected. this is as per the given condition(Awards that were given to an artist before 2000 can not be changed (neither their year's nor their title)*/
	}
	
	
	@Test
	public void testUpdateArtist_testCase6() {
		//Test Case 6: updating the function with invalid genres for artist born before 2000
		
		//Test Case 6_Test Data 1
        Artist artistTestCase6Data1 = new Artist("589MPTYS_%","Meghana","Carlton|Melbourne|Victoria","28-01-1998","Meghana is a student at RMIT and loves listening to songs",new ArrayList<>(Arrays.asList("Singer","Songwriter")),new ArrayList<>(Arrays.asList("pop")),new ArrayList<>(Arrays.asList("2023, Best Song Written for Motion Pictures")));

//        assigning the boolean output from add artist function to a boolean variable
        boolean result1 = artistTestCase6Data1.updateArtist();
	        assertEquals(false,result1); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because we are trying to update the artist genre to a single one and this will return update as flase since it does not satisfy the condition that artist should be active in at least two music genres and a maximum of five genres.*/  
	   
	        
	      
		  
	      //Test Case 6_Test Data 2
	        Artist artistTestCase6Data2 = new Artist("565POLYS_%","Niru","toronto|Cannada|US","14-05-1996","Niru is known for his contributions in film and music industry mainly carnatic music",new ArrayList<>(Arrays.asList("Lyricist")),new ArrayList<>(Arrays.asList ("jazz","classical","pop","blues","indie","carnatic")),new ArrayList<>(Arrays.asList("2002, Best Music lyricist of the year","1992, Best Music director of the year")));

//	        assigning the boolean output from add artist function to a boolean variable
	        boolean result2 = artistTestCase6Data2.updateArtist();
		        assertEquals(false,result2); /*assertEquals(Object expected,Object actual) Asserts that two objects are equal --> here assertEquals is false because we are trying to update the artist genre to six genres and this will return update as flase since it does not satisfy the condition that artist should be active in at least two music genres and a maximum of five genres */
	}
	

}
