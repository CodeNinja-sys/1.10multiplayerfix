/*
 * Decompiled with CFR 0.150.
 */
package b;

class d {
    private final String[] a;
    private int b;

    d(String ... arrstring) {
        this.a = (String[])arrstring.clone();
    }

    boolean a() {
        return this.b < this.a.length;
    }

    String b() {
        return this.a[this.b++];
    }

    String c() {
        return this.a[this.b];
    }

    void d() {
        if ('-' != this.a[this.b].charAt(0)) {
            this.a[this.b] = "--" + this.a[this.b];
        }
    }
}

