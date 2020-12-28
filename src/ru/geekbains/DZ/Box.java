package ru.geekbains.DZ;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<?>>{
//    private String name;
    private String contents;
    private ArrayList<T> boxList;

    public ArrayList<T> getBoxList() {
        return boxList;
    }

    public Box() {
//        this.contents = contents;
        this.boxList = new ArrayList<T>();
    }

    public void put(T fruit) {
//        if (contents == "") {contents = fruit.getName();}
//        if (fruit.getName() != contents) {
//            System.out.println(String.format("Sorry! You can't put an %s into an %s box.", fruit.getName(), contents));
//        } else {
            boxList.add(fruit);
//        }
    }

    public float getWeight() {
//        float weightMultiplier = 0;
//        if (contents == "apple") {
//            weightMultiplier = 1;
//        } else if (contents == "orange") {
//            weightMultiplier = 1.5f;
//        }
        return (boxList.size() * boxList.get(0).getWeight());
    }

    public boolean compare(Box<?> otherBox) {
         float currWeight = boxList.get(0).getWeight() * boxList.size();
         float otherWeight = otherBox.getBoxList().get(0).getWeight() * otherBox.getBoxList().size();
         return currWeight == otherWeight;
//        if (this.getWeight() == otherBox.getWeight()) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void pourOverTo (Box<T> otherBox) {
//        if (this.contents == otherBox.contents) {
            otherBox.boxList.addAll(this.boxList);
            this.boxList.clear();
//            contents = "";
//        } else  {
//            System.out.println(String.format("You can only pour %s into %s", contents, contents));
//        }
    }

    @Override
    public int compareTo(Box<?> o) {
        return 0;
    }
}
