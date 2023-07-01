package sg.edu.np.mad.madpratical;

public class User {
    String username;
    String description;
    int id;
    boolean followed;
    public String getuser() {
        return username;
    }
    public void setuser(String username) {
        this.username = username;
    }

    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }

    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public boolean following() {
        return followed;
    }
    public void setfollowing(boolean following) {
        this.followed = following;
    }
}