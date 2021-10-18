public class Baza {
    private char[] tab = new char[100];
    private static Baza obj = new Baza();

    public static Baza getInstance() {
        return obj;
    }

    public static IPolaczenie getPolaczenie() {
        return Polaczenie.getInstance();
    }

    private static class Polaczenie implements IPolaczenie {


        private Baza baza = Baza.getInstance();
        private static int idx = 0;
        private static Polaczenie[] objects = {
                new Polaczenie(),
                new Polaczenie(),
                new Polaczenie()
        };

        public static IPolaczenie getInstance() {
            IPolaczenie pol = objects[idx];
            idx = (idx + 1) % objects.length;
            return pol;
        }

        public char get(int index) {
            return baza.tab[index];
        }

        public void set(int index, char c) {
            baza.tab[index] = c;
        }

        public int length() {
            return baza.tab.length;
        }

    }
}
