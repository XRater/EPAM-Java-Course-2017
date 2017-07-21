package HomeWork.CodingBat.Strings.String3;

class WithoutString {

    public String withoutString(String base, String remove) {
        String copybase = new String(base);
        copybase = copybase.toLowerCase();
        remove = remove.toLowerCase();
        int index = copybase.indexOf(remove);
        while (index != -1) {
            base = base.substring(0, index) + base.substring(index + remove.length(), base.length());
            copybase = copybase.substring(0, index) + copybase.substring(index + remove.length(), copybase.length());
            index = copybase.indexOf(remove);
        }
        return base;
    }

}
