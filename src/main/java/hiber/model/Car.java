package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
@Component
@Entity
@Table(name = "car")
public class Car implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Column
    private String model;
    @Column
    private int series;

    public Car(User user, String model, int series) {
        this.user = user;
        this.model = model;
        this.series = series;
    }

    public Car() {

    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
               "user=" + user +
               ", model='" + model + '\'' +
               ", series=" + series +
               '}';
    }


}


