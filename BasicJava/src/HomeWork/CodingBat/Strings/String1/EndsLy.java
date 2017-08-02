package HomeWork.CodingBat.Strings.String1;

class EndsLy {

    public boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2, str.length()).equals("ly");
    }

}
