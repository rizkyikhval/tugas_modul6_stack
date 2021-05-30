
package Stack;

public class TumpukanAPP {
    public static void main(String[] args) {
        Tumpukan newStack = new Tumpukan(10);
        newStack.push(50);
        newStack.baca();
        newStack.push(100);
        newStack.baca();
        newStack.pop();
        newStack.baca();
        newStack.push(60);
        newStack.baca();
        newStack.push(80);
        newStack.baca();
        newStack.pop();
        newStack.baca();
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop);
    }
        
}
