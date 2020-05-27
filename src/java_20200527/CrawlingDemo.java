package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		/*
		String url = "http://www.imbc.com/";

		// HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;

		try {
			// URL로 연결하여 HTML 정보를 get 방식으로 가져온다.
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("성공");
		// HTML 정보에서 class 정보를 가져올때는 ".", id 정보를 가져올때는 "#"
		Elements elements = doc.select(".notice-list li");
		
		for(int i=0; i<elements.size();i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
		}*/
		
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("성공");
		
		Elements elements = doc.select(".home_news");
		Elements liElements = elements.select(".home_news_list li");
		
		for(int i =0;i<liElements.size();i++) {
			Element liElement = liElements.get(i);
			System.out.println(liElement.text());
		}
	}
}