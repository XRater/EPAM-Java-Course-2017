package HomeWork.CodingBat.Strings.String2;

class CatDog {

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        int index = str.indexOf("cat");
        while (index != -1) {
            cat++;
            index = str.indexOf("cat", index + 1);
        }
        index = str.indexOf("dog");
        while (index != -1) {
            dog++;
            index = str.indexOf("dog", index + 1);
        }
        return cat == dog;
    }

}
