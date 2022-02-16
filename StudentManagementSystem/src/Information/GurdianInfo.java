package Information;
public class GurdianInfo extends StudentInfo{
    
    private int mobileNumFather;
    private int mobileNumMother;
    private String email;
    
    public GurdianInfo()
    {
        
    }

    public int getMobileNumFather() {
        return mobileNumFather;
    }

    public int getMobileNumMother() {
        return mobileNumMother;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setMobileNumFather(int mobileNumFather) {
        this.mobileNumFather = mobileNumFather;
    }

    public void setMobileNumMother(int mobileNumMother) {
        this.mobileNumMother = mobileNumMother;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
