/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan32.daftarfilm;

/**
 *
 * @author lenovo
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini dibuat untuk menampilkan daftar fil yang 
 *                     sedang tayang disertai judul, nama, dan juga durasi film.
 * 
 */
public class PBO310117122Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Daftar Film Sedang Tayang=====");
        System.out.println();
        
        Film Cinema1  = new Film();
        Cinema1.filmName     = "Venom";
        Cinema1.filmGenre    = "Action, Horror, Scifi";
        Cinema1.filmRating   = 8.5; 
        Cinema1.filmDuration = 120;
        Cinema1.nowPlaying(Cinema1.filmName, Cinema1.filmGenre,
                Cinema1.filmRating,Cinema1.filmDuration);
        
        Film Cinema2  = new Film();
        Cinema2.filmName   = "Small Foot";
        Cinema2.filmGenre  = "Animation";
        Cinema2.filmRating = 9.0;
        Cinema2.filmDuration = 96;
        Cinema2.nowPlaying(Cinema2.filmName, Cinema2.filmGenre,Cinema2.
                filmRating,Cinema2.filmDuration);
        
        Film Cinema3  = new Film();
        Cinema3.filmName     = "Crazy Rich Asian";
        Cinema3.filmGenre    = "Comedy";
        Cinema3.filmRating   = 7.8; 
        Cinema3.filmDuration = 119;
        Cinema3.nowPlaying(Cinema3.filmName, Cinema3.filmGenre,
                Cinema3.filmRating,Cinema3.filmDuration);
        
        Film Cinema4  = new Film();
        Cinema4.filmName     = "Asih";
        Cinema4.filmGenre    = "Horor";
        Cinema4.filmRating   = 7.8; 
        Cinema4.filmDuration = 100;
        Cinema4.nowPlaying(Cinema4.filmName, Cinema4.filmGenre,
                Cinema4.filmRating,Cinema4.filmDuration);
        
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
        
    }
    
}
