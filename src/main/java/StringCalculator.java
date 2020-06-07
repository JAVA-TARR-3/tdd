public class StringCalculator {
    public int add(String numbers) throws Exception {
        if (numbers.length() == 0) {
            return 0;
        }

        int result = 0;

        String[] strings = numbers.split(",");

        if (strings.length > 2) {
            throw new Exception();
        }

        for (String s : strings) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}
