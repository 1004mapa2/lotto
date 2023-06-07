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
    private Integer sum = 0;

    public LottoRepository() {
        store1_init();
        store2_init();
        store3_init();
        store4_init();
        store5_init();
        store6_init();
        store7_init();
        store8_init();

        lastNumbers_init();
    }

    /**
     * ㅣ-----Get-----ㅣ
     */
    public Integer sumGet() {
        return sum;
    }

    public Map<String, Integer> lastNumbersGet() {
        return lastNumbers;
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

    /**
     * ㅣ-----Save-----ㅣ
     */

    public void store1Save(LottoDomain lottoDomain) {
        store1.replace("1", lottoDomain.getScreenNumber1());
        store1.replace("2", lottoDomain.getScreenNumber2());
        store1.replace("3", lottoDomain.getScreenNumber3());
        store1.replace("4", lottoDomain.getScreenNumber4());
        store1.replace("5", lottoDomain.getScreenNumber5());
        store1.replace("6", lottoDomain.getScreenNumber6());
        sum += 6;
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

    public void lastNumbersSave(LottoDomain lottoDomain) {
        lastNumbers.put("1", lottoDomain.getScreenNumber1());
        lastNumbers.put("2", lottoDomain.getScreenNumber2());
        lastNumbers.put("3", lottoDomain.getScreenNumber3());
        lastNumbers.put("4", lottoDomain.getScreenNumber4());
        lastNumbers.put("5", lottoDomain.getScreenNumber5());
        lastNumbers.put("6", lottoDomain.getScreenNumber6());
    }

    public void clearAllStore() {
        store1_init();
        store2_init();
        store3_init();
        store4_init();
        store5_init();
        store6_init();
        store7_init();
        store8_init();

        lastNumbers_init();
        sum = 0;
    }

    /**
     * 메서드 리펙토링
     */
    private void lastNumbers_init() {
        lastNumbers.put("1", null);
        lastNumbers.put("2", null);
        lastNumbers.put("3", null);
        lastNumbers.put("4", null);
        lastNumbers.put("5", null);
        lastNumbers.put("6", null);
    }

    private static void store8_init() {
        store8.put("1", null);
        store8.put("2", null);
        store8.put("3", null);
        store8.put("4", null);
        store8.put("5", null);
        store8.put("6", null);
    }

    private static void store7_init() {
        store7.put("1", null);
        store7.put("2", null);
        store7.put("3", null);
        store7.put("4", null);
        store7.put("5", null);
        store7.put("6", null);
    }

    private static void store6_init() {
        store6.put("1", null);
        store6.put("2", null);
        store6.put("3", null);
        store6.put("4", null);
        store6.put("5", null);
        store6.put("6", null);
    }

    private static void store5_init() {
        store5.put("1", null);
        store5.put("2", null);
        store5.put("3", null);
        store5.put("4", null);
        store5.put("5", null);
        store5.put("6", null);
    }

    private static void store4_init() {
        store4.put("1", null);
        store4.put("2", null);
        store4.put("3", null);
        store4.put("4", null);
        store4.put("5", null);
        store4.put("6", null);
    }

    private static void store3_init() {
        store3.put("1", null);
        store3.put("2", null);
        store3.put("3", null);
        store3.put("4", null);
        store3.put("5", null);
        store3.put("6", null);
    }

    private static void store2_init() {
        store2.put("1", null);
        store2.put("2", null);
        store2.put("3", null);
        store2.put("4", null);
        store2.put("5", null);
        store2.put("6", null);
    }

    private static void store1_init() {
        store1.put("1", null);
        store1.put("2", null);
        store1.put("3", null);
        store1.put("4", null);
        store1.put("5", null);
        store1.put("6", null);
    }
}
