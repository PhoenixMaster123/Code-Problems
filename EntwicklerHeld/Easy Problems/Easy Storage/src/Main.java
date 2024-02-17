public class Main {
    public static void main(String[] args) {
        EasyStorage storageSystem = new EasyStorage();
        storageSystem.store("Glasses", "Bookshelf");
        System.out.println("All Data: " + storageSystem.getAllData()); // Output: All Data: {Glasses=Bookshelf}
        System.out.println("Repository of Glasses: " + storageSystem.getRepository("Glasses")); // Output: Repository of Glasses: Bookshelf
        System.out.println("Items in Bookshelf: " + storageSystem.getItems("Bookshelf")); // Output: Items in Bookshelf: [Glasses]
    }
}