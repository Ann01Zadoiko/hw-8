package Main;

import chart.Area;
import chart.Chart;
import chart.Line;
import chart.Pie;
import others.Comment;
import others.OtherInst;
import others.Pen;
import others.StickyNote;
import shape.Star;
import smartArt.Cycle;

public class Main {
    public static void main(String[] args) {
        new Area().call();
        new StickyNote().call();
        new Star().call();
        new Cycle().call();
    }
}
