package model;

public class Printer {
    public void print() {
        System.out.println("打印文件");
    }

    public static void main(String[] args) {
        Printer colorPrinter = new ColorPrinter();
        colorPrinter.print();
        Printer notColorPrinter = new NotColorPrinter();
        notColorPrinter.print();
    }
}
