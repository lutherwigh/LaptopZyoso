package moe.luther.library.base.router;

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */

public class RouterFragmentPath {
    /**
     * 首页组件
     */
    public static class Home {
        private static final String HOME = "/home";
        /*首页*/
        public static final String PAGER_HOME = HOME + "/Home";
    }

    /**
     * Gank组件
     */
    public static class Gank {
        private static final String GANK = "/gank";
        /*工作*/
        public static final String PAGER_GANK = GANK + "/gank";
    }

    /**
     * 工作组件
     */
    public static class Work {
        private static final String WORK = "/work";
        /*工作*/
        public static final String PAGER_WORK = WORK + "/Work";
    }

    /**
     * 消息组件
     */
    public static class Msg {
        private static final String MSG = "/msg";
        /*消息*/
        public static final String PAGER_MSG = MSG + "/msg/Msg";
    }

    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*我的*/
        public static final String PAGE_MY = USER + "/my";
    }

    public static class Test{
        private static final String TEST = "/test";

        public static final String PAGE_TEST = TEST + "test";
    }
}
