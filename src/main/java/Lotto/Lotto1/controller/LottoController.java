package Lotto.Lotto1.controller;

import Lotto.Lotto1.domain.InputNumber;
import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/")
    public String stay(@ModelAttribute("inputNumber") InputNumber inputNumber, Model model) {
        List<LottoDomain> lastFive = lottoService.getFive();
        model.addAttribute("lastFive", lastFive);

        return "/index";
    }

    @PostMapping("/pull")
    public String Pull(InputNumber inputNumber) {
        LottoDomain lottoDomain = lottoService.lottoNumberCreate(inputNumber);
        lottoService.saveLotto(lottoDomain);

        return "redirect:/";
    }

    @GetMapping("/clear")
    public String clear() {
        lottoService.lottoStoreClear();

        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<LottoDomain> allStore = lottoService.getAll();
        model.addAttribute("allStore", allStore);

        return "/list";
    }
}