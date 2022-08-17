package com.LineComparison;

import java.util.Scanner;

public class LineComparison {
    float x1, x2, x3, x4, y1, y2, y3, y4;
    LineComparison(float x1, float x2, float x3, float x4, float y1, float y2, float y3, float y4){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }
    void lengths() {
        Double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        if (lineLength1.equals(lineLength2)) {
            System.out.println("Both lines are equal");
        }else if (compare(lineLength1, lineLength2)) {
            System.out.println("Length 1 is greater than Length 2");
        }else {
            System.out.println("Length 2 is greater than Length 1");
        }
    }

    private boolean compare(Double lineLength1, Double lineLength2) {
        return false;
    }
    public static void main(String[] args) {

        LineComparison lc = new LineComparison(4,6,7,2,3,4,7,1);

        lc.lengths();

    }
}


