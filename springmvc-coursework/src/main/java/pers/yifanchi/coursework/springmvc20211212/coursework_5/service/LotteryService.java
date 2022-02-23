package pers.yifanchi.coursework.springmvc20211212.coursework_5.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class LotteryService {

	private static List<Set<Integer>> lotteries = new ArrayList<Set<Integer>>();
	private static List<Entry<Integer, Long>> statTotalAppear = new ArrayList<Entry<Integer,Long>>();

	public List<Set<Integer>> getLotteries() {
		return lotteries;
	}

	public void addLottery() {
		lotteries.add(generateLottery());
	}

	public void updateLottery(int index) {
		lotteries.set(index, generateLottery());
	}

	public void deleteLottery(int index) {
		lotteries.remove(index);
	}

	private Set<Integer> generateLottery() {
		Random r = new Random();
		Set<Integer> lottery = new LinkedHashSet<Integer>();
		while (lottery.size()<5) {
			lottery.add(r.nextInt(39)+1);
		}
		return lottery;
	}
	
	public void statTotalAppear() {
		statTotalAppear = lotteries.stream().flatMap(Collection::stream).collect(
			Collectors.groupingBy(
				Function.identity(), Collectors.counting()
			)
		).entrySet().stream().sorted(
			(o1,o2) -> {
				if (o1.getValue() > o2.getValue()) return -1;
				else if (o1.getValue() < o2.getValue()) return 1;
				else return 0;
			}
		).collect(Collectors.toList());
	}
	
	public List<Entry<Integer, Long>> getStatTotalAppear() {
		return statTotalAppear;
	}
}
