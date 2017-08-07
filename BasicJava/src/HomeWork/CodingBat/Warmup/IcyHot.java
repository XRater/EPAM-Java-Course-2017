package HomeWork.CodingBat.Warmup;

class IcyHot {

    public boolean icyHot(int temp1, int temp2) {
        return Math.max(temp1, temp2) > 100 && Math.min(temp1, temp2) < 0;
    }

}
