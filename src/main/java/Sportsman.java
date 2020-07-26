
import java.io.Serializable;


public class Sportsman implements Serializable {
    private String name;
    private String height;
    private String weight;
    private String imgurl;

    public Sportsman(String name, String height, String weight, String imgurl) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.imgurl = imgurl;
    }

    public Sportsman() {
        this.name = "";
        this.height = "";
        this.weight = "";
        this.imgurl = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
