class ReverseString {
    public String reverse(String input) {
        if(input.length() == 0) {
            return "";
        }

        return reverse(input.substring(1)) + input.charAt(0);
    } 

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        String res = r.reverse("hello");
        System.out.println("***************");
        System.out.println(res);
        System.out.println("***************");
    }
}