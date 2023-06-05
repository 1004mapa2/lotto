package Lotto.Lotto1.controller;

import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/")
    public String stay(Model model) {
        Map<String, Integer> lastNumbersList = lottoService.lastNumbersGet();
        model.addAttribute("lastNumbersList", lastNumbersList);
        Map<String, Integer> getStore1 = lottoService.lottoStore1Get();
        Map<String, Integer> getStore2 = lottoService.lottoStore2Get();
        Map<String, Integer> getStore3 = lottoService.lottoStore3Get();
        model.addAttribute("getStore1", getStore1);
        model.addAttribute("getStore2", getStore2);
        model.addAttribute("getStore3", getStore3);

        return "index";
    }

    @GetMapping("/pull")
    public String pull() {

        LottoDomain lottoDomain = lottoService.LottoNumberCreate();
        lottoService.LottoStore3Save();
        lottoService.LottoStore2Save();
        lottoService.LottoStore1Save(lottoDomain);
        lottoService.lastNumbersSave(lottoDomain);
        return "redirect:/";
    }

    @GetMapping("/clear")
    public String clear() {
        lottoService.lottoStoreClear();

        return "redirect:/";
    }
}