public class Greeting {
    public String greet(String... names) {

        // TODO: dodać obsługę names.length == 0

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null || names[i].equals("")) {
                names[i] = "przyjacielu";
            }
        }

        if (names.length == 1) {
            return String.format("Witaj, %s.", names[0]);
        } else {
            String stringFormat = "Witaj, %s";

//            for (int i = 1; i < names.length; i++) {
//
//                if (i == names.length - 1) {
//                    stringFormat += " i %s.";
//                    break;
//                }
//
//                stringFormat += ", %s";
//            }

            for (int i = 1; i < names.length - 1; i++) {
                stringFormat += ", %s";
            }

            stringFormat += " i %s.";

            return String.format(stringFormat, names);
        }
    }
}
