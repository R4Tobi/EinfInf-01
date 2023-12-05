package OOP.Presents;

public class ChristmasPresents {
    public static void main(String[] args) {
        Present chardonnay = new Cylinder(0.3,0.09);
        Present cuvee = new Cylinder(0.37, 0.078);
        Present sphere1 = new Ball(0.3);
        Present sphere2 = new Ball(0.4);
        Present dwarf = new Cylinder(0.2, 0.1);
        Present teddy = new Cylinder(0.25,0.12);
        Present gtaVI = new Cuboid(0.2,0.15,0.02);
        Present R6Siege = new Cuboid(0.22, 0.15, 0.02);
        Present Minecraft = new Cuboid(0.2,0.15,0.025);

        double neededPaper =
                chardonnay.computePaperSize()
                + cuvee.computePaperSize()
                + sphere1.computePaperSize()
                + sphere2.computePaperSize()
                + dwarf.computePaperSize()
                + teddy.computePaperSize()
                + gtaVI.computePaperSize()
                + R6Siege.computePaperSize()
                + Minecraft.computePaperSize();
        System.out.println(neededPaper + "m^2");
        System.out.println(neededPaper * 1.67 + "€");
    }
}
