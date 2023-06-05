package Lotto.Lotto1.service;

import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoDomain LottoNumberCreate() {
        LottoDomain lottoDomain = new LottoDomain();
        lottoDomain.setScreenNumber1((int) (Math.random() * 45 + 1));
        lottoDomain.setScreenNumber2((int) (Math.random() * 45 + 1));
        lottoDomain.setScreenNumber3((int) (Math.random() * 45 + 1));
        lottoDomain.setScreenNumber4((int) (Math.random() * 45 + 1));
        lottoDomain.setScreenNumber5((int) (Math.random() * 45 + 1));
        lottoDomain.setScreenNumber6((int) (Math.random() * 45 + 1));

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

    public Map<String, Integer> lottoStore1Get() {
        return lottoRepository.store1Get();
    }

    public Map<String, Integer> lottoStore2Get() {
        return lottoRepository.store2Get();
    }

    public Map<String, Integer> lottoStore3Get() {
        return lottoRepository.store3Get();
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
