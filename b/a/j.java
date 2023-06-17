/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import b.a.c;
import b.a.i;
import b.a.k;
import java.util.LinkedHashSet;
import java.util.Set;

public class j {
    private final int a;
    private final int b;
    private final Set c = new LinkedHashSet();
    private int d;
    private int e;

    public j(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public void a(String string, String string2) {
        this.a(new i(string, string2));
    }

    private void a(i i2) {
        this.c.add(i2);
        this.d = Math.max(this.d, i2.a.length());
        this.e = Math.max(this.e, i2.b.length());
    }

    private void c() {
        this.c.clear();
        this.d = 0;
        this.e = 0;
    }

    public void a() {
        c c2 = new c(this.d(), this.e());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i i2 : this.c) {
            linkedHashSet.addAll(c2.a(i2));
        }
        this.c();
        for (i i2 : linkedHashSet) {
            this.a(i2);
        }
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (i i2 : this.c) {
            this.a(stringBuilder, i2.a, this.d()).append(k.a(' ', this.b));
            this.a(stringBuilder, i2.b, this.e()).append(k.c);
        }
        return stringBuilder.toString();
    }

    private int d() {
        return Math.min((this.a - this.b) / 2, this.d);
    }

    private int e() {
        return Math.min((this.a - this.b) / 2, this.e);
    }

    private StringBuilder a(StringBuilder stringBuilder, String string, int n2) {
        stringBuilder.append(string).append(k.a(' ', n2 - string.length()));
        return stringBuilder;
    }
}

