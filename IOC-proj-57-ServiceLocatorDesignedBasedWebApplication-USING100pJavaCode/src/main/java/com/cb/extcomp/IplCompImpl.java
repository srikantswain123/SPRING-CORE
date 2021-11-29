package com.cb.extcomp;

import org.springframework.stereotype.Component;


public class IplCompImpl implements Iiplcomp {

	@Override
	public String getIplScore(int mid) {
		if(mid==1001)
			return "MUMBAI VS CHENAI->CHENAI WON BY 4 WICKETS";
		else if(mid==1002)
			return "DC VS KXIP->DELHI WON BY 3 WICKETS";
		else if(mid==1003)
			return "RCB VS SRH->RCB WON BY 6 WICKETS";
		else if(mid==1004)
			return "CSK VS RR->RR WON BY 6 WICKETS";
		else
			return "no match id found";
	}

}
