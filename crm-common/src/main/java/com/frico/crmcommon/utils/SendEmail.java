//package com.frico.crmcommon.utils;
//
//import com.frico.crmcommon.constant.Const;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.mail.*;
//import javax.mail.internet.*;
//
//@Component
//public class SendEmail {
//
//    @Autowired
//    private MailHelper mailHelper;
//
//    /**
//     * @param args
//     * @throws Exception
//     */
//    public static void main(String[] args){
//
////        Properties prop = new Properties();
//////        prop.setProperty("mail.host", Const.MAIL_HOST);
//////        prop.setProperty("mail.transport.protocol", Const.MAIL_TRANSPORT_PROTOCOL);
//////        prop.setProperty("mail.smtp.auth", "true");
//////        //使用JavaMail发送邮件的5个步骤
//////        //1、创建session
//////        Session session = Session.getInstance(prop);
//////        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
//////        session.setDebug(true);
//////        //2、通过session得到transport对象
//////        Transport ts = session.getTransport();
//////        //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
//////        ts.connect(Const.MAIL_HOST, Const.USER_NAME, Const.PASSWORD);
//////        //4、创建邮件
//////        Message message = createSimpleMail(session);
//////        //5、发送邮件
//////        ts.sendMessage(message, message.getAllRecipients());
//////        ts.close();
//    }
//
//    /**
//     * @Method: createSimpleMail
//     * @Description: 创建一封只包含文本的邮件
//     * @Anthor:
//     *
//     * @param session
//     * @return
//     * @throws Exception
//     */
//    public static MimeMessage createSimpleMail(Session session)
//            throws Exception {
//        //创建邮件对象
//        MimeMessage message = new MimeMessage(session);
//        //指明邮件的发件人
//        message.setFrom (new InternetAddress (Const.MAIL_HOST, "", "UTF-8"));
//        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
//        message.setRecipient(Message.RecipientType.TO, new InternetAddress("2818535720@qq.com"));
//        //邮件的标题
//        message.setSubject("开户提醒");
//        //邮件的文本内容
//        message.setContent("你好啊！", "text/html;charset=UTF-8");
//        //返回创建好的邮件对象
//        return message;
//    }
//}