//package com.frico.crmcommon.utils;
//
//import com.frico.crmcommon.exception.CrmException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Component;
//
//import javax.mail.internet.MimeMessage;
//
///**
// * Created by chh 2018/11/13.
// */
//@Component
//@Slf4j
//public class MailHelper {
//    @Autowired
//    private Environment env;
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    public void sendEmail(String to, String title, String content) {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//
//        try {
//
//            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
//            helper.setFrom(env.getProperty("spring.mail.username"),"纳斯达全球交易集团有限公司");
//            helper.setTo(to);
//
//            helper.setSubject(title);
//            helper.setText(content, true);
//            javaMailSender.send(mimeMessage);
//
//        } catch (Exception e) {
//            log.error(e.getMessage(), e);
//            throw new CrmException("500","邮件发送失败");
//        }
//    }
//
//}
