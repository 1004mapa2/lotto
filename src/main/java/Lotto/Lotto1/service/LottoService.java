package Lotto.Lotto1.service;

import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoDomain LottoNumberCreate() {
        LottoDomain lottoDomain = new LottoDomain();

        List<Integer> list = getRandomNumbers();

        lottoDomain.setScreenNumber1(list.get(0));
        lottoDomain.setScreenNumber2(list.get(1));
        lottoDomain.setScreenNumber3(list.get(2));
        lottoDomain.setScreenNumber4(list.get(3));
        lottoDomain.setScreenNumber5(list.get(4));
        lottoDomain.setScreenNumber6(list.get(5));

        return lottoDomain;
    }

    public void LottoStore1Save(LottoDomain lottoDomain) {
        lottoRepository.store1Save(lottoDomain);
    }

    public void LottoStore2Save() {
        lottoRepository.store2Save();
    }

    public void LottoStore3Save() {
        lottoRepository.store3Save();
    }

    public void LottoStore4Save() {
        lottoRepository.store4Save();
    }

    public void LottoStore5Save() {
        lottoRepository.store5Save();
    }

    public void LottoStore6Save() {
        lottoRepository.store6Save();
    }

    public void LottoStore7Save() {
        lottoRepository.store7Save();
    }

    public void LottoStore8Save() {
        lottoRepository.store8Save();
    }

    public Map<String, Integer> lottoStore1Get() {
        return lottoRepository.store1Get();
    }

    public Map<String, Integer> lottoStore2Get() {
        return lottoRepository.store2Get();
    }

    public Map<String, Integer> lottoStore3Get() {
        return lottoRepository.store3Get();
    }

    public Map<String, Integer> lottoStore4Get() {
        return lottoRepository.store4Get();
    }

    public Map<String, Integer> lottoStore5Get() {
        return lottoRepository.store5Get();
    }

    public Map<String, Integer> lottoStore6Get() {
        return lottoRepository.store6Get();
    }

    public Map<String, Integer> lottoStore7Get() {
        return lottoRepository.store7Get();
    }

    public Map<String, Integer> lottoStore8Get() {
        return lottoRepository.store8Get();
    }


    public void lastNumbersSave(LottoDomain lottoDomain) {
        lottoRepository.lastNumbersSave(lottoDomain);
    }

    public Map<String, Integer> lastNumbersGet() {
        return lottoRepository.lastNumbersGet();
    }

    public void lottoStoreClear() {
        lottoRepository.clearAllStore();
    }

    /* 중복 없는 랜덤 숫자 뽑기 */
    private static List<Integer> getRandomNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 45 + 1);
            numbers.add(randomNumber);
        }
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);
        return list;
    }
}
