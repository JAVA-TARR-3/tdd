public class Greeting {
    public String greet(String... names) {

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null || names[i].equals("")) {
                names[i] = "przyjacielu";
            }
        }

        if (names.length == 1) {
            return String.format("Witaj, %s.", names[0]);
        } else {
            return String.format("Witaj, %s i %s.", names[0], names[1]);
        }
    }
}
