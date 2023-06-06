package Lotto.Lotto1.repository;

import Lotto.Lotto1.domain.LottoDomain;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LottoRepository {

    private static Map<String, Integer> store1 = new HashMap<>();
    private static Map<String, Integer> store2 = new HashMap<>();
    private static Map<String, Integer> store3 = new HashMap<>();
    private static Map<String, Integer> store4 = new HashMap<>();
    private static Map<String, Integer> store5 = new HashMap<>();
    private static Map<String, Integer> store6 = new HashMap<>();
    private static Map<String, Integer> store7 = new HashMap<>();
    private static Map<String, Integer> store8 = new HashMap<>();

    private Map<String, Integer> lastNumbers = new HashMap<>();

    public LottoRepository() {
        store1.put("1", 0);
        store1.put("2", 0);
        store1.put("3", 0);
        store1.put("4", 0);
        store1.put("5", 0);
        store1.put("6", 0);

        store2.put("1", 0);
        store2.put("2", 0);
        store2.put("3", 0);
        store2.put("4", 0);
        store2.put("5", 0);
        store2.put("6", 0);

        store3.put("1", 0);
        store3.put("2", 0);
        store3.put("3", 0);
        store3.put("4", 0);
        store3.put("5", 0);
        store3.put("6", 0);

        store4.put("1", 0);
        store4.put("2", 0);
        store4.put("3", 0);
        store4.put("4", 0);
        store4.put("5", 0);
        store4.put("6", 0);

        store5.put("1", 0);
        store5.put("2", 0);
        store5.put("3", 0);
        store5.put("4", 0);
        store5.put("5", 0);
        store5.put("6", 0);

        store6.put("1", 0);
        store6.put("2", 0);
        store6.put("3", 0);
        store6.put("4", 0);
        store6.put("5", 0);
        store6.put("6", 0);

        store7.put("1", 0);
        store7.put("2", 0);
        store7.put("3", 0);
        store7.put("4", 0);
        store7.put("5", 0);
        store7.put("6", 0);

        store8.put("1", 0);
        store8.put("2", 0);
        store8.put("3", 0);
        store8.put("4", 0);
        store8.put("5", 0);
        store8.put("6", 0);

        lastNumbers.put("1", 0);
        lastNumbers.put("2", 0);
        lastNumbers.put("3", 0);
        lastNumbers.put("4", 0);
        lastNumbers.put("5", 0);
        lastNumbers.put("6", 0);
    }

    public Map<String, Integer> store1Get() {
        return store1;
    }

    public Map<String, Integer> store2Get() {
        return store2;
    }

    public Map<String, Integer> store3Get() {
        return store3;
    }

    public Map<String, Integer> store4Get() {
        return store4;
    }

    public Map<String, Integer> store5Get() {
        return store5;
    }

    public Map<String, Integer> store6Get() {
        return store6;
    }

    public Map<String, Integer> store7Get() {
        return store7;
    }

    public Map<String, Integer> store8Get() {
        return store8;
    }

    public void store1Save(LottoDomain lottoDomain) {
        store1.replace("1", lottoDomain.getScreenNumber1());
        store1.replace("2", lottoDomain.getScreenNumber2());
        store1.replace("3", lottoDomain.getScreenNumber3());
        store1.replace("4", lottoDomain.getScreenNumber4());
        store1.replace("5", lottoDomain.getScreenNumber5());
        store1.replace("6", lottoDomain.getScreenNumber6());
    }

    public void store2Save() {
        store2.replace("1", store1.get("1"));
        store2.replace("2", store1.get("2"));
        store2.replace("3", store1.get("3"));
        store2.replace("4", store1.get("4"));
        store2.replace("5", store1.get("5"));
        store2.replace("6", store1.get("6"));
    }

    public void store3Save() {
        store3.replace("1", store2.get("1"));
        store3.replace("2", store2.get("2"));
        store3.replace("3", store2.get("3"));
        store3.replace("4", store2.get("4"));
        store3.replace("5", store2.get("5"));
        store3.replace("6", store2.get("6"));
    }

    public void store4Save() {
        store4.replace("1", store3.get("1"));
        store4.replace("2", store3.get("2"));
        store4.replace("3", store3.get("3"));
        store4.replace("4", store3.get("4"));
        store4.replace("5", store3.get("5"));
        store4.replace("6", store3.get("6"));
    }

    public void store5Save() {
        store5.replace("1", store4.get("1"));
        store5.replace("2", store4.get("2"));
        store5.replace("3", store4.get("3"));
        store5.replace("4", store4.get("4"));
        store5.replace("5", store4.get("5"));
        store5.replace("6", store4.get("6"));
    }

    public void store6Save() {
        store6.replace("1", store5.get("1"));
        store6.replace("2", store5.get("2"));
        store6.replace("3", store5.get("3"));
        store6.replace("4", store5.get("4"));
        store6.replace("5", store5.get("5"));
        store6.replace("6", store5.get("6"));
    }

    public void store7Save() {
        store7.replace("1", store6.get("1"));
        store7.replace("2", store6.get("2"));
        store7.replace("3", store6.get("3"));
        store7.replace("4", store6.get("4"));
        store7.replace("5", store6.get("5"));
        store7.replace("6", store6.get("6"));
    }

    public void store8Save() {
        store8.replace("1", store7.get("1"));
        store8.replace("2", store7.get("2"));
        store8.replace("3", store7.get("3"));
        store8.replace("4", store7.get("4"));
        store8.replace("5", store7.get("5"));
        store8.replace("6", store7.get("6"));
    }

    public Map<String, Integer> lastNumbersGet() {
        return lastNumbers;
    }

    public void lastNumbersSave(LottoDomain lottoDomain) {
        lastNumbers.put("1", lottoDomain.getScreenNumber1());
        lastNumbers.put("2", lottoDomain.getScreenNumber2());
        lastNumbers.put("3", lottoDomain.getScreenNumber3());
        lastNumbers.put("4", lottoDomain.getScreenNumber4());
        lastNumbers.put("5", lottoDomain.getScreenNumber5());
        lastNumbers.put("6", lottoDomain.getScreenNumber6());
    }

    public void clearAllStore() {
        store1.put("1", 0);
        store1.put("2", 0);
        store1.put("3", 0);
        store1.put("4", 0);
        store1.put("5", 0);
        store1.put("6", 0);

        store2.put("1", 0);
        store2.put("2", 0);
        store2.put("3", 0);
        store2.put("4", 0);
        store2.put("5", 0);
        store2.put("6", 0);

        store3.put("1", 0);
        store3.put("2", 0);
        store3.put("3", 0);
        store3.put("4", 0);
        store3.put("5", 0);
        store3.put("6", 0);

        store4.put("1", 0);
        store4.put("2", 0);
        store4.put("3", 0);
        store4.put("4", 0);
        store4.put("5", 0);
        store4.put("6", 0);

        store5.put("1", 0);
        store5.put("2", 0);
        store5.put("3", 0);
        store5.put("4", 0);
        store5.put("5", 0);
        store5.put("6", 0);

        store6.put("1", 0);
        store6.put("2", 0);
        store6.put("3", 0);
        store6.put("4", 0);
        store6.put("5", 0);
        store6.put("6", 0);

        store7.put("1", 0);
        store7.put("2", 0);
        store7.put("3", 0);
        store7.put("4", 0);
        store7.put("5", 0);
        store7.put("6", 0);

        store8.put("1", 0);
        store8.put("2", 0);
        store8.put("3", 0);
        store8.put("4", 0);
        store8.put("5", 0);
        store8.put("6", 0);
    }
}
