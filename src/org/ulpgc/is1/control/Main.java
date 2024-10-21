package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {
        PurchasingManager purchasingManager = new PurchasingManager();
        Email emailPablo = new Email("pablofer@ulpgc.es");
        purchasingManager.addCustomer("Pablo", "Fernández Suárez", emailPablo);
        purchasingManager.getCustomerList().get(0).addDeliveryAddress("América", 3, 35340, "Las Palmas");

        Email emailCarlos = new Email("carlosrod@ulpgc.es");
        purchasingManager.addCustomer("Carlos", "Rodríguez Cruz", emailCarlos);

        purchasingManager.addProduct(0, "Coche de juguete", "Coche, rojo metalizado, propulsión de retroceso", 20, ProductCategory.Toy, "2024-10-01", "2024-10-31", 20);
        purchasingManager.addProduct(1, "Camisa", "Camisa de seda, blanca, de botones", 40, ProductCategory.Clothing);

        purchasingManager.purchase(purchasingManager.getCustomerList().get(0), purchasingManager.getProductList().get(0), purchasingManager.getCustomerList().get(0).getDeliveryAddress().get(0), "123456789");
        purchasingManager.purchase(purchasingManager.getCustomerList().get(0), purchasingManager.getProductList().get(1), purchasingManager.getCustomerList().get(0).getDeliveryAddress().get(0), "123456789");

        Customer customer = purchasingManager.getCustomerList().get(0);


        System.out.println("El cliente 1 tiene " + purchasingManager.getPurchaseList(purchasingManager.getCustomerList().get(0)).size() + " reservas.");
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println("    Compras de " + customer + " (email: " + purchasingManager.getCustomerList().get(0).getEmail() + ")");
        System.out.println("************************************************************************");
        System.out.println();
        System.out.println("        Compra (cod. " + purchasingManager.getPurchaseList(customer).get(0).getId() + ")");
        System.out.println("--------------------------------");
        System.out.println("    *) Datos de la compra:");
        System.out.println("        |- Código compra: " + purchasingManager.getPurchaseList(customer).get(0).getId());
        System.out.println("        |- Realizada el día: " + purchasingManager.getPurchaseList(customer).get(0).getDate());
        System.out.println("        |- Punto de entrega: " + purchasingManager.getPurchaseList(customer).get(0).getDeliveryAddress());
        System.out.println("        |- Pago número [" + purchasingManager.getPurchaseList(customer).get(0).getPayment().getCard() + "]");
        System.out.println("            |- Cantidad: " + purchasingManager.getPurchaseList(customer).get(0).getPayment().getAmount() + " euros  (fecha del pago: " + purchasingManager.getPurchaseList(customer).get(0).getPayment().getDate() + ")");
        System.out.println("        |- Total de la compra: " + purchasingManager.getPurchaseList(customer).get(0).getPayment().getAmount() + " euros.");
        System.out.println("    *) Datos del producto:");
        System.out.println("        |- Código: " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getId());
        System.out.println("        |- Nombre: " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getName());
        System.out.println("        |- Descripcion: " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getDescription());
        System.out.println("        |- Category: " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getCategory());
        System.out.print("        |- Precio: " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getPrice());
        System.out.println(" euros.");
        System.out.println("        |- Descuento de " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getDiscount().getPercentage() + "% desde el " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getDiscount().getFrom() + " hasta el " + purchasingManager.getPurchaseList(customer).get(0).getProduct().getDiscount().getTo());
        System.out.println("--------------------------------");
    }
}