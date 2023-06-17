/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.o;
import org.apache.logging.log4j.a.s;
import org.apache.logging.log4j.a.v;

public class e
implements m {
    private static final long a = -665975803997290697L;
    private static final int b = 31;
    private static final String c = "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])";
    private static final Pattern d = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");
    private String e;
    private transient Object[] f;
    private String[] g;
    private transient String h;
    private final Throwable i;
    private m j;

    public e(String string, Object[] arrobject, Throwable throwable) {
        this.e = string;
        this.f = arrobject;
        this.i = throwable;
    }

    public e(String string, Object[] arrobject) {
        this.e = string;
        this.f = arrobject;
        this.i = null;
    }

    public e(String string, Object object) {
        this.e = string;
        this.f = new Object[]{object};
        this.i = null;
    }

    public e(String string, Object object, Object object2) {
        this(string, new Object[]{object, object2});
    }

    @Override
    public String a() {
        if (this.h == null) {
            if (this.j == null) {
                this.j = this.a(this.e, this.f, this.i);
            }
            this.h = this.j.a();
        }
        return this.h;
    }

    @Override
    public String b() {
        return this.e;
    }

    @Override
    public Object[] c() {
        if (this.f != null) {
            return this.f;
        }
        return this.g;
    }

    protected m a(String string, Object[] arrobject, Throwable throwable) {
        try {
            MessageFormat messageFormat = new MessageFormat(string);
            Format[] arrformat = messageFormat.getFormats();
            if (arrformat != null && arrformat.length > 0) {
                return new o(string, arrobject);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (d.matcher(string).find()) {
                return new v(string, arrobject);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return new s(string, arrobject, throwable);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        e e2 = (e)object;
        if (this.e != null ? !this.e.equals(e2.e) : e2.e != null) {
            return false;
        }
        return Arrays.equals(this.g, e2.g);
    }

    public int hashCode() {
        int n2 = this.e != null ? this.e.hashCode() : 0;
        n2 = 31 * n2 + (this.g != null ? Arrays.hashCode(this.g) : 0);
        return n2;
    }

    public String toString() {
        return "FormattedMessage[messagePattern=" + this.e + ", args=" + Arrays.toString(this.f) + "]";
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        this.a();
        objectOutputStream.writeUTF(this.h);
        objectOutputStream.writeUTF(this.e);
        objectOutputStream.writeInt(this.f.length);
        this.g = new String[this.f.length];
        int n2 = 0;
        for (Object object : this.f) {
            this.g[n2] = object.toString();
            ++n2;
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.h = objectInputStream.readUTF();
        this.e = objectInputStream.readUTF();
        int n2 = objectInputStream.readInt();
        this.g = new String[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.g[i2] = objectInputStream.readUTF();
        }
    }

    @Override
    public Throwable d() {
        if (this.i != null) {
            return this.i;
        }
        if (this.j == null) {
            this.j = this.a(this.e, this.f, this.i);
        }
        return this.j.d();
    }
}

