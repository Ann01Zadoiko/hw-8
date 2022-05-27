package Main;

import chart.Chart;
import chart.Line;
import chart.Pie;
import others.Comment;
import others.OtherInst;
import others.Pen;

public class Main {
    public static void main(String[] args) {
        Chart line = new Line();
        line.call();
        Pie pie = new Pie();
        pie.call();

        OtherInst comment = new Comment();
        System.out.println(comment.call());
        Pen pen = new Pen();
        System.out.println(pen.call());
    }
}
