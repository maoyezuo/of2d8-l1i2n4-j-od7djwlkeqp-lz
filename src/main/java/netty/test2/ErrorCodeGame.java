package netty.test2;

/**
 * Created by Administrator on 2018\3\13 0013.
 */

public class ErrorCodeGame {
	/** 成功 */
    public static final int SUCCESS = 1;
	/** 系统错误 */
    public static final int SYSTEM_ERROR = 100001;
    /** 账号错误 */
    public static final int USER_NANE_ERROR = 100002;
    /** 密码错误 */
    public static final int USER_PSW_ERROR = 100003;
    /** UUID不存在 */
    public static final int UUID_ERROR = 100004;
    /** 已经登录 */
    public static final int LOGIN_ERROR = 100005;
    /** 账号已存在 */
    public static final int USER_NOEXIST_ERROR = 100006;
    /** 搜索球员不存在 */
    public static final int PLAYER_NOEXIST_ERROR = 100007;
    
}
