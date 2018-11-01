package Level_1.Part_3.Bookstore;

public abstract class AbstractPrintedEdition {

    protected String id;
    private int purchaseValue;//Закупочная стоимость Стоимость продажи
    protected int salesValue;   //Стоимость продажи
    private int tradingMargin ; // Торговая маржа

    private int getTradingMargin() {
        tradingMargin=salesValue-purchaseValue;
        return tradingMargin; }
}
