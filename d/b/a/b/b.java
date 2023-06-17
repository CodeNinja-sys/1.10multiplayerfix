/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.b;

import d.b.a.a;
import d.b.a.b.a.c;

public class b
implements a {
    private String a;
    private d.b.a.b b = null;

    public d.b.a.b c() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public String a() {
        if (this.a == null) {
            this.a = d.c.a.b("sw_vers -productName");
        }
        return this.a;
    }

    public String b() {
        return "Apple";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b());
        stringBuilder.append(" ");
        stringBuilder.append(this.a());
        stringBuilder.append(" ");
        stringBuilder.append(this.c().toString());
        return stringBuilder.toString();
    }
}

