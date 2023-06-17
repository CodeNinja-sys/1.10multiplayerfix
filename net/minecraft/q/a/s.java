/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.k.p;
import net.minecraft.q.a.d;

class s
implements p {
    final /* synthetic */ d a;

    s(d d2) {
        this.a = d2;
    }

    public String a() {
        String string = "Unknown?";
        try {
            switch (d.j(this.a)) {
                case 19132: {
                    string = "McRegion";
                    break;
                }
                case 19133: {
                    string = "Anvil";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format("0x%05X - %s", d.j(this.a), string);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

