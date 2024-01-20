package de.telran.module_5._2024_01_15;

import lombok.*;

/**
 * "CATEGORY": "FOOD#1",
 * "NAME": "Pasta#1",
 * "FACTORY": "Barilla#1",
 * "QUANTITY": 150,
 * "ISPACKED": true,
 * "ISADV": false,
 * "PRICE": 1.49,
 * "MARGIN": 15.0,
 * "ISDEBT": false},
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private Category category;
    private String name;
    private String factory;
    private int quantity;
    private boolean isPacked;
    private boolean isAdv;
    private double price;
    private double margin;
    private boolean isDebt;


}

enum Category {
    FOOD,
    DRINKS,
    SNACKS;
    Category() {

    }



}
// хотела фабрики тоже сделать энум и даже нашла метод как считывать данные,
// но потом увидела, что их очень много и сделала стринг
//enum Factor {
//    BARILLA ("Barilla"),
//    COCA_COLA ("Coca-Cola"),
//    LAYS ("Lays"),
//    NESTLE ("Nestle"),
//    LIPTON ("Lipton"),
//    PLANTERS ("Planters"),
//    DE_CECCO ("De Cecco"),
//    TROPICANA ("Tropicana"),
//    DORITOS ("Doritos"),
//    NATURES_WAY ("Nature's Way"),
//    PEPSI ("Pepsi"),
//    NATURE_VALLEY ("Nature Valley"),
//    WONDER ("Wonder"),
//    STARBUCKS ("Starbucks"),
//    RITZ ("Ritz"),
//    UNCLE_BENS ("Uncle Ben's"),
//    AQUAFINA ("Aquafina"),
//    ORVILLE_REDENBACHERS ("Orville Redenbacher's"),
//    DAYRYLAND ("Dairyland"),
//    PRINGLES ("Pringles"),
//    KELLOGGS ("Kellogg's"),
//    OREO ("Oreo"),
//    KRAFT ("Kraft"),
//    CHOBANI ("Chobani"),
//    RED_BULL ("Red Bull"),
//    SNYDERS_OF_HANOVER ("Snyder's of Hanover"),
//    QUAKER ("Quaker"),
//    MC_DONALDS ("McDonald's"),
//    SMART_FOOD ("Smartfood"),
//    JIF ("Jif"),
//    MINUTE_MAID ("Minute Maid"),
//    JACK_LINKS ("Jack Link's"),
//    CAMPBELLS("Campbell's"),
//
//    ;
//
//private String factory;
//
//Factor (String factory){
//    this.factory = factory;
//}
//
//Factor(){
//}
//static String byNameIgnoreCase(String string){
//    return Arrays.stream(values()).filter(f->f.name().equalsIgnoreCase(string)).toString();
//}
//
//public String getFactory(){
//    return factory;
//}
//    public void setFactor(String factor) {
//    }


