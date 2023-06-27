package Java_OOP._07InterfacesAndAbstractionLab.jo01CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;
    String getModel();

    String getColor();

    int getHorsePower();

    String  getCountryProduced();
}
