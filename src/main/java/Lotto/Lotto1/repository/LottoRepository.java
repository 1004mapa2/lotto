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

    private Map<String, Integer> lastNumbers = new HashMap<>();
//    private static Map<String, Map<String, Integer>> mainStore = new HashMap<>();

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
    }
}
