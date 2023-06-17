/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.c;

import d.b.a.a;
import d.b.a.c.a.d;

public class b
implements a {
    private d.b.a.b a = null;

    public d.b.a.b c() {
        if (this.a == null) {
            this.a = new d();
        }
        return this.a;
    }

    public String a() {
        return "Windows";
    }

    public String b() {
        return "Microsoft";
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

