import java.util.ArrayList;
public Class Main{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        //Adding elements
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");
fruits.add("Strobery");
//Accessind elements

System.out.println("first fruit: " + friuts.get(0));
//iterating elements
for(String fruit : fruits) {
    System.out.println(fruit);
}
//Removing elements
fruits.remove("Banana");
System.out.println("After removal: " +fruits);
} 