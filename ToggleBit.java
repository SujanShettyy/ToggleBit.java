//write a programme to toggle a bit a position ="pos" in a number "n"
public class ToggleBit {
    public static void main(String[] args) {
        int n = 12; //number of toggle a bit in
        int pos = 2; // position of the bit to toggle
        System.out.println("Original number : "+n);
        System.out.println("Bit position to toggle : "+pos);

        //toggling the bit at the specified position
        n = toggleBit(n,pos);
        System.out.println("Number after toggling bit : "+n);
    }
    public static int toggleBit (int n, int pos){

        //create a mask with only the bit at the specified position set to 1

        int mask = 1<<pos;

        //toggle the bit using XOR
        return n^mask;
    }
}
