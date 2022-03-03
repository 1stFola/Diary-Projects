package DiaryClassProject;

import java.util.ArrayList;

public class Diary {

    private String ownerName;
    private ArrayList<Gist> gists = new ArrayList<>();
    private ArrayList<Gist> hotGists = new ArrayList<>();
    private String password;

    public Diary(String name, String secretKey) {
        ownerName = name;
        password = secretKey;

    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Gist> getGists() {
        return gists;
    }
    public ArrayList<Gist> getHotGists() {
        return gists;
    }

    public void addNewGist(String title, String gistProper, String secretKey) {
        // verify password is correct
        // if correct
        // create new gist
        //add gist to entries
        //else throw

        if (secretKey.equals(password)){
            Gist gist = new Gist(title, gistProper);
            gists.add(gist);
        }
        else {
            throw new IllegalArgumentException("Your password is wrong my friend");
        }
    }
   public void setPassword(String password) {
        this.password = password;
   }
   public String getPassword(){
        return password;
   }

   public Gist findGistByTitle(String gistTitle) {
       for (Gist gist : gists) {
           if (gist.getTitle().equalsIgnoreCase(gistTitle)){
               return gist;
           }
       }
//       throw new IllegalArgumentException("Gist not found");
       return null;
   }

   public Gist viewAllGist(String title, String gistProper){
       Gist gist = new Gist(title, gistProper);
       gists.add(gist);
       gists.add(gist);
       gists.add(gist);

       for(Gist gistToFind : gists) {
           System.out.println(gistToFind);
       }
       return gist;
   }

   public void deleteGist(String title){
        for( Gist gist : gists){
            if (gist.getTitle().equalsIgnoreCase(title)){
                gists.remove(gist);
                return;
            }
        }
        throw new IllegalArgumentException("Gist Not Found");
   }


    @Override
    public String toString() {
        return "Diary{" +
                "ownerName='" + ownerName + '\'' +
                ", gists=" + gists +
                ", password='" + password + '\'' +
                '}';
    }

    public void addToFavourite(String favourite) {
        for (Gist gist : gists){
            if (gist.getTitle().equalsIgnoreCase(favourite)){
                hotGists.add(gist);
            }
            else {
                throw new IllegalArgumentException("No gist with that title");
        }

    }
}}