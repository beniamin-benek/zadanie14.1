import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Computer> computers = new LinkedList<>();

        Computer computer1 = new Computer("Arek", 1.8,2); //1.8 , 2
        Computer computer2 = new Computer("Marek", 2.4,4); //2.4 , 4
        Computer computer3 = new Computer("Marek", 2.4,8); //2.4 , 8
        Computer computer4 = new Computer("Marek", 1.8,16); //1.8 , 16

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);

        //przed sortowaniem:
        System.out.println(computers + "\n");

        //sortowanie:
        Collections.sort(computers);
        System.out.println(computers);

    }
}