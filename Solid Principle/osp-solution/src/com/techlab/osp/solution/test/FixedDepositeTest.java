package com.techlab.osp.solution.test;

import com.techlab.osp.solution.DiwaliRate;
import com.techlab.osp.solution.FixedDeposite;
import com.techlab.osp.solution.HoliRate;
import com.techlab.osp.solution.IFestivalRate;
import com.techlab.osp.solution.NormalRate;

public class FixedDepositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFestivalRate dr = new DiwaliRate();
		FixedDeposite fd = new FixedDeposite(100, "Anupam", 100000.0, 5000.0, 2, dr);
		System.out.println(fd.toString());
		IFestivalRate hr = new HoliRate();
		FixedDeposite fd1 = new FixedDeposite(100, "Anupam", 100000.0, 5000.0, 2, hr);
		System.out.println(fd1.toString());
		IFestivalRate nr = new NormalRate();
		FixedDeposite fd2 = new FixedDeposite(100, "Anupam", 100000.0, 5000.0, 2, nr);
		System.out.println(fd2.toString());
	}

}
