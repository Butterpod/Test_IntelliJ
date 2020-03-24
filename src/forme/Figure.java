package forme;

import java.util.Objects;

public class Figure {
    private int t;
    private int y;
    private int b;


    public Figure(int t, int y, int b) {
        this.t = t;
        this.y = y;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "t=" + t +
                ", y=" + y +
                ", b=" + b +
                '}';
    }

    public int getT() {
        return t;
    }

    public int getY() {
        return y;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return t == figure.t &&
                y == figure.y &&
                b == figure.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, y, b);
    }
}
