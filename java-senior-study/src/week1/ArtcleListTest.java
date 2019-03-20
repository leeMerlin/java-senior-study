package week1;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArtcleListTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("ID       标题                作者      时间");

        List<Article> artclelist = new ArrayList<>();
        artclelist.add(new Article(1,"红筹企业上科创板设4标准：市值超两千亿的无其他要素要求","同花顺",sdf.parse("2019-03-18 21:30:03")));
        artclelist.add(new Article(2,"您收到了一条新的消息","QQ",sdf.parse("2019-03-18 23:00:53 ")));
        artclelist.add(new Article(3,"83岁老人逃离养老院 原因令人心酸","爱奇艺",sdf.parse("2019-03-18 23:04:53 ")));


        Iterator<Article>  iterator = artclelist.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result;
            result = timeCal(sdf.format(article.getWriteTime()));
            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"..."+
                    article.getAuthor()+"  "+ result );
        }
    }
    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }
}
