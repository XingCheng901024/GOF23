package car;

import java.util.Date;

/**
 * Created by Thinkpad on 2018/12/21.
 */
public class Benz {

    private Date createTime;
    private String place;
    private String creator;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    class Engine{
        private String type;
        private int Cylinder;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCylinder() {
            return Cylinder;
        }

        public void setCylinder(int cylinder) {
            Cylinder = cylinder;
        }
    }

}
