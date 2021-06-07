public class Main {
    public static void main(String[] args) {
        CentralAajTak subject = new CentralAajTak();
        BizAajTak observer = new BizAajTak();
        MumbaiAajTak observer1 = new MumbaiAajTak();
        DelhiAajTak observer2 = new DelhiAajTak();

        News delhiNews = new News();
        delhiNews.setNews("Delhi had heavy Rainfall Yesterday" );
        delhiNews.setNewsType(NewsType.DELHI_NEWS);

        News mumbaiNews = new News();
        mumbaiNews.setNews("Mumbai had heavy Rainfall Yesterday" );
        mumbaiNews.setNewsType(NewsType.MUMBAI_NEWS);

        News bizNews = new News();
        bizNews.setNews("Bitcoin prices gone down by 10% . " );
        bizNews.setNewsType(NewsType.BIZ_NEWS);


        subject.register(observer);
        subject.register(observer1);
        subject.register(observer2);

        subject.update(delhiNews);
        subject.update(mumbaiNews);
        subject.update(bizNews);
    }
}