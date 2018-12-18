package moe.luther.demo.data;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observer;
import moe.luther.demo.data.api.JuheAPI;
import moe.luther.demo.data.bean.NewsBean;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JuheRetrofitance extends BaseRetrofitance {

    JuheAPI api;

    public static final String BASE_URL = "http://gank.io/api/";

    private final String[] titles = {"头条", "社会", "国内", "国际", "娱乐", "体育", "军事", "科技", "财经", "时尚"};
    private final String[] titles_en =
            {"top", "shehui", "guonei", "guoji", "yule", "tiyu", "junshi", "keji", "caijing",
                    "shishang"};

    private static volatile JuheRetrofitance instance;

    public static synchronized JuheRetrofitance getInstance(){
        if(instance == null){
            synchronized (JuheRetrofitance.class){
                if(instance == null){
                    instance = new JuheRetrofitance();
                }
            }
        }
        return instance;
    }

    private JuheRetrofitance(){
        super();

        Retrofit retrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        api = retrofit.create(JuheAPI.class);
    }

    public void getNews(Observer<NewsBean> subscriber) {
        int position = (int) (Math.random() * 10);
        String URL = "http://v.juhe.cn/toutiao/index?type=" + titles_en[position]
                + "&key=53555bf8010e1bf9c42cc0f9fbe8578a";
        commonOp(api.getNews(URL),subscriber);
    }

}
