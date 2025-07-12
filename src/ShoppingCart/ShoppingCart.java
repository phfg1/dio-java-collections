package ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(String name, double price){
        productList.add(new Product(name, price));
        System.out.println("Produto '" + name + "' (R$" + String.format("%.2f", price) + ") adicionado ao carrinho.");
    }

    public void removeProduct(String name) {
        List<Product> productToRemove = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().equalsIgnoreCase(name)){
                productToRemove.add(p);
            }
        } 
        if (!productToRemove.isEmpty()) {
            productList.removeAll(productToRemove);
            System.out.println("Produto(s) '" + name + "' removido(s) do carrinho.");
        } else {
            System.out.println("Nenhum produto '" + name + "' encontrado para remover.");
        }
    }

    public int totalProducts(){
        return productList.size();
    }

    public void productsInCart() {
        if (productList.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("\nProdutos no Carrinho\n");
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    public double totalPrice() {
        double totalPrice = 0.0;
        for(Product p : productList) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1 - Adicionar produto ao carrinho");
            System.out.println("2 - Remover produto do carrinho");
            System.out.println("3 - Verificar produtos no carrinho");
            System.out.println("5 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 : {
                    System.out.println("Qual o nome do produto");
                    String productName = scanner.next();
                    System.out.println("Qual o valor do produto?");
                    double productPrice = scanner.nextDouble();

                    cart.addProduct(productName, productPrice);
                    break;
                }
                case 2: {
                    System.out.println("Qual produto deseja remover?");
                    cart.removeProduct(scanner.next());
                    break;
                }
                case 3: {
                    cart.productsInCart();
                    System.out.println("\nO valor total de sua compra é de: " + cart.totalPrice() + "\n");
                    break;
                }
                case 4: {
                    System.out.println("Saindo...");
                    break;
                }
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (option != 4);
        scanner.close();
    }
}
