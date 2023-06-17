/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class e
implements Closeable,
Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    public e(Writer writer) {
        this.a(6);
        this.g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer;
    }

    public final void c(String string) {
        if (string.length() == 0) {
            this.f = null;
            this.g = ":";
        } else {
            this.f = string;
            this.g = ": ";
        }
    }

    public final void b(boolean bl2) {
        this.h = bl2;
    }

    public boolean g() {
        return this.h;
    }

    public final void c(boolean bl2) {
        this.i = bl2;
    }

    public final boolean h() {
        return this.i;
    }

    public final void d(boolean bl2) {
        this.k = bl2;
    }

    public final boolean i() {
        return this.k;
    }

    public e b() {
        this.j();
        return this.a(1, "[");
    }

    public e c() {
        return this.a(1, 2, "]");
    }

    public e d() {
        this.j();
        return this.a(3, "{");
    }

    public e e() {
        return this.a(3, 5, "}");
    }

    private e a(int n2, String string) {
        this.e(true);
        this.a(n2);
        this.c.write(string);
        return this;
    }

    private e a(int n2, int n3, String string) {
        int n4 = this.a();
        if (n4 != n3 && n4 != n2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        --this.e;
        if (n4 == n3) {
            this.k();
        }
        this.c.write(string);
        return this;
    }

    private void a(int n2) {
        if (this.e == this.d.length) {
            int[] arrn = new int[this.e * 2];
            System.arraycopy(this.d, 0, arrn, 0, this.e);
            this.d = arrn;
        }
        this.d[this.e++] = n2;
    }

    private int a() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.d[this.e - 1];
    }

    private void b(int n2) {
        this.d[this.e - 1] = n2;
    }

    public e a(String string) {
        if (string == null) {
            throw new NullPointerException("name == null");
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = string;
        return this;
    }

    private void j() {
        if (this.j != null) {
            this.l();
            this.d(this.j);
            this.j = null;
        }
    }

    public e b(String string) {
        if (string == null) {
            return this.f();
        }
        this.j();
        this.e(false);
        this.d(string);
        return this;
    }

    public e f() {
        if (this.j != null) {
            if (this.k) {
                this.j();
            } else {
                this.j = null;
                return this;
            }
        }
        this.e(false);
        this.c.write("null");
        return this;
    }

    public e a(boolean bl2) {
        this.j();
        this.e(false);
        this.c.write(bl2 ? "true" : "false");
        return this;
    }

    public e a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        this.j();
        this.e(false);
        this.c.append(Double.toString(d2));
        return this;
    }

    public e a(long l2) {
        this.j();
        this.e(false);
        this.c.write(Long.toString(l2));
        return this;
    }

    public e a(Number number) {
        if (number == null) {
            return this.f();
        }
        this.j();
        String string = number.toString();
        if (!this.h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        this.e(false);
        this.c.append(string);
        return this;
    }

    public void flush() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    public void close() {
        this.c.close();
        int n2 = this.e;
        if (n2 > 1 || n2 == 1 && this.d[n2 - 1] != 7) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    private void d(String string) {
        String[] arrstring = this.i ? b : a;
        this.c.write("\"");
        int n2 = 0;
        int n3 = string.length();
        for (int i2 = 0; i2 < n3; ++i2) {
            String string2;
            char c2 = string.charAt(i2);
            if (c2 < '\u0080') {
                string2 = arrstring[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n2 < i2) {
                this.c.write(string, n2, i2 - n2);
            }
            this.c.write(string2);
            n2 = i2 + 1;
        }
        if (n2 < n3) {
            this.c.write(string, n2, n3 - n2);
        }
        this.c.write("\"");
    }

    private void k() {
        if (this.f == null) {
            return;
        }
        this.c.write("\n");
        int n2 = this.e;
        for (int i2 = 1; i2 < n2; ++i2) {
            this.c.write(this.f);
        }
    }

    private void l() {
        int n2 = this.a();
        if (n2 == 5) {
            this.c.write(44);
        } else if (n2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.k();
        this.b(4);
    }

    private void e(boolean bl2) {
        switch (this.a()) {
            case 7: {
                if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            case 6: {
                if (!this.h && !bl2) {
                    throw new IllegalStateException("JSON must start with an array or an object.");
                }
                this.b(7);
                break;
            }
            case 1: {
                this.b(2);
                this.k();
                break;
            }
            case 2: {
                this.c.append(',');
                this.k();
                break;
            }
            case 4: {
                this.c.append(this.g);
                this.b(5);
                break;
            }
            default: {
                throw new IllegalStateException("Nesting problem.");
            }
        }
    }

    static {
        for (int i2 = 0; i2 <= 31; ++i2) {
            com.a.b.d.e.a[i2] = String.format("\\u%04x", i2);
        }
        com.a.b.d.e.a[34] = "\\\"";
        com.a.b.d.e.a[92] = "\\\\";
        com.a.b.d.e.a[9] = "\\t";
        com.a.b.d.e.a[8] = "\\b";
        com.a.b.d.e.a[10] = "\\n";
        com.a.b.d.e.a[13] = "\\r";
        com.a.b.d.e.a[12] = "\\f";
        b = (String[])a.clone();
        com.a.b.d.e.b[60] = "\\u003c";
        com.a.b.d.e.b[62] = "\\u003e";
        com.a.b.d.e.b[38] = "\\u0026";
        com.a.b.d.e.b[61] = "\\u003d";
        com.a.b.d.e.b[39] = "\\u0027";
    }
}

