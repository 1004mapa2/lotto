package Lotto.Lotto1.repository;

import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.repository.mybatis.LottoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class LottoRepository {

    private static List<LottoDomain> store = new ArrayList<>();
    private final LottoMapper lottoMapper;


    public List<LottoDomain> listAll() {
        return store;
    }

    public List<LottoDomain> last5() {
        if (store.size() <= 5) {
            List<LottoDomain> returnStore = new ArrayList<>(store);
            Collections.reverse(returnStore);
            return returnStore;
        } else {
            List<LottoDomain> returnStore = new ArrayList<>();
            for (int i = store.size() - 5; i < store.size(); i++) {
                returnStore.add(store.get(i));
            }
            Collections.reverse(returnStore);
            return returnStore;
        }
    }

    public void save(LottoDomain lottoDomain) {
        store.add(lottoDomain);
        lottoMapper.save(lottoDomain);
    }

    public void clear() {
        store.clear();
    }

}