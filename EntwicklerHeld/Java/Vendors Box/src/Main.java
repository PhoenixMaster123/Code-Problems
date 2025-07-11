public class Main {
    public static void main(String[] args) {
        // Creating vendors
        Vendor.clearVendors(); // Clear existing vendors (for demonstration purpose)

        Vendor otto = new Vendor("1", "OTTO", 4.0, 17);
        otto.addArticleOffer(new ArticleOffer("OTTO123", 22.99, 150, 1));
        Vendor fashionMint = new Vendor("2", "Fashion-Mint", 5.0, 1);
        fashionMint.addArticleOffer(new ArticleOffer("FM123", 23.99, 100, 7));
        Vendor fashionCore = new Vendor("3", "FashionCore", 4.5, 6);
        fashionCore.addArticleOffer(new ArticleOffer("FC123", 23.99, 90, 7));
        Vendor dynamic24 = new Vendor("4", "Dynamic24", 5.0, 2);
        dynamic24.addArticleOffer(new ArticleOffer("D24", 24.99, 5, 14));

        // Adding vendors to the VendorBox
        Vendor.addVendor(otto);
        Vendor.addVendor(fashionMint);
        Vendor.addVendor(fashionCore);
        Vendor.addVendor(dynamic24);

        // Finding best vendor
        VendorsBox vendorsBox = new VendorsBox();
        Vendor bestVendor = vendorsBox.findBestVendor("OTTO123"); // Provide article ID directly
        System.out.println("Best Vendor (Based on Criteria): " + bestVendor.getName());

        // Finding fair best vendor
        Vendor fairBestVendor = vendorsBox.findFairBestVendor("OTTO123"); // Provide article ID directly
        System.out.println("Fair Best Vendor: " + fairBestVendor.getName());
    }
}
