/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.b.a;

import d.a.c;
import java.util.ArrayList;

public class a
implements c {
    private String a;
    private String b;
    private String c = null;
    private String d;
    private String e;
    private String f;
    private Boolean g;

    public String a() {
        if (this.a == null) {
            this.a = d.c.a.b("sysctl -n machdep.cpu.vendor");
        }
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public String b() {
        if (this.b == null) {
            this.b = d.c.a.b("sysctl -n machdep.cpu.brand_string");
        }
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public String c() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.a().contentEquals("GenuineIntel")) {
                stringBuilder.append(this.d() ? "Intel64" : "x86");
            } else {
                stringBuilder.append(this.a());
            }
            stringBuilder.append(" Family ");
            stringBuilder.append(this.g());
            stringBuilder.append(" Model ");
            stringBuilder.append(this.f());
            stringBuilder.append(" Stepping ");
            stringBuilder.append(this.e());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public void c(String string) {
        this.c = string;
    }

    public boolean d() {
        if (this.g == null) {
            this.g = d.c.a.b("sysctl -n hw.cpu64bit_capable").equals("1");
        }
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public String e() {
        if (this.d == null) {
            this.d = d.c.a.b("sysctl -n machdep.cpu.stepping");
        }
        return this.d;
    }

    public void d(String string) {
        this.d = string;
    }

    public String f() {
        if (this.e == null) {
            this.e = d.c.a.b("sysctl -n machdep.cpu.model");
        }
        return this.e;
    }

    public void e(String string) {
        this.e = string;
    }

    public String g() {
        if (this.f == null) {
            this.f = d.c.a.b("sysctl -n machdep.cpu.family");
        }
        return this.f;
    }

    public void f(String string) {
        this.f = string;
    }

    public float h() {
        ArrayList arrayList = d.c.a.a("top -l 1 -R -F -n1");
        String[] arrstring = ((String)arrayList.get(3)).split(" ");
        return 100.0f - Float.valueOf(arrstring[6].replace("%", "")).floatValue();
    }

    public String toString() {
        return this.b();
    }
}

