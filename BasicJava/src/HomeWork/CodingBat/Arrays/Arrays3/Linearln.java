package HomeWork.CodingBat.Arrays.Arrays3;

public class Linearln {

    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (j == inner.length)
                return true;
            if (outer[i] > inner[j])
                return false;
            if (outer[i] == inner[j])
                j++;
        }
        return j == inner.length;
    }

}
