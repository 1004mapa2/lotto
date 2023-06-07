package Lotto.Lotto1.service;

import Lotto.Lotto1.domain.InputNumber;
import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoDomain lottoNumberCreate(InputNumber inputNumber) {
        LottoDomain lottoDomain = new LottoDomain();


        Set<Integer> numbers = new HashSet<>();
        numbers.add(inputNumber.getNumber1());
        numbers.add(inputNumber.getNumber2());
        numbers.add(inputNumber.getNumber3());
        while(numbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 45 + 1);
            numbers.add(randomNumber);
        }
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);

        lottoDomain.setScreenNumber1(list.get(0));
        lottoDomain.setScreenNumber2(list.get(1));
        lottoDomain.setScreenNumber3(list.get(2));
        lottoDomain.setScreenNumber4(list.get(3));
        lottoDomain.setScreenNumber5(list.get(4));
        lottoDomain.setScreenNumber6(list.get(5));

        return lottoDomain;
    }

    public Integer totalNumber() {
        return lottoRepository.sumGet();
    }

    public void lottoStore1Save(LottoDomain lottoDomain) {
        lottoRepository.store1Save(lottoDomain);
    }

    public void lottoStore2Save() {
        lottoRepository.store2Save();
    }

    public void lottoStore3Save() {
        lottoRepository.store3Save();
    }

    public void lottoStore4Save() {
        lottoRepository.store4Save();
    }

    public void lottoStore5Save() {
        lottoRepository.store5Save();
    }

    public void lottoStore6Save() {
        lottoRepository.store6Save();
    }

    public void lottoStore7Save() {
        lottoRepository.store7Save();
    }

    public void lottoStore8Save() {
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
}
