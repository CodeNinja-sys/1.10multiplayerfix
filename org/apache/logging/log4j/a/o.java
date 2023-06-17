/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.d;

public class o
implements m {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private static final long b = -665975803997290697L;
    private static final int c = 31;
    private String d;
    private transient Object[] e;
    private String[] f;
    private transient String g;
    private transient Throwable h;

    public o(String string, Object ... arrobject) {
        this.d = string;
        this.e = arrobject;
        if (arrobject != null && arrobject.length > 0 && arrobject[arrobject.length - 1] instanceof Throwable) {
            this.h = (Throwable)arrobject[arrobject.length - 1];
        }
    }

    @Override
    public String a() {
        if (this.g == null) {
            this.g = this.a(this.d, this.e);
        }
        return this.g;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public Object[] c() {
        if (this.e != null) {
            return this.e;
        }
        return this.f;
    }

    protected String a(String string, Object ... arrobject) {
        try {
            return MessageFormat.format(string, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            a.b("Unable to format msg: " + string, (Throwable)illegalFormatException);
            return string;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        o o2 = (o)object;
        if (this.d != null ? !this.d.equals(o2.d) : o2.d != null) {
            return false;
        }
        return Arrays.equals(this.f, o2.f);
    }

    public int hashCode() {
        int n2 = this.d != null ? this.d.hashCode() : 0;
        n2 = 31 * n2 + (this.f != null ? Arrays.hashCode(this.f) : 0);
        return n2;
    }

    public String toString() {
        return "StringFormatMessage[messagePattern=" + this.d + ", args=" + Arrays.toString(this.e) + "]";
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        this.a();
        objectOutputStream.writeUTF(this.g);
        objectOutputStream.writeUTF(this.d);
        objectOutputStream.writeInt(this.e.length);
        this.f = new String[this.e.length];
        int n2 = 0;
        for (Object object : this.e) {
            this.f[n2] = object.toString();
            ++n2;
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = objectInputStream.readUTF();
        this.d = objectInputStream.readUTF();
        int n2 = objectInputStream.readInt();
        this.f = new String[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.f[i2] = objectInputStream.readUTF();
        }
    }

    @Override
    public Throwable d() {
        return this.h;
    }
}

