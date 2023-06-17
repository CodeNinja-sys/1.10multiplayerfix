/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.mail.Authenticator
 *  javax.mail.Message$RecipientType
 *  javax.mail.MessagingException
 *  javax.mail.Session
 *  javax.mail.internet.MimeMessage
 */
package org.apache.logging.log4j.core.net;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.d.s;
import org.apache.logging.log4j.core.net.aa;
import org.apache.logging.log4j.core.net.ac;
import org.apache.logging.log4j.core.net.u;
import org.apache.logging.log4j.core.net.y;
import org.apache.logging.log4j.core.net.z;
import org.apache.logging.log4j.e.b;

class ab
implements x {
    private ab() {
    }

    public y a(String string, aa aa2) {
        MimeMessage mimeMessage;
        Authenticator authenticator;
        String string2 = "mail." + aa.h(aa2);
        Properties properties = b.b();
        properties.put("mail.transport.protocol", aa.h(aa2));
        if (properties.getProperty("mail.host") == null) {
            properties.put("mail.host", s.a());
        }
        if (null != aa.i(aa2)) {
            properties.put(string2 + ".host", aa.i(aa2));
        }
        if (aa.j(aa2) > 0) {
            properties.put(string2 + ".port", String.valueOf(aa.j(aa2)));
        }
        if (null != (authenticator = this.a(aa.k(aa2), aa.l(aa2)))) {
            properties.put(string2 + ".auth", "true");
        }
        Session session = Session.getInstance((Properties)properties, (Authenticator)authenticator);
        session.setProtocolForAddress("rfc822", aa.h(aa2));
        session.setDebug(aa.m(aa2));
        try {
            mimeMessage = new u(session).a(aa.g(aa2)).b(aa.f(aa2)).a(Message.RecipientType.TO, aa.e(aa2)).a(Message.RecipientType.CC, aa.d(aa2)).a(Message.RecipientType.BCC, aa.c(aa2)).c(aa.b(aa2)).a();
        }
        catch (MessagingException messagingException) {
            y.f().b("Could not set SMTPAppender message options.", (Throwable)messagingException);
            mimeMessage = null;
        }
        return new y(string, session, mimeMessage, aa2);
    }

    private Authenticator a(String string, String string2) {
        if (null != string2 && null != string) {
            return new ac(this, string, string2);
        }
        return null;
    }

    /* synthetic */ ab(z z2) {
        this();
    }
}

