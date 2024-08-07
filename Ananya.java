class Ananya {
     String mobile;
     Knife knife;

    public Ananya(String mobile, Knife knife) {
        this.mobile = mobile;
        this.knife = knife;
    }

    public void details() {
        System.out.println("Mobile: " + mobile);
        knife.details();
    }
}