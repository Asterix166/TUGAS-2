import java.util.LinkedList;
public class ll {
    public static void main(String[] args) {
        LinkedList <String> nama = new LinkedList<>();
        nama.add("F");
        nama.add("A");
        nama.add("H");
        nama.add("R");
        nama.add("I");
        nama.add("");

        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("I");
        nama.add("K");
        nama.add("A");
        nama.add("");

        nama.add("S");
        nama.add("A");
        nama.add("N");
        nama.add("J");
        nama.add("A");
        nama.add("Y");
        nama.add("A");
        System.out.println("Output\t:"+nama+", Ukuran nama :"+nama.size());

        //1. Add karakter lain yang anda inginkan
        nama.addFirst("A");
        nama.addFirst("B");
        nama.addLast("Z");
        nama.addLast("X");
        System.out.println("Output ADD\t:"+nama+", Ukuran nama :"+nama.size());

        //2. Sisipkan karakter lain yang anda inginkan
        nama.set(0,"K");
        nama.set(7,"J");         
        nama.set(10,"H");
        nama.set(16,"D");
        System.out.println("Output SET\t:"+nama+", Ukuran nama :"+nama.size());

        //3. Hapus beberapa karakter yang ingin anda hapus
        nama.removeFirst();
        nama.removeLast();
        nama.remove(0);
        nama.remove(7);
        System.out.println("Output REMOVE\t:"+nama+", Ukuran nama :"+nama.size());

        //4. Buat fungsi POP dan PUSH pada project anda
        nama.pop();
        System.out.println("Output POP\t:"+nama+", Ukuran nama :"+nama.size());
        nama.push("F");
        System.out.println("Output PUSH\t:"+nama+", Ukuran nama :"+nama.size());
    }
}
