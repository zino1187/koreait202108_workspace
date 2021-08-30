package com.koreait.common;

//파일과 관련된 유용한 기능들을 모아놓은 객체 
public class FileManager {
	
	//확장자 구하기 
	public static String getExt(String path) {
		int lastIndex=path.lastIndexOf("."); //가장 마지막 점의 인덱스 추출
		String ext=path.substring(lastIndex+1, path.length());
		return ext;
	}
	
}
