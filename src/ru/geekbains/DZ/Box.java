package ru.geekbains.DZ;

import java.util.ArrayList;

public class Box {
//    private String name;
    private String contents;
    private ArrayList<Fruit> boxList;

    public Box(String contents, ArrayList<Fruit> boxList) {
        this.contents = contents;
        this.boxList = boxList;
    }

    public void put(Fruit fruit) {
        if (contents == "") {contents = fruit.getName();}
        if (fruit.getName() != contents) {
            System.out.println(String.format("Sorry! You can't put an %s into an %s box.", fruit.getName(), contents));
        } else {
            boxList.add(fruit);
        }
    }

    public float getWeight() {
        float weightMultiplier = 0;
        if (contents == "apple") {
            weightMultiplier = 1;
        } else if (contents == "orange") {
            weightMultiplier = 1.5f;
        }
        return ((boxList.size()+1)*weightMultiplier);
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void pourOverTo (Box box) {
        if (this.contents == box.contents) {
            box.boxList.addAll(this.boxList);
            this.boxList.removeAll(boxList);
            contents = "";
        } else  {
            System.out.println(String.format("You can only pour %s into %s", contents, contents));
        }
    }
}
