/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.ab;
import b.ad;
import b.c;
import b.k;
import b.r;
import b.w;
import b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class x
extends k {
    private final r a;

    x(r r2, Collection collection, String string) {
        super(collection, string);
        this.a = r2;
        this.n();
    }

    private void n() {
        this.a.a(this);
    }

    public c f() {
        ab ab2 = new ab(this.a(), this.b());
        this.a.a(ab2);
        return ab2;
    }

    public c h() {
        z z2 = new z(this.a(), this.b());
        this.a.a(z2);
        return z2;
    }

    public x a(String string, String ... arrstring) {
        List list = this.c(string, arrstring);
        for (String string2 : list) {
            this.a.b(this.a(), string2);
        }
        return this;
    }

    public x a(w w2, w ... arrw) {
        this.a.a(this.a(), w2);
        for (w w3 : arrw) {
            this.a.a(this.a(), w3);
        }
        return this;
    }

    public x b(String string, String ... arrstring) {
        List list = this.c(string, arrstring);
        for (String string2 : list) {
            this.a.c(this.a(), string2);
        }
        return this;
    }

    public x b(w w2, w ... arrw) {
        this.a.b(this.a(), w2);
        for (w w3 : arrw) {
            this.a.b(this.a(), w3);
        }
        return this;
    }

    private List c(String string, String ... arrstring) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(string);
        Collections.addAll(arrayList, arrstring);
        for (String string2 : arrayList) {
            if (this.a.d(string2)) continue;
            throw new ad(string2);
        }
        return arrayList;
    }
}

