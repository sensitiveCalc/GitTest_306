package kosta.service;

public class GoodsService {
	public void insert() {
		System.out.println("insert 메서드..");
	}
	public void select() {
		System.out.println("select 메서드..");
		System.out.println("시나리오 3번 test");
		System.out.println("강의장에서 수정 ++");
	}
	public void update() {
		System.out.println("로컬에서 update 수정");
	}
	public void delete() {
		System.out.println("remote에서 delete 수정");
	}
}
