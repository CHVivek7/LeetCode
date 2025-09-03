class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int tailOnesCount = 0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                tailOnesCount++;
            } else {
                break;
            }
        }

        return tailOnesCount % 2 == 0 ? true : false;
    }
}