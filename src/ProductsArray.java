import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ProductsArray {
    private String[] products;

    public ProductsArray(){
        this.products = new String[20];
        Arrays.fill(products, "");
        products[0] = "Leche Entera";
        products[1] = "Yogurt alpina";
        products[2] = "Yogo Yogo";
        products[3] = "BonYour alpina";
        products[4] = "Papas super Rica";
        products[5] = "Cheetos Boliqueso";
        products[6] = "Papas Yupi Golpe con todo";
        products[7] = "Tocineta Freud";
        products[8] = "Mortadela Zenu";
        products[9] = "Jamon Rica";
        products[10] = "Salchicha Rica";
        products[11] = "Chorizo ternera";
        products[12] = "Huevos tipo A";
        products[13] = "Queso Lactimuu";
        products[14] = "Queso alpina casero";
        products[15] = "Margarina la fina";
        products[16] = "Mantequilla Rama";
        products[17] = "Kumis";
        products[18] = "Avena alpina";
        products[19] = "Gelatina Lacteos";
    }

    public void showProductsByLetter(char letter){
        System.out.printf("Productos que comienzan por la letra '%c':%n", letter);
        for (String product : products){
            if(!product.isEmpty() && Character.toUpperCase(product.charAt(0))== Character.toUpperCase(letter)){
                System.out.println(product);
            }
        }
    }

    public void printAlphabeticalOrder() {
        Arrays.sort(products);
        System.out.println("lista de productos ordenada: ");
        for(String product:products){
            if(!product.isEmpty()){
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
     ProductsArray productsArray = new ProductsArray();

     productsArray.showProductsByLetter('a');

     productsArray.printAlphabeticalOrder();
    }
}