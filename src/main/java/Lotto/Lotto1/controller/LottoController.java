package Lotto.Lotto1.controller;

import Lotto.Lotto1.domain.InputNumberDto;
import Lotto.Lotto1.domain.LottoDomain;
import Lotto.Lotto1.service.LottoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/")
    public String stay(@ModelAttribute("inputNumberDto") InputNumberDto inputNumberDto, Model model) {
        List<LottoDomain> lastFive = lottoService.getFive();
        model.addAttribute("lastFive", lastFive);

        return "home";
    }

    @PostMapping("/pull")
    public String Pull(@Validated @ModelAttribute("inputNumberDto") InputNumberDto inputNumberDto, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
//            log.info("errors={}", bindingResult);
            List<LottoDomain> lastFive = lottoService.getFive();
            model.addAttribute("lastFive", lastFive);
            return "home";
        }
        LottoDomain lottoDomain = lottoService.lottoNumberCreate(inputNumberDto);
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