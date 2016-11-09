package coins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public enum Coin {

    ONE(1), TWO(2), FIVE(5), TEN(10), TWELVE(20), FIFTY(50), HUNDRED(100), TWO_HUNDRED(200);

    private final int value;

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<Coin> getCoinsInDescOrder() {
        List<Coin> descOrderList = new ArrayList<>();
        descOrderList.addAll(Arrays.asList(Coin.values()));
        Collections.sort(descOrderList, (o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        return descOrderList;
    }
}
