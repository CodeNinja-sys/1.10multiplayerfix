/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.q.a.w;
import net.minecraft.q.a.x;
import net.minecraft.s.l;
import net.minecraft.u.as;

public class c {
    private final w a;

    public c(w w2) {
        this.a = w2;
    }

    public String a() {
        return this.a.a();
    }

    public boolean a(String string) {
        return this.a.f(string);
    }

    public boolean a(String string, as as2) {
        return this.a.a(string, as2);
    }

    public boolean b(String string) {
        return this.a.e(string);
    }

    public boolean c(String string) {
        return this.a.b(string);
    }

    public boolean d(String string) {
        return this.a.c(string);
    }

    public boolean e(String string) {
        return this.a.d(string);
    }

    public void a(String string, String string2) {
        this.a.a(string, string2);
    }

    public void b() {
        this.a.c();
    }

    public List c() {
        ArrayList arrayList = ov.a();
        for (x x2 : this.a.b()) {
            arrayList.add(new l(x2));
        }
        return arrayList;
    }
}

