package Test;

public class Candy implements CandyInterface {

    protected String name = 'name';
    protected String flavor = 'name';
    protected boolean isWrapped = true;

    public void Candy(String name, String flavor, boolean isWrapped) {
        this.name = name;
        this.flavor = flavor;
        this.isWrapped = isWrapped;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getflavor() {
        return flavor;
    }

    public void setflavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean getisWrapped() {
        return isWrapped;
    }

    public void setisWrapped(boolean isWrapped) {
        this.isWrapped = isWrapped;
    }

    @Override
    public void displayCandy() {
        System.out.print(true);
    }

    @Override
    public String toString() {
        return "name=" + getname() + " flavor=" + getflavor() +" isWrapped=" + getisWrapped();
    }
    

    @Override
    public void displayCandy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayCandy'");
    }
}

