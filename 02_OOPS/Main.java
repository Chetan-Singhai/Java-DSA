public class Main {
    public static void main(String[] args) {
        // Define a class inside the main method
        class InnerClass {
            private String message;

            public InnerClass(String message) {
                this.message = message;
            }

            public void displayMessage() {
                System.out.println("InnerClass message: " + message);
            }
        }

        // Create an instance of the inner class and use it
        InnerClass innerObj = new InnerClass("Hello, I'm an inner class!");
        innerObj.displayMessage();
    }
}