package HomeWork.CodingBat.Strings.String3;

class WithoutString {

    public String withoutString(String base, String remove) {
        String copyBase = new String(base);
        copyBase = copyBase.toLowerCase();
        remove = remove.toLowerCase();
        int index = copyBase.indexOf(remove);
        while (index != -1) {
            base = base.substring(0, index) + base.substring(index + remove.length(), base.length());
            copyBase = copyBase.substring(0, index) + copyBase.substring(index + remove.length(), copyBase.length());
            index = copyBase.indexOf(remove);
        }
        return base;
    }

}
