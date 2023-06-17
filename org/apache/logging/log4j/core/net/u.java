/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.mail.Address
 *  javax.mail.Message$RecipientType
 *  javax.mail.Session
 *  javax.mail.internet.InternetAddress
 *  javax.mail.internet.MimeMessage
 */
package org.apache.logging.log4j.core.net;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.logging.log4j.core.d.e;

public class u {
    private final MimeMessage a;

    public u(Session session) {
        this.a = new MimeMessage(session);
    }

    public u a(String string) {
        InternetAddress internetAddress = u.d(string);
        if (null != internetAddress) {
            this.a.setFrom((Address)internetAddress);
        } else {
            try {
                this.a.setFrom();
            }
            catch (Exception exception) {
                this.a.setFrom((Address)((InternetAddress)null));
            }
        }
        return this;
    }

    public u b(String string) {
        InternetAddress[] arrinternetAddress = u.e(string);
        if (null != arrinternetAddress) {
            this.a.setReplyTo((Address[])arrinternetAddress);
        }
        return this;
    }

    public u a(Message.RecipientType recipientType, String string) {
        InternetAddress[] arrinternetAddress = u.e(string);
        if (null != arrinternetAddress) {
            this.a.setRecipients(recipientType, (Address[])arrinternetAddress);
        }
        return this;
    }

    public u c(String string) {
        if (string != null) {
            this.a.setSubject(string, e.a.name());
        }
        return this;
    }

    public MimeMessage a() {
        return this.a;
    }

    private static InternetAddress d(String string) {
        return string == null ? null : new InternetAddress(string);
    }

    private static InternetAddress[] e(String string) {
        return string == null ? null : InternetAddress.parse((String)string, (boolean)true);
    }
}

