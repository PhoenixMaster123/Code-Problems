import java.util.List;

public class VendorsBox {
        public Vendor findBestVendor(String articleId) {
            List<Vendor> vendors = Vendor.getVendorsForArticle(articleId);
            if (vendors.isEmpty()) return null;

            Vendor bestVendor = vendors.get(0); // Initialize with the first vendor

            for (Vendor vendor : vendors) {
                ArticleOffer offer = vendor.getArticleOffer(articleId);
                ArticleOffer bestOffer = bestVendor.getArticleOffer(articleId);

                if (offer.getPrice() < bestOffer.getPrice() ||
                        (offer.getPrice() == bestOffer.getPrice() &&
                                offer.getShippingTime() < bestOffer.getShippingTime()) ||
                        (offer.getPrice() == bestOffer.getPrice() &&
                                offer.getShippingTime() == bestOffer.getShippingTime() &&
                                vendor.getRating() > bestVendor.getRating()) ||
                        (offer.getPrice() == bestOffer.getPrice() &&
                                offer.getShippingTime() == bestOffer.getShippingTime() &&
                                vendor.getRating() == bestVendor.getRating() &&
                                vendor.getNumberOfRatings() > bestVendor.getNumberOfRatings())) {
                    bestVendor = vendor;
                }
            }

            return bestVendor;
        }

        public Vendor findFairBestVendor(String articleId) {
            List<Vendor> vendors = Vendor.getVendorsForArticle(articleId);
            if (vendors.isEmpty()) return null;

            Vendor lowestPriceVendor = vendors.get(0); // Initialize with the first vendor with lowest price
            double lowestPrice = lowestPriceVendor.getArticleOffer(articleId).getPrice();

            for (Vendor vendor : vendors) {
                double price = vendor.getArticleOffer(articleId).getPrice();
                if (price < lowestPrice) {
                    lowestPrice = price;
                    lowestPriceVendor = vendor;
                }
            }

            // Randomly select one of the vendors with the lowest price
            return lowestPriceVendor;
        }
}
