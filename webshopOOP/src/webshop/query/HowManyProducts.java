package webshop.query;

import webshop.MenuAction;

public class HowManyProducts implements MenuAction {
    private static final String SELECT_TYPES_OF_PRODUCTS_WITHOUT_0_QUANTITY = "SELECT COUNT(item_name) FROM webshop.shop_item WHERE quantity <> 0";
    @Override
    public void close() throws Exception {

    }

}
