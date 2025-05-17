package Practice_problem_04;

class ProductFilter {


    void filterByCategory(String category) {
        System.out.println(" category: " + category);
    }


    void filterByPriceRange(double minPrice, double maxPrice) {
        System.out.println(" price range: $" + minPrice + " - $" + maxPrice);
    }


    void filterByBrand(String brand) {
        System.out.println("brand: " + brand);
    }


    void filterByCategoryAndPriceRange(String category, double minPrice, double maxPrice) {
        System.out.println(" category: " + category + "price range: $" + minPrice + " - $" + maxPrice);
    }


    void filterByCategoryPriceRangeAndBrand(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Brand " + brand + " category: " + category + " price range: $" + minPrice + " - $" + maxPrice);
    }

    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();


        filter.filterByCategory("Electronics");
        filter.filterByPriceRange(100, 500);
        filter.filterByBrand("Nike");
        filter.filterByCategoryAndPriceRange("Fashion", 50, 300);
        filter.filterByCategoryPriceRangeAndBrand("Electronics", 500, 1000, "Apple");
    }
}