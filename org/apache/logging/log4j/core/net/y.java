/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.activation.DataSource
 *  javax.mail.BodyPart
 *  javax.mail.Message
 *  javax.mail.Message$RecipientType
 *  javax.mail.MessagingException
 *  javax.mail.Multipart
 *  javax.mail.Session
 *  javax.mail.Transport
 *  javax.mail.internet.InternetHeaders
 *  javax.mail.internet.MimeBodyPart
 *  javax.mail.internet.MimeMessage
 *  javax.mail.internet.MimeMultipart
 *  javax.mail.internet.MimeUtility
 *  javax.mail.util.ByteArrayDataSource
 */
package org.apache.logging.log4j.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;
import org.apache.logging.log4j.core.a.b;
import org.apache.logging.log4j.core.d.l;
import org.apache.logging.log4j.core.d.r;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.aa;
import org.apache.logging.log4j.core.net.ab;
import org.apache.logging.log4j.core.net.u;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e;

public class y
extends b {
    private static final ab c = new ab(null);
    private final Session d;
    private final l e;
    private volatile MimeMessage f;
    private final aa g;

    protected y(String string, Session session, MimeMessage mimeMessage, aa aa2) {
        super(string);
        this.d = session;
        this.f = mimeMessage;
        this.g = aa2;
        this.e = new l(h.class, aa.a(aa2));
    }

    public void a(h h2) {
        this.e.a(h2);
    }

    public static y a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n2, String string9, String string10, boolean bl2, String string11, int n3) {
        if (v.a(string7)) {
            string7 = "smtp";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null) {
            stringBuilder.append(string);
        }
        stringBuilder.append(":");
        if (string2 != null) {
            stringBuilder.append(string2);
        }
        stringBuilder.append(":");
        if (string3 != null) {
            stringBuilder.append(string3);
        }
        stringBuilder.append(":");
        if (string4 != null) {
            stringBuilder.append(string4);
        }
        stringBuilder.append(":");
        if (string5 != null) {
            stringBuilder.append(string5);
        }
        stringBuilder.append(":");
        if (string6 != null) {
            stringBuilder.append(string6);
        }
        stringBuilder.append(":");
        stringBuilder.append(string7).append(":").append(string8).append(":").append("port").append(":");
        if (string9 != null) {
            stringBuilder.append(string9);
        }
        stringBuilder.append(":");
        if (string10 != null) {
            stringBuilder.append(string10);
        }
        stringBuilder.append(bl2 ? ":debug:" : "::");
        stringBuilder.append(string11);
        String string12 = "SMTP:" + r.b(stringBuilder.toString());
        return (y)y.a(string12, c, new aa(string, string2, string3, string4, string5, string6, string7, string8, n2, string9, string10, bl2, n3));
    }

    public void a(f f2, h h2) {
        if (this.f == null) {
            this.g();
        }
        try {
            h[] arrh = (h[])this.e.a();
            byte[] arrby = this.a(arrh, h2, f2);
            String string = f2.c();
            String string2 = this.a(arrby, string);
            byte[] arrby2 = this.b(arrby, string2);
            InternetHeaders internetHeaders = this.a(string, string2);
            MimeMultipart mimeMultipart = this.a(arrby2, internetHeaders);
            this.a(this.f, mimeMultipart);
        }
        catch (MessagingException messagingException) {
            a.b("Error occurred while sending e-mail notification.", (Throwable)messagingException);
            throw new e("Error occurred while sending email", messagingException);
        }
        catch (IOException iOException) {
            a.b("Error occurred while sending e-mail notification.", (Throwable)iOException);
            throw new e("Error occurred while sending email", iOException);
        }
        catch (RuntimeException runtimeException) {
            a.b("Error occurred while sending e-mail notification.", (Throwable)runtimeException);
            throw new e("Error occurred while sending email", runtimeException);
        }
    }

    protected byte[] a(h[] arrh, h h2, f f2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a(arrh, h2, f2, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private void a(h[] arrh, h h2, f f2, ByteArrayOutputStream byteArrayOutputStream) {
        this.a(f2, byteArrayOutputStream);
        this.a(arrh, h2, f2, (OutputStream)byteArrayOutputStream);
        this.b(f2, byteArrayOutputStream);
    }

    protected void a(f f2, OutputStream outputStream) {
        byte[] arrby = f2.b();
        if (arrby != null) {
            outputStream.write(arrby);
        }
    }

    protected void a(h[] arrh, h h2, f f2, OutputStream outputStream) {
        for (h h3 : arrh) {
            byte[] arrby = f2.a(h3);
            outputStream.write(arrby);
        }
        byte[] arrby = f2.a(h2);
        outputStream.write(arrby);
    }

    protected void b(f f2, OutputStream outputStream) {
        byte[] arrby = f2.a();
        if (arrby != null) {
            outputStream.write(arrby);
        }
    }

    protected String a(byte[] arrby, String string) {
        ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(arrby, string);
        return MimeUtility.getEncoding((DataSource)byteArrayDataSource);
    }

    protected byte[] b(byte[] arrby, String string) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a(arrby, string, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    protected void a(byte[] arrby, String string, ByteArrayOutputStream byteArrayOutputStream) {
        OutputStream outputStream = MimeUtility.encode((OutputStream)byteArrayOutputStream, (String)string);
        outputStream.write(arrby);
        outputStream.close();
    }

    protected InternetHeaders a(String string, String string2) {
        InternetHeaders internetHeaders = new InternetHeaders();
        internetHeaders.setHeader("Content-Type", string + "; charset=UTF-8");
        internetHeaders.setHeader("Content-Transfer-Encoding", string2);
        return internetHeaders;
    }

    protected MimeMultipart a(byte[] arrby, InternetHeaders internetHeaders) {
        MimeMultipart mimeMultipart = new MimeMultipart();
        MimeBodyPart mimeBodyPart = new MimeBodyPart(internetHeaders, arrby);
        mimeMultipart.addBodyPart((BodyPart)mimeBodyPart);
        return mimeMultipart;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(MimeMessage mimeMessage, MimeMultipart mimeMultipart) {
        MimeMessage mimeMessage2 = mimeMessage;
        synchronized (mimeMessage2) {
            mimeMessage.setContent((Multipart)mimeMultipart);
            mimeMessage.setSentDate(new Date());
            Transport.send((Message)mimeMessage);
        }
    }

    private synchronized void g() {
        if (this.f != null) {
            return;
        }
        try {
            this.f = new u(this.d).a(aa.g(this.g)).b(aa.f(this.g)).a(Message.RecipientType.TO, aa.e(this.g)).a(Message.RecipientType.CC, aa.d(this.g)).a(Message.RecipientType.BCC, aa.c(this.g)).c(aa.b(this.g)).a();
        }
        catch (MessagingException messagingException) {
            a.b("Could not set SMTPAppender message options.", (Throwable)messagingException);
            this.f = null;
        }
    }

    static /* synthetic */ d f() {
        return a;
    }
}

