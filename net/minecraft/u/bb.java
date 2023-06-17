/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.aad;
import com.a.a.d.hi;
import com.a.b.ac;
import com.a.b.t;
import com.a.b.w;
import java.util.Collection;
import java.util.Set;
import net.minecraft.u.aq;

public class bb
extends hi
implements aq {
    private final Set a = aad.a();

    @Override
    public void a(w w2) {
        if (w2.p()) {
            for (w w3 : w2.u()) {
                this.add(w3.d());
            }
        }
    }

    @Override
    public w c() {
        t t2 = new t();
        for (String string : this) {
            t2.a(new ac(string));
        }
        return t2;
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }
}

