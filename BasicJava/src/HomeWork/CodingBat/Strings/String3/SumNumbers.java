package HomeWork.CodingBat.Strings.String3;

class SumNumbers {

    public int sumNumbers(String str) {
        int s = 0;
        boolean inNumber = false;
        int numStart = -1;
        for (int i = 0; i < str.length(); i++) {
            if (inNumber) {
                if (!Character.isDigit(str.charAt(i))) {
                    s += Integer.parseInt(str.substring(numStart, i));
                    inNumber = false;
                }
            } else {
                if (Character.isDigit(str.charAt(i))) {
                    numStart = i;
                    inNumber = true;
                }
            }
        }
        if (inNumber) {
            s += Integer.parseInt(str.substring(numStart, str.length()));
        }
        return s;
    }

}
