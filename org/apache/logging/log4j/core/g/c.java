/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.d.k;
import org.apache.logging.log4j.core.d.y;
import org.apache.logging.log4j.core.g.d;
import org.apache.logging.log4j.core.h;

public final class c
extends org.apache.logging.log4j.core.g.b {
    private static final int d = 256;
    private static final String e = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";
    private static final String f = org.apache.logging.log4j.core.d.k.e.equals("\n") ? "\n" : org.apache.logging.log4j.core.d.k.e + "|\n";
    private static final String g = "Log4j Log Messages";
    private static final String h = "text/html";
    private final long i = ManagementFactory.getRuntimeMXBean().getStartTime();
    private final boolean j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;

    private c(boolean bl2, String string, String string2, Charset charset, String string3, String string4, String string5) {
        super(charset);
        this.j = bl2;
        this.k = string;
        this.l = string2;
        this.m = string3;
        this.n = string4;
        this.o = string5;
    }

    public String c(h h2) {
        Serializable serializable;
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append(org.apache.logging.log4j.core.d.k.e).append("<tr>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<td>");
        stringBuilder.append(h2.g() - this.i);
        stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        String string = y.a(h2.f());
        stringBuilder.append("<td title=\"").append(string).append(" thread\">");
        stringBuilder.append(string);
        stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<td title=\"Level\">");
        if (h2.a().equals((Object)org.apache.logging.log4j.b.f)) {
            stringBuilder.append("<font color=\"#339933\">");
            stringBuilder.append(y.a(String.valueOf((Object)h2.a())));
            stringBuilder.append("</font>");
        } else if (h2.a().a(org.apache.logging.log4j.b.d)) {
            stringBuilder.append("<font color=\"#993300\"><strong>");
            stringBuilder.append(y.a(String.valueOf((Object)h2.a())));
            stringBuilder.append("</strong></font>");
        } else {
            stringBuilder.append(y.a(String.valueOf((Object)h2.a())));
        }
        stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        String string2 = y.a(h2.b());
        if (string2.isEmpty()) {
            string2 = "root";
        }
        stringBuilder.append("<td title=\"").append(string2).append(" logger\">");
        stringBuilder.append(string2);
        stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        if (this.j) {
            serializable = h2.c();
            stringBuilder.append("<td>");
            stringBuilder.append(y.a(serializable.getFileName()));
            stringBuilder.append(':');
            stringBuilder.append(serializable.getLineNumber());
            stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        }
        stringBuilder.append("<td title=\"Message\">");
        stringBuilder.append(y.a(h2.d().a()).replaceAll(f, "<br />"));
        stringBuilder.append("</td>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("</tr>").append(org.apache.logging.log4j.core.d.k.e);
        if (h2.j().c() > 0) {
            stringBuilder.append("<tr><td bgcolor=\"#EEEEEE\" style=\"font-size : ").append(this.n);
            stringBuilder.append(";\" colspan=\"6\" ");
            stringBuilder.append("title=\"Nested Diagnostic Context\">");
            stringBuilder.append("NDC: ").append(y.a(h2.j().toString()));
            stringBuilder.append("</td></tr>").append(org.apache.logging.log4j.core.d.k.e);
        }
        if (h2.i().size() > 0) {
            stringBuilder.append("<tr><td bgcolor=\"#EEEEEE\" style=\"font-size : ").append(this.n);
            stringBuilder.append(";\" colspan=\"6\" ");
            stringBuilder.append("title=\"Mapped Diagnostic Context\">");
            stringBuilder.append("MDC: ").append(y.a(h2.i().toString()));
            stringBuilder.append("</td></tr>").append(org.apache.logging.log4j.core.d.k.e);
        }
        if ((serializable = h2.h()) != null) {
            stringBuilder.append("<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : ").append(this.n);
            stringBuilder.append(";\" colspan=\"6\">");
            this.a((Throwable)serializable, stringBuilder);
            stringBuilder.append("</td></tr>").append(org.apache.logging.log4j.core.d.k.e);
        }
        return stringBuilder.toString();
    }

    @Override
    public Map d() {
        return new HashMap();
    }

    @Override
    public String c() {
        return this.l;
    }

    private void a(Throwable throwable, StringBuilder stringBuilder) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            throwable.printStackTrace(printWriter);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        printWriter.flush();
        LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(stringWriter.toString()));
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            String string = lineNumberReader.readLine();
            while (string != null) {
                arrayList.add(string);
                string = lineNumberReader.readLine();
            }
        }
        catch (IOException iOException) {
            if (iOException instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            arrayList.add(iOException.toString());
        }
        boolean bl2 = true;
        for (String string : arrayList) {
            if (!bl2) {
                stringBuilder.append(e);
            } else {
                bl2 = false;
            }
            stringBuilder.append(y.a(string));
            stringBuilder.append(org.apache.logging.log4j.core.d.k.e);
        }
    }

    @Override
    public byte[] b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" ");
        stringBuilder.append("\"http://www.w3.org/TR/html4/loose.dtd\">");
        stringBuilder.append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<html>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<head>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<meta charset=\"").append(this.e()).append("\"/>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<title>").append(this.k).append("</title>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<style type=\"text/css\">").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<!--").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("body, table {font-family:").append(this.m).append("; font-size: ");
        stringBuilder.append(this.o).append(";}").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("th {background: #336699; color: #FFFFFF; text-align: left;}").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("-->").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("</style>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("</head>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<body bgcolor=\"#FFFFFF\" topmargin=\"6\" leftmargin=\"6\">").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<hr size=\"1\" noshade>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("Log session start time " + new Date() + "<br>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<br>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<table cellspacing=\"0\" cellpadding=\"4\" border=\"1\" bordercolor=\"#224466\" width=\"100%\">");
        stringBuilder.append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<tr>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<th>Time</th>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<th>Thread</th>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<th>Level</th>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<th>Logger</th>").append(org.apache.logging.log4j.core.d.k.e);
        if (this.j) {
            stringBuilder.append("<th>File:Line</th>").append(org.apache.logging.log4j.core.d.k.e);
        }
        stringBuilder.append("<th>Message</th>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("</tr>").append(org.apache.logging.log4j.core.d.k.e);
        return stringBuilder.toString().getBytes(this.e());
    }

    @Override
    public byte[] a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("</table>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("<br>").append(org.apache.logging.log4j.core.d.k.e);
        stringBuilder.append("</body></html>");
        return stringBuilder.toString().getBytes(this.e());
    }

    public static c a(String string, String string2, String string3, String string4, String string5, String string6) {
        Charset charset = org.apache.logging.log4j.core.d.e.a(string4, org.apache.logging.log4j.core.d.e.a);
        if (string6 == null) {
            string6 = "arial,sans-serif";
        }
        d d2 = org.apache.logging.log4j.core.g.d.a(string5);
        string5 = d2.a();
        String string7 = d2.b().a();
        boolean bl2 = Boolean.parseBoolean(string);
        if (string2 == null) {
            string2 = g;
        }
        if (string3 == null) {
            string3 = "text/html; charset=" + charset;
        }
        return new c(bl2, string2, string3, charset, string6, string5, string7);
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }
}

