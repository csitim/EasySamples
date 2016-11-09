package coins;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class Exchange {

    public Integer exchangeWithMinimalNumberOfCoins(Integer amount) {
        int numberOfCoins = 0;

        for (Coin coin : Coin.getCoinsInDescOrder()) {
            numberOfCoins = numberOfCoins + amount / coin.getValue();
            amount = amount % coin.getValue();
        }

        return numberOfCoins;
    }
}
