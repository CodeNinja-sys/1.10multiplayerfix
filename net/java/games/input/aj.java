/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.ArrayList;
import net.java.games.input.RawInputEnvironmentPlugin;
import net.java.games.input.ak;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.t;

public class aj
extends t {
    private RawInputEnvironmentPlugin d;
    private ak e = new ak();
    private q[] f = null;

    public aj() {
        this.d = new RawInputEnvironmentPlugin();
    }

    public q[] a() {
        if (this.f == null) {
            int n2;
            boolean bl2 = false;
            boolean bl3 = false;
            ArrayList<q> arrayList = new ArrayList<q>();
            q[] arrq = this.e.a();
            q[] arrq2 = this.d.a();
            for (n2 = 0; n2 < arrq2.length; ++n2) {
                arrayList.add(arrq2[n2]);
                if (arrq2[n2].h() == s.c) {
                    bl2 = true;
                    continue;
                }
                if (arrq2[n2].h() != s.b) continue;
                bl3 = true;
            }
            for (n2 = 0; n2 < arrq.length; ++n2) {
                if (arrq[n2].h() == s.c) {
                    if (bl2) continue;
                    arrayList.add(arrq[n2]);
                    continue;
                }
                if (arrq[n2].h() == s.b) {
                    if (bl3) continue;
                    arrayList.add(arrq[n2]);
                    continue;
                }
                arrayList.add(arrq[n2]);
            }
            this.f = arrayList.toArray(new q[0]);
        }
        return this.f;
    }

    public boolean b() {
        return this.d.b() || this.e.b();
    }
}

