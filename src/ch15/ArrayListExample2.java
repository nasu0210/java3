package ch15;

import java.util.*;


public class ArrayListExample2 {

	public static void main(String[] args) {
		List<Board> list=new Vector<>();
		list.add(new Board("제목11","내용1","작성자1"));
		list.add(new Board("제목22","내용2","작성자2"));
		list.add(new Board("제목33","내용3","작성자3"));
		list.add(new Board("제목44","내용4","작성자4"));
		list.add(new Board("제목55","내용5","작성자5"));
		
		int size=list.size();
		System.out.println("총 객체 수:"+size);
		System.out.println();
		Board board=list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"
				+board.getWriter());
		System.out.println();
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i);
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"
					+b.getWriter());
		}
		System.out.println();
		list.remove(2);
		list.remove(2);
		
		for(Board b:list) {
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"
					+b.getWriter());
		}
	}

}
