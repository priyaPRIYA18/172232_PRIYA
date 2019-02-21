package movie.com;

import java.util.ArrayList;

public class MainMovieList {

	public static void main(String[] args) {}{
	ArrayList<MovieDetails> movies=new ArrayList<>();
	MovieDetails md1=new MovieDetails("SVSC", "Mahesh","Samantha","family");
	MovieDetails md2=new MovieDetails("Bunny", "AArjun","Usha","Action");
	MovieDetails md3=new MovieDetails("Pellichoopulu", "VDevarakonda","Varmma","Business");
	MovieDetails md4=new MovieDetails("Raktacharitra", "Roy","Samantha","Action");
	MovieDetails md5=new MovieDetails("Prema", "venkatesh","Samantha","love");
	Movie_details_List mm=new Movie_details_List();
	mm.add_movie(md1);
	mm.add_movie(md2);
	mm.add_movie(md3);
	mm.add_movie(md4);
	mm.add_movie(md5);
	//smm.getMov_Name();
//System.out.println(mm.getMov_Name("SVSC"));
System.out.println(mm.find_movie_By_Genre("family"));
	
	}


}
