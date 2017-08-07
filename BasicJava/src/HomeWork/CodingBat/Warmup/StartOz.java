package HomeWork.CodingBat.Warmup;

class StartOz {

    public String startOz(String str) {
        return (str.length() >= 1 && str.charAt(0) == 'o' ? "o" : "") + (str.length() >= 2 && str.charAt(1) == 'z' ?
                "z" : "");
    }

}
