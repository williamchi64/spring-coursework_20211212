package pers.yifanchi.coursework.springmvc20211212.coursework_5.controller;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.yifanchi.coursework.springmvc20211212.coursework_5.service.LotteryService;

@Controller
@RequestMapping("/coursework_5/lottery")
public class LotteryController {
	@Autowired
	private LotteryService lotteryService;
	// 主畫面
	@RequestMapping("/")
	public String index(Model model) {
		List<Entry<Integer, Long>> statTotalAppear = lotteryService.getStatTotalAppear();
		String output = statTotalAppear.stream().map(e->String.format("%d (%d)", e.getKey(), e.getValue())).collect(Collectors.joining(", "));
		model.addAttribute("lotteries", lotteryService.getLotteries());
		model.addAttribute("statTotalAppearMap", output);
		return "coursework_5/lottery";
	}
	// 電腦選號
	@RequestMapping("/add")
	public String add() {
		lotteryService.addLottery();
		return "redirect:./";
	}
	// 修改記錄
	@RequestMapping("/update/{index}")
	public String update(@PathVariable("index") int index) {
		lotteryService.updateLottery(index);
		return "redirect:../";
	}
	// 刪除記錄
	@RequestMapping("/delete/{index}")
	public String delete(@PathVariable("index") int index) {
		lotteryService.deleteLottery(index);
		return "redirect:../";
	}
	// 統計出現次數
	@RequestMapping("/statTotalAppear")
	public String statTotalAppear() {
		lotteryService.statTotalAppear();
		return "redirect:./";
	}
}
