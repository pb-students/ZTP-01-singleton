import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IPolaczenie> polaczenia = new ArrayList<IPolaczenie>();

        polaczenia.add(Baza.getPolaczenie());
        polaczenia.add(Baza.getPolaczenie());
        polaczenia.add(Baza.getPolaczenie());
        polaczenia.add(Baza.getPolaczenie());

        polaczenia.get(0).set(0, 'Z');
        polaczenia.get(0).set(1, 'T');
        polaczenia.get(0).set(2, 'P');
        for (IPolaczenie ip : polaczenia) {
            test(ip);
        }

        polaczenia.get(1).set(0,'Z');
        polaczenia.get(1).set(1,'P');
        polaczenia.get(1).set(2,'I');
        for (IPolaczenie ip : polaczenia) {
            test(ip);
        }

        polaczenia.get(2).set(0,'P');
        polaczenia.get(2).set(1,'_');
        polaczenia.get(2).set(2,'Z');
        for (IPolaczenie ip : polaczenia) {
            test(ip);
        }

        polaczenia.get(3).set(0, 'S');
        polaczenia.get(3).set(1, 'B');
        polaczenia.get(3).set(2, 'D');
        for (IPolaczenie ip : polaczenia) {
            test(ip);
        }
    }


    public static void test(IPolaczenie obj) {
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println("");
    }
}
