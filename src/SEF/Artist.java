package SEF;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Artist {

	private String ID;
	private String Name;
	private String Address;
	private String Birthdate;
	private String Bio;
	private ArrayList<String> Occupations; // like singer, songwriter, composer
	private ArrayList<String> Genres; // like rock, jazz, blues, pop, classical
	private ArrayList<String> Awards;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}

	public String getBio() {
		return Bio;
	}

	public void setBio(String bio) {
		Bio = bio;
	}

	public ArrayList<String> getOccupations() {
		return Occupations;
	}

	public void setOccupations(ArrayList<String> occupations) {
		Occupations = occupations;
	}

	public ArrayList<String> getGenres() {
		return Genres;
	}

	public void setGenres(ArrayList<String> genres) {
		Genres = genres;
	}

	public ArrayList<String> getAwards() {
		return Awards;
	}

	public void setAwards(ArrayList<String> awards) {
		Awards = awards;
	}

	public Artist(String id, String name, String address, String birthdate, String bio, ArrayList<String> occupations,
			ArrayList<String> genres, ArrayList<String> awards) {
		ID = id;
		Name = name;
		Address = address;
		Birthdate = birthdate;
		Bio = bio;
		Occupations = occupations;
		Genres = genres;
		Awards = awards;

	}

	public boolean addArtist() {

		/* TODO: Add the information of a new artist to a TXT file */
//if the artist information meets the defined conditions the information should be added to the TXT file and the function should return true. If the artist information does not meet the conditions, the information should not be added to the TXT file and the function should return false.

		// Condition 1: check for valid Artist ID
		if (!isValidArtistId(ID)) {
			return false;
		}

		// Condition 2: check for valid Birth Date
		if (!isValidBirthDate(Birthdate)) {
			return false;
		}

		// Condition 3: check for valid Address
		if (!isValidAddress(Address)) {
			return false;
		}

		// Condition 4: check for valid Bio
		if (!isValidBio(Bio)) {
			return false;
		}

		// Condition 5: check for valid Occupations
		if (!isValidOccupations(Occupations)) {
			return false;
		}

		// Condition 6: check for valid Awards
		if (!isValidAwards(Awards)) {
			return false;
		}

		// Condition 7: check for valid Genres
		if (!isValidGenres(Genres)) {
			return false;
		}
		
	

		// If all conditions are met, add artist information to the TXT file.
		try {
			FileWriter writer = new FileWriter("artists.txt", true); // Append mode
			writer.write(
					ID + "|" + Name + "|" + Address + "|" + Birthdate + "|" + Bio + "|" + String.join(",", Occupations)
							+ "|" + String.join(",", Awards) + "|" + String.join(",", Genres) + "\n");
			writer.write("--------------------------\n");   /*use delimiter if needed to differentiate between different artists*/
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateArtist() {

		/* TODO : Update the information of a given artist in a TXT file */
//	If the artist's new information meets the defined conditions, the artist information should be added to the TXT file and the function should return true. If the artist's new information does not meet the following conditions, the artist information should not be added to the TXT file and the function should return false. 

		// Condition 1: Check all constraints implemented for the addArtist function.
		if (!isValidArtistId(ID) || !isValidBirthDate(Birthdate) || !isValidAddress(Address) || !isValidBio(Bio)
				|| !isValidOccupations(Occupations) || !isValidAwards(Awards) || !isValidGenres(Genres)) {
			return false;
		}

	
		
		// Condition 2: If an artist was born before 2000, their occupation cannot be
		// changed.
		if (getBirthYear() < 2000) {
			return false;
		}

		// Condition 3: Awards which were given to an artist before 2000 cannot be
		// changed (neither year nor title).
		if (!canChangeAwards()) {
			return false;
		}

		// If all conditions are met, update artist information in the TXT file.
		try {
			ArrayList<String> fileContent = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader("artists.txt"));
			String line;
			boolean isFirstArtist = true; // Flag for the first artist
			while ((line = reader.readLine()) != null) {
				if (line.equals("--------------------------")) {
					isFirstArtist = false; // The first artist's data has been processed.
				} else {

					String[] artistData = line.split("\\|");
					if (artistData[0].equals(ID)) {
						// Update artist information
						fileContent.add(ID + "|" + Name + "|" + Address + "|" + Birthdate + "|" + Bio + "|"
								+ String.join(",", Occupations) + "|" + String.join(",", Awards) + "|"
								+ String.join(",", Genres));
					} else {
						fileContent.add(line);
					}
				}
			}
			reader.close();

			BufferedWriter writer = new BufferedWriter(new FileWriter("artists.txt"));
			for (String entry : fileContent) {
				writer.write(entry + "\n");
			}
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	private boolean isValidArtistId(String id) {
		String regex = "^[5-9]{3}[A-Z]{5}[^A-Za-z0-9]{2}$";
		return id.matches(regex);
	}

	private boolean isValidBirthDate(String birthdate) {
		String regex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";
		return birthdate.matches(regex);
	}

	private boolean isValidAddress(String address) {
		String regex = "^[^|]+\\|[^|]+\\|[^|]+$";
		return address.matches(regex);
	}

	private boolean isValidBio(String bio) {
		int wordCount = bio.split("\\s+").length;
		
		return wordCount >= 10 && wordCount <= 30;
	}

	private boolean isValidOccupations(ArrayList<String> occupations) {
		return occupations.size() >= 1 && occupations.size() <= 5;
	}

	private boolean isValidAwards(ArrayList<String> awards) {
		for (String award : awards) {
			String[] parts = award.split(", ");
			if (parts.length != 2) {
				return false;
			}
			String year = parts[0];
			String title = parts[1];
			if (year.length() != 4 || title.split(" ").length < 4 || title.split(" ").length > 10) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidGenres(ArrayList<String> genres) {
		if (genres.size() < 2 || genres.size() > 5) {
			return false;
		}
		if (genres.contains("pop") && genres.contains("rock")) {
			return false; // Artists cannot be active in both 'pop' and 'rock' genres.
		}
		return true;
	}

	private int getBirthYear() {
		String[] parts = Birthdate.split("-");
		if (parts.length == 3) {
			return Integer.parseInt(parts[2]);
		}
		return 0; // Return 0 for invalid birth date.
	}

	private boolean canChangeAwards() {
		int birthYear = getBirthYear();
		for (String award : Awards) {
			String[] parts = award.split(", ");
			if (parts.length != 2) {
				return false;
			}
			int awardYear = Integer.parseInt(parts[0]);
			if (birthYear < 2000 && awardYear < 2000) {
				return false; // Awards given before 2000 cannot be changed.
			}
		}
		return true;
	}

}
