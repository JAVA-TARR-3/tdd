import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greeting {
    public String greet(String... names) {

        // TODO: dodać obsługę names.length == 0

        List<String> formattedNames = new ArrayList<>();

        for (String name : names) {
            if (name != null) {
                String[] stringArray = name.split(",");

                for (String stringArrayItem : stringArray) {
                    formattedNames.add(stringArrayItem.trim());
                }
            } else {
                formattedNames.add(name);
            }
        }

        // String[] newNames = (String[]) formattedNames.toArray();

        for (int i = 0; i < formattedNames.size(); i++) {
            if (formattedNames.get(i) == null || formattedNames.get(i).equals("")) {
                formattedNames.set(i, "przyjacielu");
            }
        }

        if (formattedNames.size() == 1) {
            return String.format("Witaj, %s.", formattedNames.toArray());
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

            for (int i = 1; i < formattedNames.size() - 1; i++) {
                stringFormat += ", %s";
            }

            stringFormat += " i %s.";

            return String.format(stringFormat, formattedNames.toArray());
        }
    }
}
