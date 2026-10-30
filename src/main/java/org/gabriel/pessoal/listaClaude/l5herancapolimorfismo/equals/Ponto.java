package org.gabriel.pessoal.listaClaude.l5herancapolimorfismo.equals;

import java.util.Objects;

public class Ponto {
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ponto ponto)) return false;
        return Double.compare(x, ponto.x) == 0 && Double.compare(y, ponto.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
