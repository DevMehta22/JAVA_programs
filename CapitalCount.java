class CapitalCount {
    public static void main(String[] args) {
        String str = "I am uSing Java PRogramminG lanGuage";
        String[] arr = str.split(" ");
        int capitalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if (Character.isUpperCase(ch)) {
                capitalCount++;
            }
        }
        System.out.println("Number of words that starting with capital letters:" + capitalCount);
    }
}
