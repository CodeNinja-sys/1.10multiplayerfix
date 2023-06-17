/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.logging.log4j.core.d.k;
import org.apache.logging.log4j.core.e.j;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public class bc
extends ac {
    private String c;
    protected final j b;

    protected bc(String string, String string2, String[] arrstring) {
        super(string, string2);
        this.b = j.a(arrstring);
        if (arrstring != null && arrstring.length > 0) {
            this.c = arrstring[0];
        }
    }

    public static bc b(String[] arrstring) {
        return new bc("Throwable", "throwable", arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        Throwable throwable = h2.h();
        if (this.c()) {
            this.a(throwable, stringBuilder);
        } else if (throwable != null && this.b.e()) {
            this.b(throwable, stringBuilder);
        }
    }

    private boolean c() {
        return "short.message".equalsIgnoreCase(this.c) || "short.localizedMessage".equalsIgnoreCase(this.c) || "short.fileName".equalsIgnoreCase(this.c) || "short.lineNumber".equalsIgnoreCase(this.c) || "short.methodName".equalsIgnoreCase(this.c) || "short.className".equalsIgnoreCase(this.c);
    }

    private void a(Throwable throwable, StringBuilder stringBuilder) {
        StackTraceElement[] arrstackTraceElement;
        StackTraceElement stackTraceElement = null;
        if (throwable != null && (arrstackTraceElement = throwable.getStackTrace()) != null && arrstackTraceElement.length > 0) {
            stackTraceElement = arrstackTraceElement[0];
        }
        if (throwable != null && stackTraceElement != null) {
            String string = "";
            if ("short.className".equalsIgnoreCase(this.c)) {
                string = stackTraceElement.getClassName();
            } else if ("short.methodName".equalsIgnoreCase(this.c)) {
                string = stackTraceElement.getMethodName();
            } else if ("short.lineNumber".equalsIgnoreCase(this.c)) {
                string = String.valueOf(stackTraceElement.getLineNumber());
            } else if ("short.message".equalsIgnoreCase(this.c)) {
                string = throwable.getMessage();
            } else if ("short.localizedMessage".equalsIgnoreCase(this.c)) {
                string = throwable.getLocalizedMessage();
            } else if ("short.fileName".equalsIgnoreCase(this.c)) {
                string = stackTraceElement.getFileName();
            }
            int n2 = stringBuilder.length();
            if (n2 > 0 && !Character.isWhitespace(stringBuilder.charAt(n2 - 1))) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string);
        }
    }

    private void b(Throwable throwable, StringBuilder stringBuilder) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        int n2 = stringBuilder.length();
        if (n2 > 0 && !Character.isWhitespace(stringBuilder.charAt(n2 - 1))) {
            stringBuilder.append(' ');
        }
        if (!this.b.d() || !k.e.equals(this.b.b())) {
            StringBuilder stringBuilder2 = new StringBuilder();
            String[] arrstring = stringWriter.toString().split(k.e);
            int n3 = this.b.a(arrstring.length) - 1;
            for (int i2 = 0; i2 <= n3; ++i2) {
                stringBuilder2.append(arrstring[i2]);
                if (i2 >= n3) continue;
                stringBuilder2.append(this.b.b());
            }
            stringBuilder.append(stringBuilder2.toString());
        } else {
            stringBuilder.append(stringWriter.toString());
        }
    }

    @Override
    public boolean cO_() {
        return true;
    }
}

