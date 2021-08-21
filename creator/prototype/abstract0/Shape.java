package creator.prototype.abstract0;

import java.util.Date;

public abstract class Shape implements Cloneable{
    private Date date = new Date();
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape clone = null;

        try{
            clone = (Shape) super.clone();
            clone.date = (Date) date.clone();
        }catch (CloneNotSupportedException|ClassCastException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
