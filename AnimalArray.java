class AnimalArray {
    public static void main(String[] args) {
		
        String[] animals = new String[20];

       
        animals[0] = "Lion";
        animals[1] = "Tiger";
        animals[2] = "Elephant";
        animals[3] = "Giraffe";
        animals[4] = "Zebra";
        animals[5] = "Kangaroo";
        animals[6] = "Panda";
        animals[7] = "Koala";
        animals[8] = "Penguin";
        animals[9] = "Cheetah";
        animals[10] = "Hippo";
        animals[11] = "Rhinoceros";
        animals[12] = "Bear";
        animals[13] = "Monkey";
        animals[14] = "Gorilla";
        animals[15] = "Elephant";
        animals[16] = "Wolf";
        animals[17] = "Fox";
        animals[18] = "Deer";
        animals[19] = "Sloth";

        System.out.println("List of Animal Names:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Element " + i + ": " + animals[i]);
        }
    }
}