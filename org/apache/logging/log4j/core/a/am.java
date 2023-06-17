/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

public class am {
    public static final char a = ' ';
    private String b;
    private int c;

    public am(String string) {
        this.a(string);
    }

    public String a() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
        this.c();
    }

    private void c() {
        this.c = this.b.length();
    }

    public byte[] b() {
        String string = this.toString();
        return string.getBytes();
    }

    public String toString() {
        String string = Integer.toString(this.c);
        return string + ' ' + this.b;
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public boolean a(am am2) {
        return this.b(am2) && this.c(am2);
    }

    private boolean b(am am2) {
        return this.c == am2.c;
    }

    private boolean c(am am2) {
        return this.b.equals(am2.b);
    }
}

