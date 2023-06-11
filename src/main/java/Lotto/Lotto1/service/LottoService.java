package Lotto.Lotto1.service;

import Lotto.Lotto1.domain.InputNumberDto;
import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoDomain lottoNumberCreate(InputNumberDto inputNumberDto) {
        LottoDomain lottoDomain = new LottoDomain();


        Set<Integer> numbers = new HashSet<>();
        numbers.add(inputNumberDto.getNumber1());
        numbers.add(inputNumberDto.getNumber2());
        numbers.add(inputNumberDto.getNumber3());
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

    public List<LottoDomain> getAll() {
        return lottoRepository.listAll();
    }

    public List<LottoDomain> getFive() {
        return lottoRepository.last5();
    }

    public void saveLotto(LottoDomain lottoDomain) {
        lottoRepository.save(lottoDomain);
    }

    public void lottoStoreClear() {
        lottoRepository.clear();
    }
}
