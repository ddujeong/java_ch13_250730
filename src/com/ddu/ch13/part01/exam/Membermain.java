package com.ddu.ch13.part01.exam;

import java.util.Iterator;
import java.util.List;

public class Membermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDao dao = new MemberDao();
		List<MemberDto> memList = dao.getMemberDao();
		
		Iterator<MemberDto> iterator = memList.iterator();
		while(iterator.hasNext()) {
			 MemberDto memberDto = iterator.next();
			 System.out.println(memberDto.memberId + "/" + memberDto.memberPw + "/" + memberDto.memberName + "/" + memberDto.memberEmail);
		}
	}

}
