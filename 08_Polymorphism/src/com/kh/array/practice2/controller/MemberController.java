package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	private Member[] m = new Member[3];
	public int count = 0;

	public void insertMember(Member m) {

		this.m[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
	}

	public boolean updateMember(String id, String name, String password, String email, int result) {
		this.m[result].setId(id);
		this.m[result].setName(name);
		this.m[result].setPassword(password);
		this.m[result].setEmail(email);
		return true;
	}

	public int checkId(String id) {

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && id.equals(m[i].getId())) {
				return i;
			}
		}
		return -1;
	}

	public Member[] printAll() {

		return m;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean deleteCount(int i) {
		int account = 0;
		for (; i < m.length - 1; i++) {
			if (m[i + 1] != null) {
				m[i] = m[i+1];

//			m[i].setId(m[i+1].getId()); 
//			m[i].setName(m[i+1].getName()); 
//			m[i].setPassword(m[i+1].getPassword()); 
//			m[i].setEmail(m[i+1].getEmail()); 
//			m[i].setGender(m[i+1].getGender()); 
//			m[i].setAge(m[i+1].getAge()); 
			}
		}
		for (int j = 0; j < m.length; j++) {
			if (m[j] != null) {
				account++;
			}
		}
		m[account - 1] = new Member();
		count--;
		return true;
	}

}
