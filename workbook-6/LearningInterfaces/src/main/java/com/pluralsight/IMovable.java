package com.pluralsight;

import java.awt.*;

public interface IMovable {
    Point move(int xUnits, int yUnits);
    void goHome();
}
