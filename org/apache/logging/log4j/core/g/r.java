/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.g.b;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.j;
import org.apache.logging.log4j.core.net.w;

public class r
extends b {
    public static final Pattern d = Pattern.compile("\\r?\\n");
    private final j e;
    private final boolean f;
    private final String g;
    private final SimpleDateFormat h = new SimpleDateFormat("MMM dd HH:mm:ss ", Locale.ENGLISH);
    private final String i = this.f();

    protected r(j j2, boolean bl2, String string, Charset charset) {
        super(charset);
        this.e = j2;
        this.f = bl2;
        this.g = string == null ? null : Matcher.quoteReplacement(string);
    }

    public String c(h h2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(w.a(this.e, h2.a()));
        stringBuilder.append(">");
        this.a(h2.g(), stringBuilder);
        stringBuilder.append(" ");
        stringBuilder.append(this.i);
        stringBuilder.append(" ");
        String string = h2.d().a();
        if (null != this.g) {
            string = d.matcher(string).replaceAll(this.g);
        }
        stringBuilder.append(string);
        if (this.f) {
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private String f() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostName();
        }
        catch (UnknownHostException unknownHostException) {
            a.b("Could not determine local host name", (Throwable)unknownHostException);
            return "UNKNOWN_LOCALHOST";
        }
    }

    private synchronized void a(long l2, StringBuilder stringBuilder) {
        int n2 = stringBuilder.length() + 4;
        stringBuilder.append(this.h.format(new Date(l2)));
        if (stringBuilder.charAt(n2) == '0') {
            stringBuilder.setCharAt(n2, ' ');
        }
    }

    @Override
    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("structured", "false");
        hashMap.put("formatType", "logfilepatternreceiver");
        hashMap.put("dateFormat", this.h.toPattern());
        hashMap.put("format", "<LEVEL>TIMESTAMP PROP(HOSTNAME) MESSAGE");
        return hashMap;
    }

    public static r a(String string, String string2, String string3, String string4) {
        Charset charset = org.apache.logging.log4j.core.d.e.a(string4);
        boolean bl2 = Boolean.parseBoolean(string2);
        j j2 = j.a(string, j.q);
        return new r(j2, bl2, string3, charset);
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }
}

