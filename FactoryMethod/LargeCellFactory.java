package FactoryMethod;

public class LargeCellFactory implements CellFactory {
    @Override
    public Cell createCell() {
        return new LargeCell();
    }
}
