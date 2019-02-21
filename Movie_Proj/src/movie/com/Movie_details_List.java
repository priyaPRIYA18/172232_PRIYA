package movie.com;

import java.util.ArrayList;

public class Movie_details_List implements Comparable<Movie_details_List> {
	//Movie_details_List m =new Movie_details_List();
	ArrayList<MovieDetails>  details; 
	public Movie_details_List() {
		details = new ArrayList<>();
	}
	public void add_movie(MovieDetails md) {
		details.add(md);
	}
	public void remove_movie(MovieDetails md) {
		details.remove(md);
	}
	public void remove_allmovies(MovieDetails md) {
		details.removeAll(details);
		
	}
	public void find_movie_By_mov_Name(Movie_details_List md) {
		int index = details.indexOf(m.getMov_Name());
	}
	private Object getMov_Name() {
		// TODO Auto-generated method stub
		return null;
	}
	public Movie_details_List find_movie_By_Genre(String md) {
		Movie_details_List m=null;
		for(Movie_details_List m1:details) {
			if(m1.getGenre().equals(md))
				m=m1;;
		}
		return m;
	}

	private Object getGenre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int compareTo(Movie_details_List o) {
		// TODO Auto-generated method stub
		return 0;
	}
	


	}


