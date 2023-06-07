package Lotto.Lotto1.controller;

import Lotto.Lotto1.domain.InputNumber;
import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/")
    public String stay(Model model) {
        model.addAttribute("number123", new InputNumber());
        Map<String, Integer> lastNumbersList = lottoService.lastNumbersGet();
        model.addAttribute("lastNumbersList", lastNumbersList);
        Map<String, Integer> getStore1 = lottoService.lottoStore1Get();
        Map<String, Integer> getStore2 = lottoService.lottoStore2Get();
        Map<String, Integer> getStore3 = lottoService.lottoStore3Get();
        Map<String, Integer> getStore4 = lottoService.lottoStore4Get();
        Map<String, Integer> getStore5 = lottoService.lottoStore5Get();
        model.addAttribute("getStore1", getStore1);
        model.addAttribute("getStore2", getStore2);
        model.addAttribute("getStore3", getStore3);
        model.addAttribute("getStore4", getStore4);
        model.addAttribute("getStore5", getStore5);

        return "/index";
    }

    @PostMapping("/pull")
    public String Pull(InputNumber inputNumber) {
        LottoDomain lottoDomain = lottoService.lottoNumberCreate(inputNumber);
        lottoService.lottoStore8Save();
        lottoService.lottoStore7Save();
        lottoService.lottoStore6Save();
        lottoService.lottoStore5Save();
        lottoService.lottoStore4Save();
        lottoService.lottoStore3Save();
        lottoService.lottoStore2Save();
        lottoService.lottoStore1Save(lottoDomain);
        lottoService.lastNumbersSave(lottoDomain);
        return "redirect:/";
    }

    @GetMapping("/clear")
    public String clear() {
        lottoService.lottoStoreClear();
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        Integer getTotal = lottoService.totalNumber();
        Map<String, Integer> getStore1 = lottoService.lottoStore1Get();
        Map<String, Integer> getStore2 = lottoService.lottoStore2Get();
        Map<String, Integer> getStore3 = lottoService.lottoStore3Get();
        Map<String, Integer> getStore4 = lottoService.lottoStore4Get();
        Map<String, Integer> getStore5 = lottoService.lottoStore5Get();
        Map<String, Integer> getStore6 = lottoService.lottoStore6Get();
        Map<String, Integer> getStore7 = lottoService.lottoStore7Get();
        Map<String, Integer> getStore8 = lottoService.lottoStore8Get();
        model.addAttribute("getTotal", getTotal);
        model.addAttribute("getStore1", getStore1);
        model.addAttribute("getStore2", getStore2);
        model.addAttribute("getStore3", getStore3);
        model.addAttribute("getStore4", getStore4);
        model.addAttribute("getStore5", getStore5);
        model.addAttribute("getStore6", getStore6);
        model.addAttribute("getStore7", getStore7);
        model.addAttribute("getStore8", getStore8);
        return "/list";
    }
}