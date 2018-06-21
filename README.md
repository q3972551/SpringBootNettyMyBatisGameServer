# SpringBootNettyMyBatisGameServer
用springboot + netty + mybatis 创建的游戏服务器架构
大家只要在processor里写自己的实用逻辑就行了

messageid 去定义一下自己的消息id
在processor文件夹中去实现自己的消息处理类
消息解析字节用protobuffer

test文件夹中是例子
如果不需要用role的话，如下：
@NettyProcessor
public class TestProcessor extends MsgProcessor {



    @MsgMapping(msgid = MessageId.c_test)
    @Override
    public void process(IoSession session, ByteString body) {
        System.out.println("hello world");
    }
}

再processor中写逻辑
如果用到角色类Role的话，如下：
@NettyProcessor
public class RoleTestProcessor extends LogicMsgProcessor {

    @Autowired
    private AccountTelMapper mapper;

    @MsgMapping(msgid = MessageId.c_test,isLogic = true)
    @Override
    public void processLogic(Role role, ByteString body) {

        System.out.println("hello world logic");
        try{
//            CMsgHeartBeat c = CMsgHeartBeat.parseFrom(body);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

这里isLogic=true标明需要角色类，一定要标明，不然会报错。
